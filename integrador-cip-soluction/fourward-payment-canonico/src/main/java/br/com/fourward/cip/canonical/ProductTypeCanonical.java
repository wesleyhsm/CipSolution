package br.com.fourward.cip.canonical;

import java.util.Arrays;

public enum ProductTypeCanonical {
	Credit("Credit"),
	Debit("Debit"),
	Antecipation("Antecipation");
	
	private final String value;
	
	private ProductTypeCanonical(final String value){
		this.value = value;
	}
	
	public String getValue(){
		return value;
	}
	
	public static ProductTypeCanonical create(final String value){
		return Arrays.asList(ProductTypeCanonical.values()).parallelStream().filter(predicate->predicate.value.equals(value)).findFirst().orElseThrow(()->new RuntimeException("ProductType not found"));
	}
}
