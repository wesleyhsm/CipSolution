package br.com.fourward.cip.entity.converter;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.stereotype.Component;

import br.com.fourward.cip.canonical.AccountTypeCanonical;
import br.com.fourward.cip.canonical.AcquirerCanonical;
import br.com.fourward.cip.canonical.BankAccountCanonical;
import br.com.fourward.cip.canonical.BrandCanonical;
import br.com.fourward.cip.canonical.DocumentCanonical;
import br.com.fourward.cip.canonical.DocumentTypeCanonical;
import br.com.fourward.cip.canonical.OperationTypeCanonical;
import br.com.fourward.cip.canonical.PaymentReportCanonical;
import br.com.fourward.cip.canonical.PaymentSummaryCanonical;
import br.com.fourward.cip.canonical.PointOfSaleCanonical;
import br.com.fourward.cip.canonical.ProductTypeCanonical;
import br.com.fourward.cip.canonical.StatusCanonical;
import br.com.fourward.cip.canonical.StatusTypeCanonical;
import br.com.fourward.cip.canonical.SubAcquirerCanonical;
import br.com.fourward.cip.canonical.builder.AccountTypeCanonicalBuilder;
import br.com.fourward.cip.canonical.builder.AcquirerCanonicalBuilder;
import br.com.fourward.cip.canonical.builder.BankAccountCanonicalBuilder;
import br.com.fourward.cip.canonical.builder.BrandCanonicalBuilder;
import br.com.fourward.cip.canonical.builder.DocumentCanonicalBuilder;
import br.com.fourward.cip.canonical.builder.DocumentTypeCanonicalBuilder;
import br.com.fourward.cip.canonical.builder.OperationTypeCanonicalBuilder;
import br.com.fourward.cip.canonical.builder.PaymentReportCanonicalBuilder;
import br.com.fourward.cip.canonical.builder.PaymentSummaryCanonicalBuilder;
import br.com.fourward.cip.canonical.builder.PointOfSaleCanonicalBuilder;
import br.com.fourward.cip.canonical.builder.ProductTypeCanonicalBuilder;
import br.com.fourward.cip.canonical.builder.StatusCanonicalBuilder;
import br.com.fourward.cip.canonical.builder.StatusTypeCanonicalBuilder;
import br.com.fourward.cip.canonical.builder.SubAcquirerCanonicalBuilder;
import br.com.fourward.cip.entity.PaymentEntity;

@Component
public class PaymentReportCanonicalConverter {
	
	public PaymentReportCanonical convertId(final Long id) {

		return PaymentReportCanonicalBuilder
				.create()
				.setId(id)
				.build();
	}
	
	public PaymentReportCanonical convertKey(final String key) {

		final PaymentSummaryCanonical paymentSummaryCanonical = PaymentSummaryCanonicalBuilder
				.create()
				.setExternalKey(key)
				.build();
		
		return PaymentReportCanonicalBuilder
				.create()
				.setPaymentSummaryCanonical(paymentSummaryCanonical)
				.build();
	}
	
	public PaymentReportCanonical convert(final PaymentEntity paymentEntity){
		
		final Long id = paymentEntity.getPaymentId();
		
		final AcquirerCanonical acquirerCanonical = AcquirerCanonicalBuilder
				.create()
				.setValue(paymentEntity.getAcquirer().getValue())
				.build();
		
		final BrandCanonical brandCanonical = BrandCanonicalBuilder
				.create()
				.setValue(paymentEntity.getBrand().getValue())
				.build();
		
		final BigDecimal amount = paymentEntity.getAmount();
		
		final Date data = paymentEntity.getDate();
		
		final String externalKey = paymentEntity.getExternalKey();
		
		final OperationTypeCanonical operationTypeCanonical = OperationTypeCanonicalBuilder
				.create()
				.setValue(paymentEntity.getOperationType().getValue())
				.build();
	
		final ProductTypeCanonical productTypeCanonical = ProductTypeCanonicalBuilder
				.create()
				.setValue(paymentEntity.getProductType().getValue())
				.build();
	
		final DocumentTypeCanonical documentTypeCanonicalPointOfSale = DocumentTypeCanonicalBuilder
				.create()
				.setValue(paymentEntity.getPointOfSaleEntity().getDocumentEntity().getType().getValue())
				.build();
		
		final DocumentCanonical documentCanonicalPointOfSale = DocumentCanonicalBuilder
				.create()
				.setType(documentTypeCanonicalPointOfSale)
				.setValue(paymentEntity.getPointOfSaleEntity().getDocumentEntity().getValue())
				.build();
		
		final AccountTypeCanonical accountTypeCanonicalPointOfSale = AccountTypeCanonicalBuilder
				.create()
				.setValue(paymentEntity.getPointOfSaleEntity().getBankEntity().getType().getValue())
				.build();
		
		final BankAccountCanonical bankAccountCanonicalPointOfSale = BankAccountCanonicalBuilder
				.create()
				.setAgency(paymentEntity.getPointOfSaleEntity().getBankEntity().getAgency())
				.setChecking(paymentEntity.getPointOfSaleEntity().getBankEntity().getChecking())
				.setBankCode(paymentEntity.getPointOfSaleEntity().getBankEntity().getBankCode())
				.setAccountTypeCanonical(accountTypeCanonicalPointOfSale)
				.build();
		
		final PointOfSaleCanonical pointOfSaleCanonical = PointOfSaleCanonicalBuilder
				.create()
				.setName(paymentEntity.getPointOfSaleEntity().getName())
				.setDocument(documentCanonicalPointOfSale)
				.setBankAccount(bankAccountCanonicalPointOfSale)
				.build();
		
		final DocumentTypeCanonical documentTypeCanonicalSubAcquirer = DocumentTypeCanonicalBuilder
				.create()
				.setValue(paymentEntity.getSubAcquirerEntity().getDocumentEntity().getType().getValue())
				.build();
		
		final DocumentCanonical documentCanonicalSubAcquirer = DocumentCanonicalBuilder
				.create()
				.setType(documentTypeCanonicalSubAcquirer)
				.setValue(paymentEntity.getSubAcquirerEntity().getDocumentEntity().getValue())
				.build();
	
		final AccountTypeCanonical accountTypeCanonicalSubAcquirer = AccountTypeCanonicalBuilder
				.create()
				.setValue(paymentEntity.getSubAcquirerEntity().getBankEntity().getType().getValue())
				.build();
		
		final BankAccountCanonical bankAccountCanonicalSubAcquirer = BankAccountCanonicalBuilder
				.create()
				.setAgency(paymentEntity.getSubAcquirerEntity().getBankEntity().getAgency())
				.setChecking(paymentEntity.getSubAcquirerEntity().getBankEntity().getChecking())
				.setBankCode(paymentEntity.getSubAcquirerEntity().getBankEntity().getBankCode())
				.setAccountTypeCanonical(accountTypeCanonicalSubAcquirer)
				.build();
					
		final SubAcquirerCanonical subAcquirerCanonical = SubAcquirerCanonicalBuilder
				.create()
				.setName(paymentEntity.getSubAcquirerEntity().getName())
				.setDocument(documentCanonicalSubAcquirer)
				.setBankAccount(bankAccountCanonicalSubAcquirer)
				.build();
		
		final int positionStatus = (paymentEntity.getStatusEntitys().size() - 1);
		
		final StatusTypeCanonical statusTypeCanonical = StatusTypeCanonicalBuilder
				.create()
				.setValue(paymentEntity.getStatusEntitys().get(positionStatus).getStatusType().getValue())
				.build();
	
		final StatusCanonical statusCanonical = StatusCanonicalBuilder
				.create()
				.setDate(paymentEntity.getStatusEntitys().get(positionStatus).getDate())
				.setStatusTypeCanonical(statusTypeCanonical)
				.build();
		
		final PaymentSummaryCanonical paymentSummaryCanonical = PaymentSummaryCanonicalBuilder
				.create()
				.setAcquirer(acquirerCanonical)
				.setBrand(brandCanonical)
				.setAmount(amount)
				.setDate(data)
				.setExternalKey(externalKey)
				.setOperationType(operationTypeCanonical)
				.setProductType(productTypeCanonical)
				.setPointOfSale(pointOfSaleCanonical)
				.setSubacquirer(subAcquirerCanonical)
				.setStatusCanonical(statusCanonical)
				.build();
		
		return PaymentReportCanonicalBuilder
				.create()
				.setId(id)
				.setPaymentSummaryCanonical(paymentSummaryCanonical)
				.build();
	}
}
