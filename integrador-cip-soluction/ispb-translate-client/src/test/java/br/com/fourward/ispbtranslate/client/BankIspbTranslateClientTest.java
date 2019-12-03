package br.com.fourward.ispbtranslate.client;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import br.com.fourward.cip.canonical.BankIspbTranslateCanonical;
import br.com.fourward.ispbtranslate.dto.converter.BankIspbTranslateClientCanonicalConverter;

@RunWith(MockitoJUnitRunner.class)
public class BankIspbTranslateClientTest {

	private BankIspbTranslateClient bankIspbTranslateClient = new BankIspbTranslateClient("http://localhost:8080",
			"/v1/bank-ispb-translate/bank-code/{bankCode}", "/v1/bank-ispb-translate/ispb/{ispb}",
			new BankIspbTranslateClientCanonicalConverter());

	@Test
	public void testSearchBankCode() {
		final BankIspbTranslateCanonical bankIspbTranslateCanonical = bankIspbTranslateClient.searchBankCode("104");		
		final String ispb = bankIspbTranslateCanonical.getIspb();
		final String bankCode = bankIspbTranslateCanonical.getBankCode();
		
		System.out.println("BankCode: " + bankCode + " ISPB: " + ispb);		
		Assert.assertEquals("00360305", ispb);
	}

	@Test(expected = RuntimeException.class)
	public void testSearchBankCodeNotFound() {
		bankIspbTranslateClient.searchBankCode("999");			
	}

	@Test
	public void testSearchIspb() {		
		final BankIspbTranslateCanonical bankIspbTranslateCanonical = bankIspbTranslateClient.searchIspb("92874270");		
		final String ispb = bankIspbTranslateCanonical.getIspb();
		final String bankCode = bankIspbTranslateCanonical.getBankCode();
		
		System.out.println("BankCode: " + bankCode + " ISPB: " + ispb);		
		Assert.assertEquals("654", bankCode);
	}

	@Test(expected = RuntimeException.class)
	public void testSearchIspbNotFound() {
		bankIspbTranslateClient.searchIspb("99999999");
	}
}
