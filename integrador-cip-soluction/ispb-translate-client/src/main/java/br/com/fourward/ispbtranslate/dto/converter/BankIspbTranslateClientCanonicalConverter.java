package br.com.fourward.ispbtranslate.dto.converter;

import org.springframework.stereotype.Component;

import br.com.fourward.cip.canonical.BankIspbTranslateCanonical;
import br.com.fourward.cip.canonical.builder.BankIspbTranslateCanonicalBuilder;
import br.com.fourward.ispbtranslate.dto.BankIspbTranslateResponseDto;

@Component
public class BankIspbTranslateClientCanonicalConverter {

	public BankIspbTranslateCanonical convert(final BankIspbTranslateResponseDto bankIspbTranslateResponseDto) {

		return BankIspbTranslateCanonicalBuilder 
				.create() 
				.setBankCode(bankIspbTranslateResponseDto.getBankIspbTranslateCanonical().getBankCode()) 
				.setIspb(bankIspbTranslateResponseDto.getBankIspbTranslateCanonical().getIspb()) 
				.build();
	}
}
