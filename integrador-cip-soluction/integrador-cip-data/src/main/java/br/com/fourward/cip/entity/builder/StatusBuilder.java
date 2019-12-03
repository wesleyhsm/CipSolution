package br.com.fourward.cip.entity.builder;

import java.util.Date;

import br.com.fourward.cip.entity.PaymentEntity;
import br.com.fourward.cip.entity.StatusEntity;
import br.com.fourward.cip.entity.StatusTypeEntity;

public class StatusBuilder {

	private Long statusId;
	private StatusTypeEntity statusType;
	private Date date;
	private PaymentEntity payment;
	
	public static StatusBuilder create(){
		return new StatusBuilder();
	}

	private StatusBuilder(){

	}
	
	public StatusBuilder setStatusId(final Long statusId){
		this.statusId = statusId;
		return this;
	}

	public StatusBuilder setStatusType(final StatusTypeEntity statusType){
		this.statusType = statusType;
		return this;
	}

	public StatusBuilder setDate(final Date date){
		this.date = date;
		return this;
	}

	public StatusBuilder setPayment(final PaymentEntity payment){
		this.payment = payment;
		return this;
	}

	public StatusEntity build(){
		return new StatusEntity(statusId, statusType, date, payment);
	}
}