package br.com.fourward.ispbtranslate.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.fourward.cip.canonical.BankIspbTranslateCanonical;
import br.com.fourward.ispbtranslate.busines.BankIspbTranslateBusiness;
import br.com.fourward.ispbtranslate.dto.BankIspbTranslateResponseDto;
import br.com.fourward.ispbtranslate.dto.converter.BankIspbTranslateConverter;
import br.com.fourward.logger.Logger;

@RestController
@RequestMapping("/v1/bank-ispb-translate")
@Logger
public class BankIspbTranslate {

	@Autowired
	private BankIspbTranslateBusiness bankIspbTranslateBusiness;

	@Autowired
	private BankIspbTranslateConverter bankIspbTranslateConverter;
	
	@CrossOrigin
	@RequestMapping(value = "/bank-code/{bankCode}", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE })
	public BankIspbTranslateResponseDto searchBankCode(@Valid @PathVariable("bankCode") final String bankCode) {
		final BankIspbTranslateCanonical bankIspbTranslateCanonicalParameter = bankIspbTranslateConverter.convertBankCode(bankCode);
		final BankIspbTranslateCanonical bankIspbTranslateCanonicalResult = bankIspbTranslateBusiness.translateBankCodeIspb(bankIspbTranslateCanonicalParameter);
		return BankIspbTranslateResponseDto.create(0, "OK", bankIspbTranslateCanonicalResult);
	}

	@CrossOrigin
	@RequestMapping(value = "/ispb/{ispb}", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE })
	public BankIspbTranslateResponseDto searchIspb(@Valid @PathVariable("ispb") final String ispb) {
		
		final BankIspbTranslateCanonical bankIspbTranslateCanonical = bankIspbTranslateBusiness.translateBankCodeIspb(bankIspbTranslateConverter.convertIspb(ispb));
		return BankIspbTranslateResponseDto.create(0, "OK", bankIspbTranslateCanonical);
	}
}
