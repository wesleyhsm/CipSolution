package br.com.fourward.cip.entity.converter;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.fourward.cip.Application;
import br.com.fourward.cip.canonical.AccountTypeCanonical;
import br.com.fourward.cip.entity.AccountTypeEntity;
import br.com.fourward.cip.entity.converter.AccountTypeEntityConverter;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=Application.class)
public class AccountTypeEntityConverterTest {
	private AccountTypeEntity expectedSavingsAccount = AccountTypeEntity.SavingsAccount;
	private AccountTypeEntity expectedCheckingAccount = AccountTypeEntity.CheckingAccount;

	@Autowired
	private AccountTypeEntityConverter accountTypeEntityConverter;
	
	@Test(expected=IllegalArgumentException.class)
	public void testNull() {
		final AccountTypeCanonical accountTypeCanonical = null;
		final AccountTypeEntity accountTypeEntity = accountTypeEntityConverter.convert(accountTypeCanonical);
		Assert.assertEquals(expectedSavingsAccount, accountTypeEntity);
	}
	
	@Test
	public void testSavingsAccount() {
		final AccountTypeCanonical accountTypeCanonical = createAccountTypeCanonicalSavingsAccount();
		final AccountTypeEntity accountTypeEntity = accountTypeEntityConverter.convert(accountTypeCanonical);
		Assert.assertEquals(expectedSavingsAccount, accountTypeEntity);
	}

	@Test
	public void testCheckingAccount() {
		final AccountTypeCanonical accountTypeCanonical = createAccountTypeCanonicalCheckingAccount();
		final AccountTypeEntity accountTypeEntity = accountTypeEntityConverter.convert(accountTypeCanonical);
		Assert.assertEquals(expectedCheckingAccount, accountTypeEntity);
	}

	private AccountTypeCanonical createAccountTypeCanonicalSavingsAccount() {
		return AccountTypeCanonical.SavingsAccount;
	}

	private AccountTypeCanonical createAccountTypeCanonicalCheckingAccount() {
		return AccountTypeCanonical.CheckingAccount;
	}
}