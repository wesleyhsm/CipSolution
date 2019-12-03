package br.com.fourward.cip.entity.converter;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import br.com.fourward.cip.canonical.AccountTypeCanonical;
import br.com.fourward.cip.entity.AccountTypeEntity;
import br.com.fourward.cip.entity.builder.AccountTypeBuilder;

@Component
public class AccountTypeEntityConverter {

	public AccountTypeEntity convert(final AccountTypeCanonical accountTypeCanonical) {
		
		Assert.notNull(accountTypeCanonical, "accountTypeCanonical is null.");
		Assert.notNull(accountTypeCanonical.getValue(), "accountTypeCanonical.Value is null.");
		return AccountTypeBuilder 
				.create() 
				.setValue(accountTypeCanonical.getValue()) 
				.build();
	}
}
