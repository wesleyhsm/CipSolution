package br.com.fourward.cip.canonical;

import java.io.Serializable;

public class PointOfSaleCanonical implements Serializable {

	private static final long serialVersionUID = 7874308780751457472L;

	private String name;
	private DocumentCanonical document;
	private BankAccountCanonical bankAccount;

	public PointOfSaleCanonical() {

	}

	public PointOfSaleCanonical(String name, DocumentCanonical document, BankAccountCanonical bankAccount) {
		super();
		this.name = name;
		this.document = document;
		this.bankAccount = bankAccount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DocumentCanonical getDocument() {
		return document;
	}

	public void setDocument(DocumentCanonical document) {
		this.document = document;
	}

	public BankAccountCanonical getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(BankAccountCanonical bankAccount) {
		this.bankAccount = bankAccount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bankAccount == null) ? 0 : bankAccount.hashCode());
		result = prime * result + ((document == null) ? 0 : document.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		PointOfSaleCanonical other = (PointOfSaleCanonical) obj;
		if (bankAccount == null) {
			if (other.bankAccount != null)
				return false;
		} else if (!bankAccount.equals(other.bankAccount))
			return false;
		if (document == null) {
			if (other.document != null)
				return false;
		} else if (!document.equals(other.document))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PointOfSale [document=" + document + ", name=" + name + ", bankAccount=" + bankAccount + "]";
	}
}