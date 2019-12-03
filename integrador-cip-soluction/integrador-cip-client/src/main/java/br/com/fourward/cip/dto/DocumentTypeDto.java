package br.com.fourward.cip.dto;

import java.util.Arrays;

public enum DocumentTypeDto {
	CNPJ("CNPJ"),
	CPF("CPF");
	
	private final String value;
	
	private DocumentTypeDto(final String value){
		this.value = value;
	}
	
	public String getValue(){
		return value;
	}
	
	public static DocumentTypeDto create(final String value){
		return Arrays.asList(DocumentTypeDto.values()).parallelStream().filter(predicate->predicate.value.equals(value)).findFirst().orElseThrow(()->new RuntimeException("DocumentType not found"));
	}
}
