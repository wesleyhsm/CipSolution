package br.com.fourward.cip.canonical.builder;

import br.com.fourward.cip.canonical.DocumentTypeCanonical;

public class DocumentTypeCanonicalBuilder {

	private String value;
	
	public static DocumentTypeCanonicalBuilder create(){
		return new DocumentTypeCanonicalBuilder();
	}

	private DocumentTypeCanonicalBuilder(){

	}
	
	public DocumentTypeCanonicalBuilder setValue(final String value){
		this.value = value;
		return this;
	}

	public DocumentTypeCanonical build(){
		return DocumentTypeCanonical.create(value);
	}
}