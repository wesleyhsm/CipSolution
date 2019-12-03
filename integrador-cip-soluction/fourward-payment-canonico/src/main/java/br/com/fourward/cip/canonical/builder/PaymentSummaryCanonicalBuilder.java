package br.com.fourward.cip.canonical.builder;

import java.math.BigDecimal;
import java.util.Date;

import br.com.fourward.cip.canonical.AcquirerCanonical;
import br.com.fourward.cip.canonical.BrandCanonical;
import br.com.fourward.cip.canonical.OperationTypeCanonical;
import br.com.fourward.cip.canonical.PaymentSummaryCanonical;
import br.com.fourward.cip.canonical.PointOfSaleCanonical;
import br.com.fourward.cip.canonical.ProductTypeCanonical;
import br.com.fourward.cip.canonical.StatusCanonical;
import br.com.fourward.cip.canonical.SubAcquirerCanonical;

public class PaymentSummaryCanonicalBuilder {

	private String externalKey;
	private AcquirerCanonical acquirer;
	private BrandCanonical brand;
	private ProductTypeCanonical productType;
	private OperationTypeCanonical operationType;
	private Date date;
	private BigDecimal amount;
	private SubAcquirerCanonical subacquirer;
	private PointOfSaleCanonical pointOfSale;
	private StatusCanonical statusCanonical;
	
	public static PaymentSummaryCanonicalBuilder create() {
		return new PaymentSummaryCanonicalBuilder();
	}

	private PaymentSummaryCanonicalBuilder() {

	}
		
	public PaymentSummaryCanonicalBuilder setExternalKey(final String externalKey) {
		this.externalKey = externalKey;
		return this;
	}

	public PaymentSummaryCanonicalBuilder setAcquirer(final AcquirerCanonical acquirer) {
		this.acquirer = acquirer;
		return this;
	}

	public PaymentSummaryCanonicalBuilder setBrand(final BrandCanonical brand) {
		this.brand = brand;
		return this;
	}

	public PaymentSummaryCanonicalBuilder setProductType(final ProductTypeCanonical productType) {
		this.productType = productType;
		return this;
	}

	public PaymentSummaryCanonicalBuilder setOperationType(final OperationTypeCanonical operationType) {
		this.operationType = operationType;
		return this;
	}

	public PaymentSummaryCanonicalBuilder setDate(final Date date) {
		this.date = date;
		return this;
	}

	public PaymentSummaryCanonicalBuilder setAmount(final BigDecimal amount) {
		this.amount = amount;
		return this;
	}

	public PaymentSummaryCanonicalBuilder setSubacquirer(final SubAcquirerCanonical subacquirer) {
		this.subacquirer = subacquirer;
		return this;
	}

	public PaymentSummaryCanonicalBuilder setPointOfSale(final PointOfSaleCanonical pointOfSale) {
		this.pointOfSale = pointOfSale;
		return this;
	}

	public PaymentSummaryCanonicalBuilder setStatusCanonical(final StatusCanonical statusCanonical) {
		this.statusCanonical = statusCanonical;
		return this;
	}

	public PaymentSummaryCanonical build() {
		return new PaymentSummaryCanonical(externalKey, acquirer, brand, productType, operationType, date, amount,
				subacquirer, pointOfSale, statusCanonical);
	}
}
