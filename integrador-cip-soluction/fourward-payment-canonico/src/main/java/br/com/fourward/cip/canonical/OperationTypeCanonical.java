package br.com.fourward.cip.canonical;

import java.util.Arrays;

public enum OperationTypeCanonical {
	Card("Card"),
	Adjustment("Adjustment"); 
	
	private final String value;
	
	private OperationTypeCanonical(final String value){
		this.value = value;
	}
	
	public String getValue(){
		return value;
	}
	
	public static OperationTypeCanonical create(final String value){
		return Arrays.asList(OperationTypeCanonical.values()).parallelStream().filter(predicate->predicate.value.equals(value)).findFirst().orElseThrow(()->new RuntimeException("OperationType not found"));
	}
}
