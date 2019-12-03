package br.com.fourward.cip.entity;

import java.util.Arrays;

public enum AcquirerEntity {
	GlobalPayments("Global Payments"),
	Elavon("Elavon"),
	Rede("Rede"),
	Stone("Stone"),
	GetNet("GetNet"),
	FirstData("First Data"),
	Vero("Vero"),
	Adyen("Adyen");
	
	private final String value;
	
	private AcquirerEntity(final String value){
		this.value = value;
	}
	
	public String getValue(){
		return value;
	}
	
	public static AcquirerEntity create(final String value){
		return Arrays.asList(AcquirerEntity.values()).parallelStream().filter(predicate->predicate.value.equals(value)).findFirst().orElseThrow(()->new RuntimeException("Acquirer not found"));
	}
}
