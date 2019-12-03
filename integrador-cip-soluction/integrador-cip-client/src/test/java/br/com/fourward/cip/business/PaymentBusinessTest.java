package br.com.fourward.cip.business;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import br.com.fourward.cip.business.PaymentBusiness;
import br.com.fourward.cip.canonical.AccountTypeCanonical;
import br.com.fourward.cip.canonical.AcquirerCanonical;
import br.com.fourward.cip.canonical.BankAccountCanonical;
import br.com.fourward.cip.canonical.BrandCanonical;
import br.com.fourward.cip.canonical.DocumentCanonical;
import br.com.fourward.cip.canonical.DocumentTypeCanonical;
import br.com.fourward.cip.canonical.OperationTypeCanonical;
import br.com.fourward.cip.canonical.PaymentSummaryCanonical;
import br.com.fourward.cip.canonical.PointOfSaleCanonical;
import br.com.fourward.cip.canonical.ProductTypeCanonical;
import br.com.fourward.cip.canonical.SubAcquirerCanonical;
import br.com.fourward.cip.canonical.builder.BankAccountCanonicalBuilder;
import br.com.fourward.cip.canonical.builder.DocumentCanonicalBuilder;
import br.com.fourward.cip.canonical.builder.PaymentSummaryCanonicalBuilder;
import br.com.fourward.cip.canonical.builder.PointOfSaleCanonicalBuilder;
import br.com.fourward.cip.canonical.builder.SubAcquirerCanonicalBuilder;
import br.com.fourward.cip.entity.PaymentEntity;
import br.com.fourward.cip.entity.PointOfSaleEntity;
import br.com.fourward.cip.entity.SubAcquirerEntity;
import br.com.fourward.cip.entity.converter.PaymentEntityConverter;
import br.com.fourward.cip.entity.converter.PointOfSaleEntityConverter;
import br.com.fourward.cip.entity.converter.SubAcquirerEntityConverter;
import br.com.fourward.cip.repository.PaymentRepository;
import br.com.fourward.cip.repository.PointOfSaleRepository;
import br.com.fourward.cip.repository.SubAcquirerRepository;

@RunWith(MockitoJUnitRunner.class)
public class PaymentBusinessTest {

	@InjectMocks
	private PaymentBusiness paymentBusiness;

	@Mock
	private PaymentRepository paymentRepository;

	@Mock
	private PointOfSaleRepository pointOfSaleRepository;

	@Mock
	private SubAcquirerRepository subAcquirerRepository;
	
	@Mock
	private PaymentEntityConverter paymentEntityConverter;

	@Mock
	private PointOfSaleEntityConverter pointOfSaleEntityConverter;
	
	@Mock
	private SubAcquirerEntityConverter subAcquirerEntityConverter;
	
	@Test
	public void test() {
		final PaymentEntity paymentEntityExpected = createPaymentEntity();
		
		final PaymentSummaryCanonical paymentSummaryCanonical = createPaymentSummaryCanonical();

		final PointOfSaleEntity pointOfSaleEntity = pointOfSaleEntityConverter
				.converter(paymentSummaryCanonical);

		final SubAcquirerEntity subAcquirerEntity = subAcquirerEntityConverter
				.converter(paymentSummaryCanonical);

		Mockito.when(paymentEntityConverter.convert(paymentSummaryCanonical)).thenReturn(paymentEntityExpected);
		Mockito.when(pointOfSaleRepository.save(pointOfSaleEntity)).thenReturn(null);
		Mockito.when(subAcquirerRepository.save(subAcquirerEntity)).thenReturn(null);

		final Long id = paymentBusiness.save(paymentSummaryCanonical);
		Assert.assertEquals(Long.valueOf(10L), id);
	}

	private PaymentEntity createPaymentEntity() {
		final PaymentEntity paymentEntity = new PaymentEntity(10L, null, null, null, null, null, null, null, null, null, null, null);
		return paymentEntity;
	}

	private PaymentSummaryCanonical createPaymentSummaryCanonical() {
		return PaymentSummaryCanonicalBuilder.create().setAcquirer(AcquirerCanonical.Adyen)
				.setBrand(BrandCanonical.Agiplan).setOperationType(OperationTypeCanonical.Adjustment)
				.setProductType(ProductTypeCanonical.Antecipation).setPointOfSale(createPointOfSale())
				.setSubacquirer(createSubAcquirer()).build();
	}

	private PointOfSaleCanonical createPointOfSale() {
		return PointOfSaleCanonicalBuilder.create().setBankAccount(createBankAccount()).setDocument(createDocument())
				.build();
	}

	private BankAccountCanonical createBankAccount() {
		return BankAccountCanonicalBuilder.create().setAccountTypeCanonical(AccountTypeCanonical.SavingsAccount)
				.build();
	}

	private SubAcquirerCanonical createSubAcquirer() {
		return SubAcquirerCanonicalBuilder.create().setDocument(createDocument()).setBankAccount(createBankAccount())
				.setName("").build();
	}

	private DocumentCanonical createDocument() {
		return DocumentCanonicalBuilder.create().setType(DocumentTypeCanonical.CNPJ).build();
	}
}