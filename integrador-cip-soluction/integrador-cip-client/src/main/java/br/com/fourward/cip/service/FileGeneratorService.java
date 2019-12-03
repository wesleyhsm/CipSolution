
package br.com.fourward.cip.service;

import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.fourward.cip.canonical.PaymentFileGeneratorCanonical;
import br.com.fourward.cip.canonical.PaymentGeneratorCanonical;
import br.com.fourward.cip.dateformat.CreateFormatDate;
import br.com.fourward.cip.dto.converter.PaymentFileGeneratorConverter;
import br.com.fourward.cip.entity.NumberFileEntity;
import br.com.fourward.cip.entity.PaymentEntity;
import br.com.fourward.cip.entity.StatusEntity;
import br.com.fourward.cip.entity.StatusTypeEntity;
import br.com.fourward.cip.entity.builder.NumberFileEntityBuilder;
import br.com.fourward.cip.entity.builder.StatusBuilder;
import br.com.fourward.cip.repository.NumberFileRepository;
import br.com.fourward.cip.repository.PaymentRepository;
import br.com.fourward.cip.rules.CreateFileUTF8;
import br.com.fourward.cip.rules.CreateFolderFileRules;
import br.com.fourward.cip.rules.GeneratorFileNameRules;
import br.com.fourward.cip.rules.builder.GeneratorFileNameRulesBuilder;
import br.com.fourward.cip.xml.rtm.send.AslcDocSend;
import br.com.fourward.cip.xml.rtm.send.TipoArquivo;
import br.com.fourward.cip.xml.rtm.send.converter.AslcDocSendConverter;

@Service
public class FileGeneratorService {

	@Autowired
	private PaymentRepository paymentRepository;

	@Autowired
	private AslcDocSendConverter aslcDocSendConverter;

	@Autowired
	private CreateFormatDate createFormatDate;

	@Autowired
	private CreateFolderFileRules createFolderFileRules;

	@Autowired
	private CreateFileUTF8 createFileUTF8;

	@Autowired
	private NumberFileRepository numberFileRepository;

	@Autowired
	private PaymentFileGeneratorConverter paymentFileGeneratorConverter;

	@Scheduled(fixedDelay = 50000)
	public void executeCreateFilePayment() {
		try {
			createFolderFileRules.createFolderSendReturn();
			verifyAndCreateCipFiles();
		} catch (final Exception e) {
			e.printStackTrace();
		}
	}

	private void verifyAndCreateCipFiles() throws IOException {
		final Pageable pageable = new PageRequest(0, 10);

		final Page<PaymentEntity> pageCredit = searchPaymentCredit(pageable);
		executePageCredit(pageCredit, pageable);

		final Page<PaymentEntity> pageDebit = searchPaymentDebit(pageable);
		executePageDebit(pageDebit, pageable);

		final Page<PaymentEntity> pageAntecipation = searchPaymentAntecipation(pageable);
		executePageAntecipation(pageAntecipation, pageable);
	}

	private void executePageCredit(Page<PaymentEntity> page, Pageable pageable) throws IOException {
		createCreditFile(page.getContent());

		while (page.hasNext()) {
			final Pageable nextPageable = nextPageable(pageable);
			final Page<PaymentEntity> nextPage = searchPaymentCredit(pageable);
			pageable = nextPageable;
			page = nextPage;

			final List<PaymentEntity> pages = page.getContent();
			createCreditFile(pages);
		}
	}

	private void executePageDebit(Page<PaymentEntity> page, Pageable pageable) throws IOException {
		createDebitFile(page.getContent());

		while (page.hasNext()) {
			final Pageable nextPageable = nextPageable(pageable);
			final Page<PaymentEntity> nextPage = searchPaymentCredit(pageable);
			pageable = nextPageable;
			page = nextPage;

			final List<PaymentEntity> pages = page.getContent();
			createDebitFile(pages);
		}
	}

	private void executePageAntecipation(Page<PaymentEntity> page, Pageable pageable) throws IOException {
		createAntecipationFile(page.getContent());

		while (page.hasNext()) {
			final Pageable nextPageable = nextPageable(pageable);
			final Page<PaymentEntity> nextPage = searchPaymentCredit(pageable);
			pageable = nextPageable;
			page = nextPage;

			final List<PaymentEntity> pages = page.getContent();
			createAntecipationFile(pages);
		}
	}

	private void createCreditFile(final List<PaymentEntity> paymentEntitys) throws IOException {
		createFile(paymentEntitys, TipoArquivo.Credit.getValue());
	}

	private void createDebitFile(final List<PaymentEntity> paymentEntitys) throws IOException {
		createFile(paymentEntitys, TipoArquivo.Debit.getValue());
	}

	private void createAntecipationFile(final List<PaymentEntity> paymentEntitys) throws IOException {
		createFile(paymentEntitys, TipoArquivo.Antecipation.getValue());
	}

	private <T> void createFile(final List<PaymentEntity> paymentEntitys, final String registerTypeValue)
			throws IOException {

		final PaymentFileGeneratorCanonical paymentFileGeneratorCanonical =
				checksPaymentData(paymentEntitys, registerTypeValue);

		final AslcDocSend aslcDocSend = aslcDocSendConverter.converter(paymentFileGeneratorCanonical);

		createFileUTF8.createFile(aslcDocSend,
				paymentFileGeneratorCanonical.getGeneratorFileNameRulesCanonical().getFileName());
	}

	private PaymentFileGeneratorCanonical checksPaymentData(final List<PaymentEntity> paymentEntitys,
			final String registerTypeValue) {

		final GeneratorFileNameRules generatorFileNameRules = GeneratorFileNameRulesBuilder.create()
				.setSystemDate(createFormatDate.getDateNowFormatedDtRef())
				.setFileType(registerTypeValue)
				.setSequenceNumber(newNumberRegister())
				.build();

		final PaymentFileGeneratorCanonical paymentFileGeneratorCanonical =
				paymentFileGeneratorConverter.converter(paymentEntitys, generatorFileNameRules);
		updateStatusPayment(paymentFileGeneratorCanonical, StatusTypeEntity.Processing);

		return paymentFileGeneratorCanonical;
	}

	@Transactional
	private void updateStatusPayment(final PaymentFileGeneratorCanonical paymentFileGeneratorCanonical,
			final StatusTypeEntity statusTypeEntity) {

		final String nameFile = paymentFileGeneratorCanonical.getGeneratorFileNameRulesCanonical().getFileName();

		final List<PaymentGeneratorCanonical> paymentGeneratorCanonicals =
				paymentFileGeneratorCanonical.getPaymentGeneratorCanonical();

		paymentGeneratorCanonicals.forEach(paymentGeneratorCanonical -> {
			final Long id = paymentGeneratorCanonical.getPaymentFileCanonical().getId();
			final PaymentEntity paymentEntity = paymentRepository.findId(id);
			paymentEntity.setNameFile(nameFile);

			final StatusEntity statusEntity = StatusBuilder.create()
					.setDate(new Date())
					.setStatusType(statusTypeEntity)
					.setPayment(paymentEntity)
					.build();

			paymentEntity.setStatusEntitys(Arrays.asList(statusEntity));

			paymentRepository.save(paymentEntity);
		});
	}

	private Pageable nextPageable(final Pageable pageable) {
		return new PageRequest(pageable.getPageNumber() + 1, pageable.getPageSize());
	}

	private Page<PaymentEntity> searchPaymentCredit(final Pageable pageRequest) {
		return paymentRepository.findCredit(pageRequest);
	}

	private Page<PaymentEntity> searchPaymentDebit(final Pageable pageRequest) {
		return paymentRepository.findDebit(pageRequest);
	}

	private Page<PaymentEntity> searchPaymentAntecipation(final Pageable pageRequest) {
		return paymentRepository.findAntecipation(pageRequest);
	}

	private String newNumberRegister() {
		final NumberFileEntity numberFileEntity = numberFileRepository.findByMaxNumberFileGeneration();

		Long numberControl = 1L;
		if ((numberFileEntity != null) && (numberFileEntity.getNumberFileGeneration() > 99999)) {
			deleteAllNumberRegister();
		} else if ((numberFileEntity != null) && (numberFileEntity.getNumberFileGeneration() <= 99999)) {
			numberControl = (numberFileEntity.getNumberFileGeneration() + numberControl);
		}

		saveNextNumberRegister(numberControl);

		return numberControl.toString();
	}

	private void saveNextNumberRegister(final Long numberRegister) {

		final NumberFileEntity numberFileEntity =
				NumberFileEntityBuilder.create().setNumberFileGeneration(numberRegister).setDate(new Date()).build();

		numberFileRepository.save(numberFileEntity);
	}

	private void deleteAllNumberRegister() {
		numberFileRepository.deleteAll();
	}
}
