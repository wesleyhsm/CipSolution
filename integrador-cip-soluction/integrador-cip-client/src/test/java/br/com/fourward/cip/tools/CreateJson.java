package br.com.fourward.cip.tools;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.fourward.cip.canonical.AccountTypeCanonical;
import br.com.fourward.cip.dto.AcquirerDto;
import br.com.fourward.cip.dto.BankAccountDto;
import br.com.fourward.cip.dto.BrandDto;
import br.com.fourward.cip.dto.DocumentDto;
import br.com.fourward.cip.dto.DocumentTypeDto;
import br.com.fourward.cip.dto.OperationTypeDto;
import br.com.fourward.cip.dto.PaymentRequestDto;
import br.com.fourward.cip.dto.PaymentSummaryDto;
import br.com.fourward.cip.dto.PointOfSaleDto;
import br.com.fourward.cip.dto.ProductTypeDto;
import br.com.fourward.cip.dto.SubAcquirerDto;

public class CreateJson {

	@Test
	public void create() throws JsonProcessingException {
		final ObjectMapper objectMapper = new ObjectMapper();
		final String json = objectMapper.writeValueAsString(getPaymentSummaryDto());
		System.out.println(json);
	}

	private PaymentRequestDto getPaymentSummaryDto() {

		/* ANTECIPAÇÃO *******************************************************/
		final DocumentDto document1 = new DocumentDto();
		document1.setValue("05817126419");
		document1.setType(DocumentTypeDto.CPF);

		final BankAccountDto bankAccount1 = new BankAccountDto();
		bankAccount1.setBankCode("030");
		bankAccount1.setAgency("1234");
		bankAccount1.setChecking("12345");
		bankAccount1.setAccountTypeCanonical(AccountTypeCanonical.SavingsAccount);

		final PointOfSaleDto pointOfSaleDto = new PointOfSaleDto();
		pointOfSaleDto.setName("subadquirente teste");
		pointOfSaleDto.setBankAccount(bankAccount1);
		pointOfSaleDto.setDocument(document1);

		final DocumentDto document2 = new DocumentDto();
		document2.setValue("05817126419");
		document2.setType(DocumentTypeDto.CPF);

		final BankAccountDto bankAccount2 = new BankAccountDto();
		bankAccount2.setBankCode("654");
		bankAccount2.setAgency("1234");
		bankAccount2.setChecking("12345");
		bankAccount2.setAccountTypeCanonical(AccountTypeCanonical.CheckingAccount);

		SubAcquirerDto subacquirer = new SubAcquirerDto();
		subacquirer.setBankAccount(bankAccount2);
		subacquirer.setName("nome da fourward");
		subacquirer.setDocument(document2);

		final PaymentSummaryDto paymentSummaryDto = new PaymentSummaryDto();
		paymentSummaryDto.setAcquirer(AcquirerDto.GlobalPayments);
		paymentSummaryDto.setAmount(BigDecimal.valueOf(10.87d));
		paymentSummaryDto.setBrand(BrandDto.Visa);
		paymentSummaryDto.setProductType(ProductTypeDto.Antecipation);
		paymentSummaryDto.setOperationType(OperationTypeDto.Adjustment);
		paymentSummaryDto.setDate(new Date());
		paymentSummaryDto.setExternalKey("9999111");
		paymentSummaryDto.setSubacquirer(subacquirer);
		paymentSummaryDto.setPointOfSale(pointOfSaleDto);

		/* CREDITO *******************************************************/
		final DocumentDto document3 = new DocumentDto();
		document3.setValue("05817126419");
		document3.setType(DocumentTypeDto.CPF);

		final BankAccountDto bankAccount3 = new BankAccountDto();
		bankAccount3.setBankCode("654");
		bankAccount3.setAgency("1234");
		bankAccount3.setChecking("12345");
		bankAccount3.setAccountTypeCanonical(AccountTypeCanonical.CheckingAccount);

		final PointOfSaleDto pointOfSaleDto1 = new PointOfSaleDto();
		pointOfSaleDto1.setName("subadquirente wesley");
		pointOfSaleDto1.setBankAccount(bankAccount3);
		pointOfSaleDto1.setDocument(document3);

		final DocumentDto document4 = new DocumentDto();
		document4.setValue("05817126419");
		document4.setType(DocumentTypeDto.CPF);

		final BankAccountDto bankAccount4 = new BankAccountDto();
		bankAccount4.setBankCode("654");
		bankAccount4.setAgency("1234");
		bankAccount4.setChecking("12345");
		bankAccount4.setAccountTypeCanonical(AccountTypeCanonical.SavingsAccount);

		SubAcquirerDto subacquirer1 = new SubAcquirerDto();
		subacquirer1.setBankAccount(bankAccount4);
		subacquirer1.setName("nome da wesley");
		subacquirer1.setDocument(document4);

		final PaymentSummaryDto paymentSummaryDto2 = new PaymentSummaryDto();
		paymentSummaryDto2.setAcquirer(AcquirerDto.GlobalPayments);
		paymentSummaryDto2.setAmount(BigDecimal.valueOf(10.45d));
		paymentSummaryDto2.setBrand(BrandDto.Visa);
		paymentSummaryDto2.setProductType(ProductTypeDto.Credit);
		paymentSummaryDto2.setOperationType(OperationTypeDto.Card);
		paymentSummaryDto2.setDate(new Date());
		paymentSummaryDto2.setExternalKey("11");
		paymentSummaryDto2.setSubacquirer(subacquirer1);
		paymentSummaryDto2.setPointOfSale(pointOfSaleDto1);

		/* DEBITO *******************************************************/
		final DocumentDto document6 = new DocumentDto();
		document6.setValue("05817126419");
		document6.setType(DocumentTypeDto.CPF);

		final BankAccountDto bankAccount6 = new BankAccountDto();
		bankAccount6.setBankCode("654");
		bankAccount6.setAgency("1234");
		bankAccount6.setChecking("12345");
		bankAccount6.setAccountTypeCanonical(AccountTypeCanonical.SavingsAccount);

		final PointOfSaleDto pointOfSaleDto6 = new PointOfSaleDto();
		pointOfSaleDto6.setName("subadquirente wesley");
		pointOfSaleDto6.setBankAccount(bankAccount6);
		pointOfSaleDto6.setDocument(document6);

		final DocumentDto document7 = new DocumentDto();
		document7.setValue("05817126419");
		document7.setType(DocumentTypeDto.CPF);

		final BankAccountDto bankAccount7 = new BankAccountDto();
		bankAccount7.setBankCode("654");
		bankAccount7.setAgency("1234");
		bankAccount7.setChecking("12345");
		bankAccount7.setAccountTypeCanonical(AccountTypeCanonical.SavingsAccount);

		SubAcquirerDto subacquirer6 = new SubAcquirerDto();
		subacquirer6.setBankAccount(bankAccount7);
		subacquirer6.setName("nome da wesley");
		subacquirer6.setDocument(document4);

		final PaymentSummaryDto paymentSummaryDto6 = new PaymentSummaryDto();
		paymentSummaryDto6.setAcquirer(AcquirerDto.GlobalPayments);
		paymentSummaryDto6.setAmount(BigDecimal.valueOf(10.45d));
		paymentSummaryDto6.setBrand(BrandDto.Visa);
		paymentSummaryDto6.setProductType(ProductTypeDto.Debit);
		paymentSummaryDto6.setOperationType(OperationTypeDto.Card);
		paymentSummaryDto6.setDate(new Date());
		paymentSummaryDto6.setExternalKey("11");
		paymentSummaryDto6.setSubacquirer(subacquirer6);
		paymentSummaryDto6.setPointOfSale(pointOfSaleDto6);

		return new PaymentRequestDto(Arrays.asList(paymentSummaryDto, paymentSummaryDto2, paymentSummaryDto6));
	}

}
