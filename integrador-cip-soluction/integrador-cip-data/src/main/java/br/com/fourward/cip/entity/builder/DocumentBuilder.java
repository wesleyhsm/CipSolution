package br.com.fourward.cip.entity.builder;

import br.com.fourward.cip.entity.CompanyEntity;
import br.com.fourward.cip.entity.DocumentEntity;
import br.com.fourward.cip.entity.DocumentTypeEntity;

public class DocumentBuilder {

	private Long documentId;
	private DocumentTypeEntity type;
	private String value;
	private CompanyEntity company;
	
	public static DocumentBuilder create(){
		return new DocumentBuilder();
	}

	private DocumentBuilder(){

	}

	public DocumentBuilder setDocumentId(final Long documentId){
		this.documentId = documentId;
		return this;
	}

	public DocumentBuilder setType(final DocumentTypeEntity type){
		this.type = type;
		return this;
	}

	public DocumentBuilder setValue(final String value){
		this.value = value;
		return this;
	}

	public DocumentBuilder setCompany(final CompanyEntity company){
		this.company = company;
		return this;
	}

	public DocumentEntity build(){
		return new DocumentEntity(documentId, type, value, company);
	}
}