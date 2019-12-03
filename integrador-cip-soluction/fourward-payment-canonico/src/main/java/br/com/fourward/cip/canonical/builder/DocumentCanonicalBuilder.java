package br.com.fourward.cip.canonical.builder;

import br.com.fourward.cip.canonical.DocumentCanonical;
import br.com.fourward.cip.canonical.DocumentTypeCanonical;

public class DocumentCanonicalBuilder {

	private DocumentTypeCanonical type;
	private String value;
	
	public static DocumentCanonicalBuilder create(){
		return new DocumentCanonicalBuilder();
	}

	private DocumentCanonicalBuilder(){

	}
	
	public DocumentCanonicalBuilder setType(final DocumentTypeCanonical type){
		this.type = type;
		return this;
	}

	public DocumentCanonicalBuilder setValue(final String value){
		this.value = value;
		return this;
	}

	public DocumentCanonical build(){
		return new DocumentCanonical(type, value);
	}
}