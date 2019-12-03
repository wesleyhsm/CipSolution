package br.com.fourward.cip.dto;

import java.util.Arrays;

public enum AccountTypeDto {
	CheckingAccount("Checking Account"),
	SavingsAccount("Savings Account");
	
	private final String value;
	
	private AccountTypeDto(final String value){
		this.value = value;
	}
	
	public String getValue(){
		return value;
	}
	
	public static AccountTypeDto create(final String value){
		return Arrays.asList(AccountTypeDto.values()).parallelStream().filter(predicate->predicate.value.equals(value)).findFirst().orElseThrow(()->new RuntimeException("AccountType not found"));
	}
}
