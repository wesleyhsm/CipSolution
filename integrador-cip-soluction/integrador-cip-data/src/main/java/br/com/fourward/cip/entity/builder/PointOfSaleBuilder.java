package br.com.fourward.cip.entity.builder;

import java.util.List;

import br.com.fourward.cip.entity.PaymentEntity;
import br.com.fourward.cip.entity.PointOfSaleEntity;

public class PointOfSaleBuilder {

	private List<PaymentEntity> payments;
	
	public static PointOfSaleBuilder create(){
		return new PointOfSaleBuilder();
	}

	private PointOfSaleBuilder(){

	}

	public PointOfSaleBuilder setPayments(final List<PaymentEntity> payments){
		this.payments = payments;
		return this;
	}

	public PointOfSaleEntity build(){
		return new PointOfSaleEntity(payments);
	}
}