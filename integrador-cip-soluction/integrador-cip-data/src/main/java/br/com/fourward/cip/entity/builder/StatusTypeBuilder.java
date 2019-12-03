package br.com.fourward.cip.entity.builder;

import br.com.fourward.cip.entity.StatusTypeEntity;

public class StatusTypeBuilder {

	private String value;
	
	public static StatusTypeBuilder create(){
		return new StatusTypeBuilder();
	}

	private StatusTypeBuilder(){

	}

	public StatusTypeBuilder setValue(final String value){
		this.value = value;
		return this;
	}

	public StatusTypeEntity build(){
		return StatusTypeEntity.create(value);
	}
}