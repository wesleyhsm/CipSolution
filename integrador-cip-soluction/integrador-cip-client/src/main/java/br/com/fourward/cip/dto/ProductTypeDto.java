package br.com.fourward.cip.dto;

import java.util.Arrays;

public enum ProductTypeDto {
	Credit("Credit"),
	Debit("Debit"),
	Antecipation("Antecipation");
	
	private final String value;
	
	private ProductTypeDto(final String value){
		this.value = value;
	}
	
	public String getValue(){
		return value;
	}
	
	public static ProductTypeDto create(final String value){
		return Arrays.asList(ProductTypeDto.values()).parallelStream().filter(predicate->predicate.value.equals(value)).findFirst().orElseThrow(()->new RuntimeException("ProductType not found"));
	}
}
