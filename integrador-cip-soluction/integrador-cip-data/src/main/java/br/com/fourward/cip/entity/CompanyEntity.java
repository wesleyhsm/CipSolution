package br.com.fourward.cip.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="company")
@Inheritance(strategy=InheritanceType.JOINED)
public class CompanyEntity implements Serializable{

	private static final long serialVersionUID = -159181890496141044L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="company_id")
	private Long companyId;
	
	@Column(name="name")
	private String name;
	
	@OneToOne(mappedBy="company", targetEntity=DocumentEntity.class, cascade={CascadeType.ALL}, fetch = FetchType.LAZY)
	private DocumentEntity documentEntity;	
	
	@OneToOne(mappedBy="company", targetEntity=BankEntity.class, cascade={CascadeType.ALL}, fetch = FetchType.LAZY)
	private BankEntity bankEntity;

	public CompanyEntity(){
		
	}
	
	public CompanyEntity(Long companyId, String name, DocumentEntity documentEntity, BankEntity bankEntity) {
		super();
		this.companyId = companyId;
		this.name = name;
		this.documentEntity = documentEntity;
		this.bankEntity = bankEntity;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DocumentEntity getDocumentEntity() {
		return documentEntity;
	}

	public void setDocumentEntity(DocumentEntity documentEntity) {
		this.documentEntity = documentEntity;
	}

	public BankEntity getBankEntity() {
		return bankEntity;
	}

	public void setBankEntity(BankEntity bankEntity) {
		this.bankEntity = bankEntity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((companyId == null) ? 0 : companyId.hashCode());
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
		CompanyEntity other = (CompanyEntity) obj;
		if (companyId == null) {
			if (other.companyId != null)
				return false;
		} else if (!companyId.equals(other.companyId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CompanyEntity [companyId=" + companyId + ", name=" + name + ", documentEntity=" + documentEntity
				+ ", bankEntity=" + bankEntity + "]";
	}	
}
