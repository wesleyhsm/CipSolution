package br.com.fourward.cip.canonical.builder;

import br.com.fourward.cip.canonical.AccountTypeCanonical;
import br.com.fourward.cip.canonical.BankAccountCanonical;

public class BankAccountCanonicalBuilder {

	private String bankCode;
	private String agency;
	private String checking;
	private AccountTypeCanonical accountTypeCanonical;
	
	public static BankAccountCanonicalBuilder create(){
		return new BankAccountCanonicalBuilder();
	}

	private BankAccountCanonicalBuilder(){

	}

	public BankAccountCanonicalBuilder setBankCode(final String bankCode){
		this.bankCode = bankCode;
		return this;
	}

	public BankAccountCanonicalBuilder setAgency(final String agency){
		this.agency = agency;
		return this;
	}

	public BankAccountCanonicalBuilder setChecking(final String checking){
		this.checking = checking;
		return this;
	}

	public BankAccountCanonicalBuilder setAccountTypeCanonical(final AccountTypeCanonical accountTypeCanonical){
		this.accountTypeCanonical = accountTypeCanonical;
		return this;
	}

	public BankAccountCanonical build(){
		return new BankAccountCanonical(bankCode, agency, checking, accountTypeCanonical);
	}
}