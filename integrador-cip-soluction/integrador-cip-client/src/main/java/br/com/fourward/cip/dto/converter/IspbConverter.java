package br.com.fourward.cip.dto.converter;

import org.springframework.stereotype.Component;

import br.com.fourward.cip.canonical.BankIspbTranslateCanonical;
import br.com.fourward.ispbtranslate.client.BankIspbTranslateClient;
import br.com.fourward.ispbtranslate.dto.converter.BankIspbTranslateClientCanonicalConverter;

@Component
public class IspbConverter {

	private BankIspbTranslateClient bankIspbTranslateClient = new BankIspbTranslateClient("http://localhost:8080",
			"/v1/bank-ispb-translate/bank-code/{bankCode}", "/v1/bank-ispb-translate/ispb/{ispb}",
			new BankIspbTranslateClientCanonicalConverter());
	
	public BankIspbTranslateCanonical converterBankCode(final String bankCode){		
		
		final BankIspbTranslateCanonical bankIspbTranslateCanonical = bankIspbTranslateClient.searchBankCode(bankCode);
		
		return bankIspbTranslateCanonical;		
	}
	
	public BankIspbTranslateCanonical converterIspb(final String ispb){		
		
		final BankIspbTranslateCanonical bankIspbTranslateCanonical = bankIspbTranslateClient.searchIspb(ispb);
		
		return bankIspbTranslateCanonical;		
	}
}
