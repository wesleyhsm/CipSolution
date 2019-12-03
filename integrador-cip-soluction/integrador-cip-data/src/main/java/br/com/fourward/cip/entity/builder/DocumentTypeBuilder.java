package br.com.fourward.cip.entity.builder;

import br.com.fourward.cip.entity.DocumentTypeEntity;

public class DocumentTypeBuilder {

	private String value;
	
	public static DocumentTypeBuilder create(){
		return new DocumentTypeBuilder();
	}

	private DocumentTypeBuilder(){

	}

	public DocumentTypeBuilder setValue(final String value){
		this.value = value;
		return this;
	}

	public DocumentTypeEntity build(){
		return DocumentTypeEntity.create(value);
	}
}