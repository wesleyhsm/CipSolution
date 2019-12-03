package br.com.fourward.cip.entity.converter;

import org.springframework.stereotype.Component;

import br.com.fourward.cip.canonical.BankIspbTranslateCanonical;
import br.com.fourward.cip.canonical.builder.BankIspbTranslateCanonicalBuilder;

@Component
public class BankIspbTranslateConverter {

	public BankIspbTranslateCanonical convertBankCode(final String bankCode) {

		return BankIspbTranslateCanonicalBuilder 
				.create() 
				.setBankCode(bankCode) 
				.build();
	}

	public BankIspbTranslateCanonical convertIspb(final String ispb) {

		return BankIspbTranslateCanonicalBuilder 
				.create() 
				.setIspb(ispb) 
				.build();
	}
}
