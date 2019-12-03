package br.com.fourward.cip.entity;

import java.util.Arrays;

public enum ProductTypeEntity {
	Credit("Credit"),
	Debit("Debit"),
	Antecipation("Antecipation");
	
	private final String value;
	
	private ProductTypeEntity(final String value){
		this.value = value;
	}
	
	public String getValue(){
		return value;
	}
	
	public static ProductTypeEntity create(final String value){
		return Arrays.asList(ProductTypeEntity.values()).parallelStream().filter(predicate->predicate.value.equals(value)).findFirst().orElseThrow(()->new RuntimeException("ProductType not found"));
	}
}
