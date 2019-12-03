package br.com.fourward.ispbtranslate.canonical.converter;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import br.com.fourward.cip.canonical.BankIspbTranslateCanonical;
import br.com.fourward.cip.canonical.builder.BankIspbTranslateCanonicalBuilder;
import br.com.fourward.ispbtranslate.entity.ParticipantEntity;
import br.com.fourward.ispbtranslate.entity.builder.ParticipantBuilder;
import br.com.fourward.ispbtranslate.entity.converter.BankIspbTranslateCanonicalConverter;

@RunWith(MockitoJUnitRunner.class)
public class BankIspbTranslateCanonicalConverterTest {
		
	@InjectMocks
	private BankIspbTranslateCanonicalConverter bankIspbTranslateCanonicalConverter; 
	
	private BankIspbTranslateCanonical expectedBankIspbTranslateCanonical = createBankIspbTranslateCanonical();
	
	@Test
	public void test() {		
		final ParticipantEntity participantEntity = createParticipantEntity();
		
		final BankIspbTranslateCanonical bankIspbTranslateCanonicalResult = bankIspbTranslateCanonicalConverter
				.convertBankIspbTranslate(participantEntity);
				
		Assert.assertEquals(expectedBankIspbTranslateCanonical, bankIspbTranslateCanonicalResult);
	}
	
	private ParticipantEntity createParticipantEntity() {

		return ParticipantBuilder
				.create()
					.setParticipantId(1L)
					.setName("teste")
					.setBankCode("123")
					.setIspb("12345678")
				.build();
	}
	
	private BankIspbTranslateCanonical createBankIspbTranslateCanonical(){
		
		return BankIspbTranslateCanonicalBuilder
				.create()
					.setBankCode("123")
					.setIspb("12345678")
				.build();
	}
}
