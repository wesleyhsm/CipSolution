package br.com.fourward.ispbtranslate.business;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import br.com.fourward.cip.canonical.BankIspbTranslateCanonical;
import br.com.fourward.cip.canonical.builder.BankIspbTranslateCanonicalBuilder;
import br.com.fourward.ispbtranslate.busines.BankIspbTranslateBusiness;
import br.com.fourward.ispbtranslate.entity.ParticipantEntity;
import br.com.fourward.ispbtranslate.entity.builder.ParticipantBuilder;
import br.com.fourward.ispbtranslate.entity.converter.BankIspbTranslateCanonicalConverter;
import br.com.fourward.ispbtranslate.entity.converter.ParticipantEntityConverter;
import br.com.fourward.ispbtranslate.repository.ParticipantRepository;

@RunWith(MockitoJUnitRunner.class)
public class BankIspbTranslateBusinessTest {

	private BankIspbTranslateBusiness bankIspbTranslateBusiness;

	@Mock
	private ParticipantRepository participantRepository;

	@Mock
	private ParticipantEntityConverter participantEntityConverter;

	@Mock
	private BankIspbTranslateCanonicalConverter bankIspbTranslateCanonicalConverter;

	@Before
	public void setupMock() {
		MockitoAnnotations.initMocks(this);
		bankIspbTranslateBusiness = new BankIspbTranslateBusiness(participantEntityConverter,
				bankIspbTranslateCanonicalConverter, participantRepository);
	}

	@Test
	public void testIspb() {

		final BankIspbTranslateCanonical bankIspbTranslateCanonical = createBankIspbTranslateCanonical();
		final ParticipantEntity participantEntityParameter = createParticipantEntity();

		Mockito.when(participantEntityConverter.convertBankIspbTranslate(bankIspbTranslateCanonical))
				.thenReturn(participantEntityParameter);

		final ParticipantEntity participantEntityResult = createParticipantEntityResult();
		Mockito.when(participantRepository.findByBankCodeOrIspb(participantEntityParameter.getBankCode(),
				participantEntityParameter.getIspb())).thenReturn(participantEntityResult);

		final BankIspbTranslateCanonical bankIspbTranslateCanonicalResult = createBankIspbTranslateCanonicalResult();
		Mockito.when(bankIspbTranslateCanonicalConverter.convertBankIspbTranslate(participantEntityResult))
				.thenReturn(bankIspbTranslateCanonicalResult);

		final BankIspbTranslateCanonical bankIspbTranslateCanonicalActual = bankIspbTranslateBusiness
				.translateBankCodeIspb(createBankIspbTranslateCanonical());

		Assert.assertEquals("12345678", bankIspbTranslateCanonicalActual.getIspb());
	}

	@Test
	public void testBankCode() {

		final BankIspbTranslateCanonical bankIspbTranslateCanonical = createBankIspbTranslateCanonical();
		final ParticipantEntity participantEntityParameter = createParticipantEntity();

		Mockito.when(participantEntityConverter.convertBankIspbTranslate(bankIspbTranslateCanonical))
				.thenReturn(participantEntityParameter);

		final ParticipantEntity participantEntityResult = createParticipantEntityResult();
		Mockito.when(participantRepository.findByBankCodeOrIspb(participantEntityParameter.getBankCode(),
				participantEntityParameter.getIspb())).thenReturn(participantEntityResult);

		final BankIspbTranslateCanonical bankIspbTranslateCanonicalResult = createBankIspbTranslateCanonicalResult();
		Mockito.when(bankIspbTranslateCanonicalConverter.convertBankIspbTranslate(participantEntityResult))
				.thenReturn(bankIspbTranslateCanonicalResult);

		final BankIspbTranslateCanonical bankIspbTranslateCanonicalActual = bankIspbTranslateBusiness
				.translateBankCodeIspb(createBankIspbTranslateCanonical());

		Assert.assertEquals("123", bankIspbTranslateCanonicalActual.getBankCode());
	}

	private BankIspbTranslateCanonical createBankIspbTranslateCanonicalResult() {
		return BankIspbTranslateCanonicalBuilder
				.create()
					.setBankCode("123")
					.setIspb("12345678")
				.build();
	}

	private ParticipantEntity createParticipantEntityResult() {
		return ParticipantBuilder
				.create()
					.setIspb("12345678")
					.setBankCode("123")
				.build();
	}

	private BankIspbTranslateCanonical createBankIspbTranslateCanonical() {
		return BankIspbTranslateCanonicalBuilder
				.create()
					.setBankCode("123")
				.build();
	}

	private ParticipantEntity createParticipantEntity() {
		return ParticipantBuilder
				.create()
					.setParticipantId(1L)
					.setBankCode("123")
					.setIspb("12345678")
				.build();
	}
}
