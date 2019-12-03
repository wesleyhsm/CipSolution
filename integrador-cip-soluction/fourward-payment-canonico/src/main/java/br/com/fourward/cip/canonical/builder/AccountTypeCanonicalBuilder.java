package br.com.fourward.cip.canonical.builder;

import br.com.fourward.cip.canonical.AccountTypeCanonical;

public class AccountTypeCanonicalBuilder {
	
	private String value;
	
	public static AccountTypeCanonicalBuilder create() {
		return new AccountTypeCanonicalBuilder();
	}

	private AccountTypeCanonicalBuilder() {

	}
	
	public AccountTypeCanonicalBuilder setValue(final String value) {
		this.value = value;
		return this;
	}

	public AccountTypeCanonical build() {
		return AccountTypeCanonical.create(value);
	}
}
