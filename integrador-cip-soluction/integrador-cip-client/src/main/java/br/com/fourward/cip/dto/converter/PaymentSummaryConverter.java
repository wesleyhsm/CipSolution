package br.com.fourward.cip.dto.converter;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.stereotype.Component;

import br.com.fourward.cip.canonical.AcquirerCanonical;
import br.com.fourward.cip.canonical.BankAccountCanonical;
import br.com.fourward.cip.canonical.BrandCanonical;
import br.com.fourward.cip.canonical.DocumentCanonical;
import br.com.fourward.cip.canonical.DocumentTypeCanonical;
import br.com.fourward.cip.canonical.OperationTypeCanonical;
import br.com.fourward.cip.canonical.PaymentSummaryCanonical;
import br.com.fourward.cip.canonical.PointOfSaleCanonical;
import br.com.fourward.cip.canonical.ProductTypeCanonical;
import br.com.fourward.cip.canonical.StatusCanonical;
import br.com.fourward.cip.canonical.StatusTypeCanonical;
import br.com.fourward.cip.canonical.SubAcquirerCanonical;
import br.com.fourward.cip.canonical.builder.AcquirerCanonicalBuilder;
import br.com.fourward.cip.canonical.builder.BankAccountCanonicalBuilder;
import br.com.fourward.cip.canonical.builder.BrandCanonicalBuilder;
import br.com.fourward.cip.canonical.builder.DocumentCanonicalBuilder;
import br.com.fourward.cip.canonical.builder.DocumentTypeCanonicalBuilder;
import br.com.fourward.cip.canonical.builder.OperationTypeCanonicalBuilder;
import br.com.fourward.cip.canonical.builder.PaymentSummaryCanonicalBuilder;
import br.com.fourward.cip.canonical.builder.PointOfSaleCanonicalBuilder;
import br.com.fourward.cip.canonical.builder.ProductTypeCanonicalBuilder;
import br.com.fourward.cip.canonical.builder.StatusCanonicalBuilder;
import br.com.fourward.cip.canonical.builder.StatusTypeCanonicalBuilder;
import br.com.fourward.cip.canonical.builder.SubAcquirerCanonicalBuilder;
import br.com.fourward.cip.dto.PaymentSummaryDto;

@Component
public class PaymentSummaryConverter {

	public PaymentSummaryCanonical convert(final PaymentSummaryDto paymentSummaryDto) {

		final String externalKey = paymentSummaryDto.getExternalKey();

		final AcquirerCanonical acquirer = AcquirerCanonicalBuilder 
				.create() 
				.setValue(paymentSummaryDto.getAcquirer().getValue()) 
				.build(); 

		final BrandCanonical brand = BrandCanonicalBuilder 
				.create() 
				.setValue(paymentSummaryDto.getBrand().getValue()) 
				.build(); 

		final ProductTypeCanonical productType = ProductTypeCanonicalBuilder 
				.create() 
				.setValue(paymentSummaryDto.getProductType().getValue()) 
				.build(); 

		final OperationTypeCanonical operationType = OperationTypeCanonicalBuilder 
				.create() 
				.setValue(paymentSummaryDto.getOperationType().getValue()) 
				.build(); 

		final Date date = paymentSummaryDto.getDate();

		final BigDecimal amount = paymentSummaryDto.getAmount();

		final DocumentTypeCanonical DocumentTypeCanonicalSubAcquirer = DocumentTypeCanonicalBuilder 
				.create()
				.setValue(paymentSummaryDto.getSubacquirer().getDocument().getType().getValue()) 
				.build(); 

		final DocumentCanonical documentCanonicalSubAcquirer = DocumentCanonicalBuilder 
				.create() 
				.setValue(paymentSummaryDto.getSubacquirer().getDocument().getValue()) 
				.setType(DocumentTypeCanonicalSubAcquirer) 
				.build();

		final BankAccountCanonical bankAccountCanonicalSubAcquirer = BankAccountCanonicalBuilder 
				.create() 
				.setBankCode(paymentSummaryDto.getSubacquirer().getBankAccount().getBankCode()) 
				.setAgency(paymentSummaryDto.getSubacquirer().getBankAccount().getAgency()) 
				.setChecking(paymentSummaryDto.getSubacquirer().getBankAccount().getChecking()) 
				.setAccountTypeCanonical(paymentSummaryDto.getSubacquirer().getBankAccount().getAccountTypeCanonical()) 
				.build(); 

		final SubAcquirerCanonical subacquirer = SubAcquirerCanonicalBuilder 
				.create() 
				.setName(paymentSummaryDto.getSubacquirer().getName()) 
				.setDocument(documentCanonicalSubAcquirer) 
				.setBankAccount(bankAccountCanonicalSubAcquirer) 
				.build();

		final DocumentTypeCanonical DocumentTypeCanonicalPointOfSale = DocumentTypeCanonicalBuilder 
				.create() 
				.setValue(paymentSummaryDto.getPointOfSale().getDocument().getType().getValue()) 
				.build(); 

		final DocumentCanonical documentCanonicalPointOfSale = DocumentCanonicalBuilder 
				.create() 
				.setValue(paymentSummaryDto.getPointOfSale().getDocument().getValue()) 
				.setType(DocumentTypeCanonicalPointOfSale) 
				.build(); 

		final BankAccountCanonical bankAccountCanonicalPointOfSale = BankAccountCanonicalBuilder 
				.create() 
				.setBankCode(paymentSummaryDto.getPointOfSale().getBankAccount().getBankCode()) 
				.setAgency(paymentSummaryDto.getPointOfSale().getBankAccount().getAgency()) 
				.setChecking(paymentSummaryDto.getPointOfSale().getBankAccount().getChecking()) 
				.setAccountTypeCanonical(paymentSummaryDto.getPointOfSale().getBankAccount().getAccountTypeCanonical()) 
				.build(); 

		final PointOfSaleCanonical pointOfSale = PointOfSaleCanonicalBuilder 
				.create() 
				.setName(paymentSummaryDto.getPointOfSale().getName()) 
				.setDocument(documentCanonicalPointOfSale) 
				.setBankAccount(bankAccountCanonicalPointOfSale) 
				.build(); 
		
		final StatusTypeCanonical statusTypeCanonical = StatusTypeCanonicalBuilder
				.create()
				.setValue(StatusTypeCanonical.Received.getValue())
				.build();
		
		final StatusCanonical statusCanonical = StatusCanonicalBuilder
				.create()
				.setDate(new Date(System.currentTimeMillis()))
				.setStatusTypeCanonical(statusTypeCanonical)
				.build();
		
		return PaymentSummaryCanonicalBuilder 
				.create() 
				.setExternalKey(externalKey) 
				.setAcquirer(acquirer)
				.setBrand(brand) 
				.setProductType(productType) 
				.setOperationType(operationType) 
				.setDate(date) 
				.setAmount(amount) 
				.setSubacquirer(subacquirer) 
				.setPointOfSale(pointOfSale) 
				.setStatusCanonical(statusCanonical)
				.build();
	}

}