package br.com.fourward.cip.canonical.builder;

import br.com.fourward.cip.canonical.BankAccountCanonical;
import br.com.fourward.cip.canonical.DocumentCanonical;
import br.com.fourward.cip.canonical.PointOfSaleCanonical;

public class PointOfSaleCanonicalBuilder {

	private String name;
	private DocumentCanonical document;
	private BankAccountCanonical bankAccount;
	
	public static PointOfSaleCanonicalBuilder create(){
		return new PointOfSaleCanonicalBuilder();
	}

	private PointOfSaleCanonicalBuilder(){

	}

	public PointOfSaleCanonicalBuilder setName(final String name){
		this.name = name;
		return this;
	}

	public PointOfSaleCanonicalBuilder setDocument(final DocumentCanonical document){
		this.document = document;
		return this;
	}

	public PointOfSaleCanonicalBuilder setBankAccount(final BankAccountCanonical bankAccount){
		this.bankAccount = bankAccount;
		return this;
	}



	public PointOfSaleCanonical build(){
		return new PointOfSaleCanonical(name, document, bankAccount);
	}
}