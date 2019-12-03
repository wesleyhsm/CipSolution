package br.com.fourward.cip.entity.builder;

import br.com.fourward.cip.entity.BrandEntity;

public class BrandBuilder {

	private String value;
	
	public static BrandBuilder create(){
		return new BrandBuilder();
	}

	private BrandBuilder(){

	}

	public BrandBuilder setValue(final String value){
		this.value = value;
		return this;
	}

	public BrandEntity build(){
		return BrandEntity.create(value);
	}
}