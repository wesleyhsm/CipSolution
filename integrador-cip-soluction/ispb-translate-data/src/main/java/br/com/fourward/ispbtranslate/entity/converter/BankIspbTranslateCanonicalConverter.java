package br.com.fourward.ispbtranslate.entity.converter;

import org.springframework.stereotype.Component;

import br.com.fourward.cip.canonical.BankIspbTranslateCanonical;
import br.com.fourward.cip.canonical.builder.BankIspbTranslateCanonicalBuilder;
import br.com.fourward.ispbtranslate.entity.ParticipantEntity;

@Component
public class BankIspbTranslateCanonicalConverter {

	public BankIspbTranslateCanonical convertBankIspbTranslate(final ParticipantEntity participantEntity) {

		return BankIspbTranslateCanonicalBuilder 
				.create() 
				.setBankCode(participantEntity.getBankCode()) 
				.setIspb(participantEntity.getIspb()) 
				.build();
	}
}