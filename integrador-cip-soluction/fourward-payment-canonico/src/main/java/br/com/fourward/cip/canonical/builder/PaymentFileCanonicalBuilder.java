package br.com.fourward.cip.canonical.builder;

import br.com.fourward.cip.canonical.PaymentFileCanonical;
import br.com.fourward.cip.canonical.AcquirerCanonical;
import br.com.fourward.cip.canonical.BrandCanonical;
import br.com.fourward.cip.canonical.ProductTypeCanonical;
import br.com.fourward.cip.canonical.OperationTypeCanonical;
import java.util.Date;
import java.math.BigDecimal;
import br.com.fourward.cip.canonical.SubAcquirerCanonical;
import br.com.fourward.cip.canonical.PointOfSaleCanonical;
import br.com.fourward.cip.canonical.StatusCanonical;

public class PaymentFileCanonicalBuilder {

	private Long id;
	private String nameFile;
	private String externalId;
	private AcquirerCanonical acquirer;
	private BrandCanonical brand;
	private ProductTypeCanonical productType;
	private OperationTypeCanonical operationType;
	private Date date;
	private BigDecimal amount;
	private SubAcquirerCanonical subacquirer;
	private PointOfSaleCanonical pointOfSale;
	private StatusCanonical statusCanonical;
	
	public static PaymentFileCanonicalBuilder create(){
		return new PaymentFileCanonicalBuilder();
	}

	private PaymentFileCanonicalBuilder(){
	}
	
	public PaymentFileCanonicalBuilder setId(final Long id){
		this.id = id;
		return this;
	}

	public PaymentFileCanonicalBuilder setNameFile(final String nameFile){
		this.nameFile = nameFile;
		return this;
	}

	public PaymentFileCanonicalBuilder setExternalId(final String externalId){
		this.externalId = externalId;
		return this;
	}

	public PaymentFileCanonicalBuilder setAcquirer(final AcquirerCanonical acquirer){
		this.acquirer = acquirer;
		return this;
	}

	public PaymentFileCanonicalBuilder setBrand(final BrandCanonical brand){
		this.brand = brand;
		return this;
	}

	public PaymentFileCanonicalBuilder setProductType(final ProductTypeCanonical productType){
		this.productType = productType;
		return this;
	}

	public PaymentFileCanonicalBuilder setOperationType(final OperationTypeCanonical operationType){
		this.operationType = operationType;
		return this;
	}

	public PaymentFileCanonicalBuilder setDate(final Date date){
		this.date = date;
		return this;
	}

	public PaymentFileCanonicalBuilder setAmount(final BigDecimal amount){
		this.amount = amount;
		return this;
	}

	public PaymentFileCanonicalBuilder setSubacquirer(final SubAcquirerCanonical subacquirer){
		this.subacquirer = subacquirer;
		return this;
	}

	public PaymentFileCanonicalBuilder setPointOfSale(final PointOfSaleCanonical pointOfSale){
		this.pointOfSale = pointOfSale;
		return this;
	}

	public PaymentFileCanonicalBuilder setStatusCanonical(final StatusCanonical statusCanonical){
		this.statusCanonical = statusCanonical;
		return this;
	}

	public PaymentFileCanonical build(){
		return new PaymentFileCanonical(id, nameFile, externalId, acquirer, brand, productType, operationType, date, amount, subacquirer, pointOfSale, statusCanonical);
	}
}