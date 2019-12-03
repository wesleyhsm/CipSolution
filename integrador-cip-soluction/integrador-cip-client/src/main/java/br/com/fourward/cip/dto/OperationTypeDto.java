package br.com.fourward.cip.dto;

import java.util.Arrays;

public enum OperationTypeDto {
	Card("Card"),
	Adjustment("Adjustment");
	
	private final String value;
	
	private OperationTypeDto(final String value){
		this.value = value;
	}
	
	public String getValue(){
		return value;
	}
	
	public static OperationTypeDto create(final String value){
		return Arrays.asList(OperationTypeDto.values()).parallelStream().filter(predicate->predicate.value.equals(value)).findFirst().orElseThrow(()->new RuntimeException("OperationType not found"));
	}
}
