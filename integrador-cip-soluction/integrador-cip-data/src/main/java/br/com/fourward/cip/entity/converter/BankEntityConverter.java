package br.com.fourward.cip.entity.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.fourward.cip.canonical.BankAccountCanonical;
import br.com.fourward.cip.entity.AccountTypeEntity;
import br.com.fourward.cip.entity.BankEntity;
import br.com.fourward.cip.entity.builder.BankBuilder;

@Component
public class BankEntityConverter {

	@Autowired
	private AccountTypeEntityConverter accountTypeEntityConverter;
		
	public BankEntity convert(final BankAccountCanonical bankAccountCanonical) {
		
		final Long bankId = null;
		final String bankCode = bankAccountCanonical.getBankCode();
		final String agency = bankAccountCanonical.getAgency();
		final String checking = bankAccountCanonical.getChecking();
		final AccountTypeEntity accountTypeEntity = accountTypeEntityConverter.convert(bankAccountCanonical.getAccountTypeCanonical());
		
		return BankBuilder 
				.create() 
				.setBankId(bankId) 
				.setAgency(agency) 
				.setChecking(checking) 
				.setType(accountTypeEntity) 
				.setBankCode(bankCode) 
				.build();
	}
}
