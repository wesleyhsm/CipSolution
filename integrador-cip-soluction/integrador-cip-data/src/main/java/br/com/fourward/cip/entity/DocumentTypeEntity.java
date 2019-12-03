package br.com.fourward.cip.entity;

import java.util.Arrays;

public enum DocumentTypeEntity {
	CNPJ("CNPJ"),
	CPF("CPF");
	
	private final String value;
	
	private DocumentTypeEntity(final String value){
		this.value = value;
	}
	
	public String getValue(){
		return value;
	}
	
	public static DocumentTypeEntity create(final String value){
		return Arrays.asList(DocumentTypeEntity.values()).parallelStream().filter(predicate->predicate.value.equals(value)).findFirst().orElseThrow(()->new RuntimeException("DocumentType not found"));
	}
}
