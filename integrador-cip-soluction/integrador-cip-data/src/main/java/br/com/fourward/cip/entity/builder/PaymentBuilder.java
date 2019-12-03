package br.com.fourward.cip.entity.builder;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import br.com.fourward.cip.entity.AcquirerEntity;
import br.com.fourward.cip.entity.BrandEntity;
import br.com.fourward.cip.entity.OperationTypeEntity;
import br.com.fourward.cip.entity.PaymentEntity;
import br.com.fourward.cip.entity.PointOfSaleEntity;
import br.com.fourward.cip.entity.ProductTypeEntity;
import br.com.fourward.cip.entity.StatusEntity;
import br.com.fourward.cip.entity.SubAcquirerEntity;

public class PaymentBuilder {

	private Long paymentId;
	private String externalKey;
	private String nameFile;
	private AcquirerEntity acquirer;
	private BrandEntity brand;
	private ProductTypeEntity productType;
	private OperationTypeEntity operationType;
	private Date date;
	private BigDecimal amount;
	private List<StatusEntity> status;
	private PointOfSaleEntity pointOfSale;
	private SubAcquirerEntity subAcquirer;
	
	public static PaymentBuilder create(){
		return new PaymentBuilder();
	}

	private PaymentBuilder(){

	}

	public PaymentBuilder setPaymentId(final Long paymentId){
		this.paymentId = paymentId;
		return this;
	}

	public PaymentBuilder setExternalKey(final String externalKey){
		this.externalKey = externalKey;
		return this;
	}

	public PaymentBuilder setAcquirer(final AcquirerEntity acquirer){
		this.acquirer = acquirer;
		return this;
	}

	public PaymentBuilder setBrand(final BrandEntity brand){
		this.brand = brand;
		return this;
	}

	public PaymentBuilder setProductType(final ProductTypeEntity productType){
		this.productType = productType;
		return this;
	}

	public PaymentBuilder setOperationType(final OperationTypeEntity operationType){
		this.operationType = operationType;
		return this;
	}

	public PaymentBuilder setDate(final Date date){
		this.date = date;
		return this;
	}

	public PaymentBuilder setAmount(final BigDecimal amount){
		this.amount = amount;
		return this;
	}

	public PaymentBuilder setStatusList(final List<StatusEntity> Status){
		this.status = Status;
		return this;
	}

	public PaymentBuilder setPointOfSale(final PointOfSaleEntity pointOfSale){
		this.pointOfSale = pointOfSale;
		return this;
	}

	public PaymentBuilder setSubAcquirer(final SubAcquirerEntity subAcquirer){
		this.subAcquirer = subAcquirer;
		return this;
	}

	public PaymentBuilder setNameFile(final String nameFile){
		this.nameFile = nameFile;
		return this;
	}
	
	public PaymentEntity build(){
		return new PaymentEntity(paymentId, externalKey, acquirer, brand, productType, operationType, date, amount, status, pointOfSale, subAcquirer, nameFile);
	}
}