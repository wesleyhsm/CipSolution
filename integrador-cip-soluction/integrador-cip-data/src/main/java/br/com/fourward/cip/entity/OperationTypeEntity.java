package br.com.fourward.cip.entity;

import java.util.Arrays;

public enum OperationTypeEntity {
	Card("Card"),
	Adjustment("Adjustment");
	
	private final String value;
	
	private OperationTypeEntity(final String value){
		this.value = value;
	}
	
	public String getValue(){
		return value;
	}
	
	public static OperationTypeEntity create(final String value){
		return Arrays.asList(OperationTypeEntity.values()).parallelStream().filter(predicate->predicate.value.equals(value)).findFirst().orElseThrow(()->new RuntimeException("OperationType not found"));
	}
}
