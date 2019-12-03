package br.com.fourward.cip.entity.builder;

import br.com.fourward.cip.entity.AccountTypeEntity;

public class AccountTypeBuilder {

	private String value;
	
	public static AccountTypeBuilder create(){
		return new AccountTypeBuilder();
	}

	private AccountTypeBuilder(){

	}	

	public AccountTypeBuilder setValue(final String value){
		this.value = value;
		return this;
	}

	public AccountTypeEntity build(){
		return AccountTypeEntity.create(value);
	}
}