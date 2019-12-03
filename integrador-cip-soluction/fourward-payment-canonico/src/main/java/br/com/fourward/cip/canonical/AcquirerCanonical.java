package br.com.fourward.cip.canonical;

import java.util.Arrays;

public enum AcquirerCanonical {
	GlobalPayments("Global Payments"),
	Elavon("Elavon"),
	Rede("Rede"),
	Stone("Stone"),
	GetNet("GetNet"),
	FirstData("First Data"),
	Vero("Vero"),
	Adyen("Adyen");
	
	private final String value;
	
	private AcquirerCanonical(final String value){
		this.value = value;
	}
	
	public String getValue(){
		return value;
	}
	
	public static AcquirerCanonical create(final String value){
		return Arrays.asList(AcquirerCanonical.values()).parallelStream().filter(predicate->predicate.value.equals(value)).findFirst().orElseThrow(()->new RuntimeException("Acquirer not found"));
	}
}
