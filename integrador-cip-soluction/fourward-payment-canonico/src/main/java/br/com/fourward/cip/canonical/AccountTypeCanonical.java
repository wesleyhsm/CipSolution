package br.com.fourward.cip.canonical;

import java.util.Arrays;

public enum AccountTypeCanonical {
	CheckingAccount("Checking Account"),
	SavingsAccount("Savings Account");
	
	private final String value;
	
	private AccountTypeCanonical(final String value){
		this.value = value;
	}
	
	public String getValue(){
		return value;
	}
	
	public static AccountTypeCanonical create(final String value){
		return Arrays.asList(AccountTypeCanonical.values()).parallelStream().filter(predicate->predicate.value.equals(value)).findFirst().orElseThrow(()->new RuntimeException("AccountType not found"));
	}
}
