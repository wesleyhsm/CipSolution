package br.com.fourward.cip.entity.builder;

import br.com.fourward.cip.entity.AccountTypeEntity;
import br.com.fourward.cip.entity.BankEntity;
import br.com.fourward.cip.entity.CompanyEntity;

public class BankBuilder {

	private Long bankId;
	private String agency;
	private String checking;
	private AccountTypeEntity type;
	private CompanyEntity company;
	private String bankCode;
	
	public static BankBuilder create(){
		return new BankBuilder();
	}

	private BankBuilder(){

	}

	public BankBuilder setBankId(final Long bankId){
		this.bankId = bankId;
		return this;
	}

	public BankBuilder setAgency(final String agency){
		this.agency = agency;
		return this;
	}

	public BankBuilder setChecking(final String checking){
		this.checking = checking;
		return this;
	}

	public BankBuilder setType(final AccountTypeEntity type){
		this.type = type;
		return this;
	}

	public BankBuilder setCompany(final CompanyEntity company){
		this.company = company;
		return this;
	}

	public BankBuilder setBankCode(final String bankCode){
		this.bankCode = bankCode;
		return this;
	}

	public BankEntity build(){
		return new BankEntity(bankId, agency, checking, type, company, bankCode);
	}
}