package br.com.fourward.cip.dto;

import java.util.Arrays;

public enum AcquirerDto {
	GlobalPayments("Global Payments"),
	Elavon("Elavon"),
	Rede("Rede"),
	Stone("Stone"),
	GetNet("GetNet"),
	FirstData("First Data"),
	Vero("Vero"),
	Adyen("Adyen");
	
	private final String value;
	
	private AcquirerDto(final String value){
		this.value = value;
	}
	
	public String getValue(){
		return value;
	}
	
	public static AcquirerDto create(final String value){
		return Arrays.asList(AcquirerDto.values()).parallelStream().filter(predicate->predicate.value.equals(value)).findFirst().orElseThrow(()->new RuntimeException("Acquirer not found"));
	}
}
