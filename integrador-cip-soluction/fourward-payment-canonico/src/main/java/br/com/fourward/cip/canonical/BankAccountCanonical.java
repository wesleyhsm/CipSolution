package br.com.fourward.cip.canonical;

import java.io.Serializable;

public class BankAccountCanonical implements Serializable {

	private static final long serialVersionUID = 3617032040917895800L;

	private String bankCode;
	private String agency;
	private String checking;
	private AccountTypeCanonical accountTypeCanonical;

	public BankAccountCanonical() {

	}

	public BankAccountCanonical(String bankCode, String agency, String checking,
			AccountTypeCanonical accountTypeCanonical) {
		super();
		this.bankCode = bankCode;
		this.agency = agency;
		this.checking = checking;
		this.accountTypeCanonical = accountTypeCanonical;
	}

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getAgency() {
		return agency;
	}

	public void setAgency(String agency) {
		this.agency = agency;
	}

	public String getChecking() {
		return checking;
	}

	public void setChecking(String checking) {
		this.checking = checking;
	}

	public AccountTypeCanonical getAccountTypeCanonical() {
		return accountTypeCanonical;
	}

	public void setAccountTypeCanonical(AccountTypeCanonical accountTypeCanonical) {
		this.accountTypeCanonical = accountTypeCanonical;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountTypeCanonical == null) ? 0 : accountTypeCanonical.hashCode());
		result = prime * result + ((agency == null) ? 0 : agency.hashCode());
		result = prime * result + ((bankCode == null) ? 0 : bankCode.hashCode());
		result = prime * result + ((checking == null) ? 0 : checking.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccountCanonical other = (BankAccountCanonical) obj;
		if (accountTypeCanonical != other.accountTypeCanonical)
			return false;
		if (agency == null) {
			if (other.agency != null)
				return false;
		} else if (!agency.equals(other.agency))
			return false;
		if (bankCode == null) {
			if (other.bankCode != null)
				return false;
		} else if (!bankCode.equals(other.bankCode))
			return false;
		if (checking == null) {
			if (other.checking != null)
				return false;
		} else if (!checking.equals(other.checking))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BankAccountCanonical [bankCode=" + bankCode + ", agency=" + agency + ", checking=" + checking
				+ ", accountTypeCanonical=" + accountTypeCanonical + "]";
	}	
}
