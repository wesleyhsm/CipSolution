package br.com.fourward.cip.entity.converter;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.fourward.cip.canonical.PaymentSummaryCanonical;
import br.com.fourward.cip.entity.AcquirerEntity;
import br.com.fourward.cip.entity.BrandEntity;
import br.com.fourward.cip.entity.OperationTypeEntity;
import br.com.fourward.cip.entity.PaymentEntity;
import br.com.fourward.cip.entity.PointOfSaleEntity;
import br.com.fourward.cip.entity.ProductTypeEntity;
import br.com.fourward.cip.entity.StatusEntity;
import br.com.fourward.cip.entity.SubAcquirerEntity;
import br.com.fourward.cip.entity.builder.PaymentBuilder;

@Component
public class PaymentEntityConverter {

	@Autowired
	private AcquirerEntityConverter acquirerEntityConverter;
	
	@Autowired
	private BrandEntityConverter brandEntityConverter;
	
	@Autowired
	private ProductTypeEntityConverter productTypeEntityConverter;
	
	@Autowired
	private OperationTypeEntityConverter operationTypeEntityConverter;
	
	@Autowired
	private PointOfSaleEntityConverter pointOfSaleEntityConverter;
	
	@Autowired
	private SubAcquirerEntityConverter subAcquirerEntityConverter;
	
	@Autowired
	private StatusEntityConverter statusEntityConverter;
	
	public PaymentEntity convert(final PaymentSummaryCanonical paymentSummaryCanonical) {
						
		final String externalKey = paymentSummaryCanonical.getExternalId();
		
		final AcquirerEntity acquirer = acquirerEntityConverter.convert(paymentSummaryCanonical.getAcquirer());
		
		final BrandEntity brand = brandEntityConverter.convert(paymentSummaryCanonical.getBrand());
		
		final ProductTypeEntity productType = productTypeEntityConverter.convert(paymentSummaryCanonical.getProductType());
	
		final OperationTypeEntity operationType = operationTypeEntityConverter.convert(paymentSummaryCanonical.getOperationType());
		
		final Date date = paymentSummaryCanonical.getDate();
		
		final BigDecimal amount = paymentSummaryCanonical.getAmount();
						
		final PointOfSaleEntity pointOfSale = pointOfSaleEntityConverter.converter(paymentSummaryCanonical);
		
		final SubAcquirerEntity subAcquirer = subAcquirerEntityConverter.converter(paymentSummaryCanonical);

		final StatusEntity statusEntity = statusEntityConverter.convert(paymentSummaryCanonical);
						
		final PaymentEntity paymentEntity = PaymentBuilder 
				.create() 
				.setExternalKey(externalKey) 
				.setAcquirer(acquirer) 
				.setBrand(brand) 
				.setProductType(productType) 
				.setOperationType(operationType) 
				.setDate(date) 
				.setAmount(amount) 			
				.setPointOfSale(pointOfSale) 
				.setSubAcquirer(subAcquirer) 
				.setStatusList(Arrays.asList(statusEntity))
				.build();
		 
		 statusEntity.setPaymentEntity(paymentEntity);
		
		 return paymentEntity;
	}

}