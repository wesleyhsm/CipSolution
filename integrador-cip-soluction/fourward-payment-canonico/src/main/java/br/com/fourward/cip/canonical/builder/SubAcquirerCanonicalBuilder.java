package br.com.fourward.cip.canonical.builder;

import br.com.fourward.cip.canonical.BankAccountCanonical;
import br.com.fourward.cip.canonical.DocumentCanonical;
import br.com.fourward.cip.canonical.SubAcquirerCanonical;

public class SubAcquirerCanonicalBuilder {

	private String name;
	private DocumentCanonical document;
	private BankAccountCanonical bankAccount;
	
	public static SubAcquirerCanonicalBuilder create(){
		return new SubAcquirerCanonicalBuilder();
	}

	private SubAcquirerCanonicalBuilder(){

	}

	public SubAcquirerCanonicalBuilder setName(final String name){
		this.name = name;
		return this;
	}

	public SubAcquirerCanonicalBuilder setDocument(final DocumentCanonical document){
		this.document = document;
		return this;
	}

	public SubAcquirerCanonicalBuilder setBankAccount(final BankAccountCanonical bankAccount){
		this.bankAccount = bankAccount;
		return this;
	}

	public SubAcquirerCanonical build(){
		return new SubAcquirerCanonical(name, document, bankAccount);
	}
}