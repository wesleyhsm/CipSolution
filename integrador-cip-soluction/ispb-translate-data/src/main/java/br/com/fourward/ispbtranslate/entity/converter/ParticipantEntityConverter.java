package br.com.fourward.ispbtranslate.entity.converter;

import org.springframework.stereotype.Component;

import br.com.fourward.cip.canonical.BankIspbTranslateCanonical;
import br.com.fourward.ispbtranslate.entity.ParticipantEntity;
import br.com.fourward.ispbtranslate.entity.builder.ParticipantBuilder;

@Component
public class ParticipantEntityConverter {

	public ParticipantEntity convert(final Long id) {

		return ParticipantBuilder 
				.create() 
				.setParticipantId(id) 
				.build();
	}
	
	public ParticipantEntity convertBankIspbTranslate(final BankIspbTranslateCanonical bankIspbTranslateCanonical) {

		return ParticipantBuilder 
				.create() 
				.setBankCode(bankIspbTranslateCanonical.getBankCode()) 
				.setIspb(bankIspbTranslateCanonical.getIspb()) 
				.build();
	}
}
