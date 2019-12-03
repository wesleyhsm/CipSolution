package br.com.fourward.cip.entity;

import java.util.Arrays;

public enum AccountTypeEntity {
	CheckingAccount("Checking Account"),
	SavingsAccount("Savings Account");
	
	private final String value;
	
	private AccountTypeEntity(final String value){
		this.value = value;
	}
	
	public String getValue(){
		return value;
	}
	
	public static AccountTypeEntity create(final String value){
		return Arrays.asList(AccountTypeEntity.values()).parallelStream().filter(predicate->predicate.value.equals(value)).findFirst().orElseThrow(()->new RuntimeException("AccountType not found"));
	}
}
