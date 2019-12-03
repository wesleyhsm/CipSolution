package br.com.fourward.cip.entity.builder;

import br.com.fourward.cip.entity.ProductTypeEntity;

public class ProductTypeBuilder {

	private String value;
	
	public static ProductTypeBuilder create(){
		return new ProductTypeBuilder();
	}

	private ProductTypeBuilder(){

	}

	public ProductTypeBuilder setValue(final String value){
		this.value = value;
		return this;
	}

	public ProductTypeEntity build(){
		return ProductTypeEntity.create(value);
	}
}