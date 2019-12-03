package br.com.fourward.cip.canonical;

import java.util.Arrays;

public enum DocumentTypeCanonical {
	CNPJ("CNPJ"),
	CPF("CPF");
	
	private final String value;
	
	private DocumentTypeCanonical(final String value){
		this.value = value;
	}
	
	public String getValue(){
		return value;
	}
	
	public static DocumentTypeCanonical create(final String value){
		return Arrays.asList(DocumentTypeCanonical.values()).parallelStream().filter(predicate->predicate.value.equals(value)).findFirst().orElseThrow(()->new RuntimeException("DocumentType not found"));
	}
}
