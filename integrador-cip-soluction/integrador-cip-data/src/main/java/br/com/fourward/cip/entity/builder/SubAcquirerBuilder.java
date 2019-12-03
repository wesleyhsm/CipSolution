package br.com.fourward.cip.entity.builder;

import java.util.List;

import br.com.fourward.cip.entity.PaymentEntity;
import br.com.fourward.cip.entity.SubAcquirerEntity;

public class SubAcquirerBuilder {

	private List<PaymentEntity> payments;
	
	public static SubAcquirerBuilder create(){
		return new SubAcquirerBuilder();
	}

	private SubAcquirerBuilder(){

	}

	public SubAcquirerBuilder setPayments(final List<PaymentEntity> payments){
		this.payments = payments;
		return this;
	}

	public SubAcquirerEntity build(){
		return new SubAcquirerEntity(payments);
	}
}