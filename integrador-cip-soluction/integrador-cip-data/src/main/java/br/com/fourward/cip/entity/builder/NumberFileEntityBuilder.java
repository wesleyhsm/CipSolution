package br.com.fourward.cip.entity.builder;

import java.util.Date;

import br.com.fourward.cip.entity.NumberFileEntity;

public class NumberFileEntityBuilder {

	private Long numberFileId;
	private Date date;
	private Long numberFileGeneration;
	
	public static NumberFileEntityBuilder create(){
		return new NumberFileEntityBuilder();
	}

	private NumberFileEntityBuilder(){

	}

	public NumberFileEntityBuilder setNumberFileId(final Long numberFileId){
		this.numberFileId = numberFileId;
		return this;
	}

	public NumberFileEntityBuilder setDate(final Date date){
		this.date = date;
		return this;
	}

	public NumberFileEntityBuilder setNumberFileGeneration(final Long numberFileGeneration){
		this.numberFileGeneration = numberFileGeneration;
		return this;
	}

	public NumberFileEntity build(){
		return new NumberFileEntity(numberFileId, date, numberFileGeneration);
	}
}