package br.com.fourward.ispbtranslate.busines;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fourward.cip.canonical.BankIspbTranslateCanonical;
import br.com.fourward.ispbtranslate.entity.ParticipantEntity;
import br.com.fourward.ispbtranslate.entity.converter.BankIspbTranslateCanonicalConverter;
import br.com.fourward.ispbtranslate.entity.converter.ParticipantEntityConverter;
import br.com.fourward.ispbtranslate.exception.DataNotFoundException;
import br.com.fourward.ispbtranslate.exception.ParticipantNotFoundException;
import br.com.fourward.ispbtranslate.repository.ParticipantRepository;

@Service
public class BankIspbTranslateBusiness implements Serializable {

	private static final long serialVersionUID = 4933486538953317317L;

	@Autowired
	private ParticipantRepository participantRepository;

	@Autowired
	private ParticipantEntityConverter participantEntityConverter;

	@Autowired
	private BankIspbTranslateCanonicalConverter bankIspbTranslateCanonicalConverter;

	public BankIspbTranslateBusiness() {

	}

	public BankIspbTranslateBusiness(final ParticipantEntityConverter participantEntityConverter,
			final BankIspbTranslateCanonicalConverter bankIspbTranslateCanonicalConverter,
			final ParticipantRepository participantRepository) {
		
		this.participantEntityConverter = participantEntityConverter;
		this.bankIspbTranslateCanonicalConverter = bankIspbTranslateCanonicalConverter;
		this.participantRepository = participantRepository;
	}

	public BankIspbTranslateCanonical translateBankCodeIspb(final BankIspbTranslateCanonical bankIspbTranslateCanonicalParameter) {

		final ParticipantEntity participantEntityParameter = participantEntityConverter
				.convertBankIspbTranslate(bankIspbTranslateCanonicalParameter);
		
		final ParticipantEntity participantEntityResult = searchParticipantEntity(participantEntityParameter);
		
		if(participantEntityResult != null) {
			return bankIspbTranslateCanonicalConverter.convertBankIspbTranslate(participantEntityResult);
		}else {
			throw new ParticipantNotFoundException(bankIspbTranslateCanonicalParameter);
		}
	}

	public ParticipantEntity searchParticipantEntity(final ParticipantEntity participantEntity) {
		final ParticipantEntity participantEntityResult = participantRepository.findByBankCodeOrIspb(participantEntity.getBankCode(), participantEntity.getIspb());
		 
		 Optional
		 	.ofNullable(participantEntityResult)
		 		.orElseThrow(()
		 			->new DataNotFoundException("BankCode= " + participantEntity.getBankCode() + " Not Found!"));
		 
		 return participantEntityResult;
	}
}
