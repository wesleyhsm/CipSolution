package br.com.fourward.ispbtranslate.client;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import br.com.fourward.cip.canonical.BankIspbTranslateCanonical;
import br.com.fourward.ispbtranslate.dto.BankIspbTranslateResponseDto;
import br.com.fourward.ispbtranslate.dto.converter.BankIspbTranslateClientCanonicalConverter;
import br.com.fourward.ispbtranslate.exception.ParticipantNotFoundException;

@Component
public class BankIspbTranslateClient {

	@Autowired
	private BankIspbTranslateClientCanonicalConverter bankIspbTranslateClientCanonicalConverter;

	@Value("${bank-ispb-translate.url:http://localhost:8080/v1/bank-ispb-translate/")
	private String url;

	@Value("${bank-ispb-translate.pathTranslateBankCode:bank-code/{bankCode}}")
	private String urlSearchBankCode;

	@Value("${bank-ispb-translate.pathTranslateIspb:ispb/{ispb}}")
	private String urlSearchIspb;

	public BankIspbTranslateClient() {
	}

	public BankIspbTranslateClient(final String url, final String urlSearchBankCode, final String urlSearchIspb,
			final BankIspbTranslateClientCanonicalConverter bankIspbTranslateClientCanonicalConverter) {
		this.url = url;
		this.urlSearchBankCode = urlSearchBankCode;
		this.urlSearchIspb = urlSearchIspb;
		this.bankIspbTranslateClientCanonicalConverter = bankIspbTranslateClientCanonicalConverter;
	}

	public BankIspbTranslateCanonical searchBankCode(final String bankCode) {
		final HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		final RequestEntity<String> requestEntity = new RequestEntity<String>(headers, HttpMethod.GET,
				URI.create(url + urlSearchBankCode.replace("{bankCode}", bankCode)));

		final RestTemplate restTemplate = new RestTemplate();

		final ResponseEntity<BankIspbTranslateResponseDto> responseEntity = restTemplate.exchange(
				url + urlSearchBankCode.replace("{bankCode}", bankCode), HttpMethod.GET, requestEntity,
				BankIspbTranslateResponseDto.class);
		
		final BankIspbTranslateResponseDto bankIspbTranslateResponseDto = responseEntity.getBody();

		if(bankIspbTranslateResponseDto.getBankIspbTranslateCanonical() != null) {
			return bankIspbTranslateClientCanonicalConverter.convert(bankIspbTranslateResponseDto);
		}
		
		throw new ParticipantNotFoundException(bankCode);	
	}

	public BankIspbTranslateCanonical searchIspb(final String ispb) {
		final HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		final RequestEntity<String> requestEntity = new RequestEntity<String>(headers, HttpMethod.GET,
				URI.create(url + urlSearchIspb.replace("{ispb}", ispb)));

		final RestTemplate restTemplate = new RestTemplate();

		final ResponseEntity<BankIspbTranslateResponseDto> responseEntity = restTemplate.exchange(
				url + urlSearchIspb.replace("{ispb}", ispb), HttpMethod.GET, requestEntity,
				BankIspbTranslateResponseDto.class);
		final BankIspbTranslateResponseDto bankIspbTranslateResponseDto = responseEntity.getBody();
				
		if(bankIspbTranslateResponseDto.getBankIspbTranslateCanonical() != null) {
			return bankIspbTranslateClientCanonicalConverter.convert(bankIspbTranslateResponseDto);
		}
		
		throw new ParticipantNotFoundException(ispb);		
	}
}
