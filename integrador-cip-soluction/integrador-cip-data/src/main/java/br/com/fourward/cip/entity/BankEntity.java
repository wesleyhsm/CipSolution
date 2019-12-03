package br.com.fourward.cip.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="bank")
public class BankEntity implements Serializable{
	   
	private static final long serialVersionUID = 3617032040917895800L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="bank_id")
	private Long bankId;	
		
	@Column(name="agency")
	private String agency;
	
	@Column(name="checking")
	private String checking;
	
	@Enumerated(EnumType.STRING)
	@Column(name="type")
    private AccountTypeEntity type;
    
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="company_id")
	private CompanyEntity company;
	
	@Column(name = "bank_code")
	private String bankCode;
	
	public BankEntity(){
		
	}
	
	public BankEntity(Long bankId, String agency, String checking, AccountTypeEntity type, CompanyEntity company,
			String bankCode) {
		super();
		this.bankId = bankId;
		this.agency = agency;
		this.checking = checking;
		this.type = type;
		this.company = company;
		this.bankCode = bankCode;
	}

	public Long getBankId() {
		return bankId;
	}

	public void setBankId(Long bankId) {
		this.bankId = bankId;
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

	public AccountTypeEntity getType() {
		return type;
	}

	public void setType(AccountTypeEntity type) {
		this.type = type;
	}

	public CompanyEntity getCompany() {
		return company;
	}

	public void setCompany(CompanyEntity company) {
		this.company = company;
	}
	
	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bankId == null) ? 0 : bankId.hashCode());
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
		BankEntity other = (BankEntity) obj;
		if (bankId == null) {
			if (other.bankId != null)
				return false;
		} else if (!bankId.equals(other.bankId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BankEntity [bankId=" + bankId + ", agency=" + agency + ", checking=" + checking + ", type=" + type
				+ ", company=" + company + ", bankCode=" + bankCode + "]";
	}	
}
