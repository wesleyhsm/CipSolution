package br.com.fourward.cip.entity.builder;

import br.com.fourward.cip.entity.AcquirerEntity;

public class AcquirerBuilder {

	private String value;
	
	public static AcquirerBuilder create(){
		return new AcquirerBuilder();
	}

	private AcquirerBuilder(){

	}

	public AcquirerBuilder setValue(final String value){
		this.value = value;
		return this;
	}

	public AcquirerEntity build(){
		return AcquirerEntity.create(value);
	}
}