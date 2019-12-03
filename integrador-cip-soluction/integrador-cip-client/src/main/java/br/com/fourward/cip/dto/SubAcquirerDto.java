package br.com.fourward.cip.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class SubAcquirerDto implements Serializable{
	
	private static final long serialVersionUID = 8696787588681494198L;
	
	@NotNull(message="O nome da subadquirente não pode ser nulo.")
	@Size(min=1, max=80, message="O nome da subadquirente deve ter tamanho de 1 áte 80 caracteres.")
	private String name;
	
	@NotNull(message="Os dados do documento não pode ser nulo.")
	private DocumentDto document;    
	
	@NotNull(message="Os dados do banco não pode ser nulo.")
	private BankAccountDto bankAccount;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public DocumentDto getDocument() {
		return document;
	}
	public void setDocument(DocumentDto document) {
		this.document = document;
	}
	
	public BankAccountDto getBankAccount() {
		return bankAccount;
	}
	public void setBankAccount(BankAccountDto bankAccount) {
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
		SubAcquirerDto other = (SubAcquirerDto) obj;
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
		return "SubAcquirer [name=" + name + ", document=" + document + ", bankAccount=" + bankAccount + "]";
	}	    
}
			