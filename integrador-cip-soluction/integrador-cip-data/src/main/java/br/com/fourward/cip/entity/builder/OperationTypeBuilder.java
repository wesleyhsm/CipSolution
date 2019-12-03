package br.com.fourward.cip.entity.builder;

import br.com.fourward.cip.entity.OperationTypeEntity;

public class OperationTypeBuilder {

	private String value;
	
	public static OperationTypeBuilder create(){
		return new OperationTypeBuilder();
	}

	private OperationTypeBuilder(){

	}

	public OperationTypeBuilder setValue(final String value){
		this.value = value;
		return this;
	}

	public OperationTypeEntity build(){
		return OperationTypeEntity.create(value);
	}
}