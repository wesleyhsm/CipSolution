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
@Table(name="document")
public class DocumentEntity implements Serializable{

	private static final long serialVersionUID = -2055606218549469046L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="document_id")
	private Long documentId;
	
	@Enumerated(EnumType.STRING)
	@Column(name="type")
	private DocumentTypeEntity type;
	
	@Column(name="value")
	private String value;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="company_id")
	private CompanyEntity company;

	public DocumentEntity(){
		
	}

	public DocumentEntity(Long documentId, DocumentTypeEntity type, String value, CompanyEntity company) {
		super();
		this.documentId = documentId;
		this.type = type;
		this.value = value;
		this.company = company;
	}

	public Long getDocumentId() {
		return documentId;
	}

	public void setDocumentId(Long documentId) {
		this.documentId = documentId;
	}

	public DocumentTypeEntity getType() {
		return type;
	}

	public void setType(DocumentTypeEntity type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public CompanyEntity getCompany() {
		return company;
	}

	public void setCompany(CompanyEntity company) {
		this.company = company;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((documentId == null) ? 0 : documentId.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
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
		DocumentEntity other = (DocumentEntity) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (documentId == null) {
			if (other.documentId != null)
				return false;
		} else if (!documentId.equals(other.documentId))
			return false;
		if (type != other.type)
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Document [documentId=" + documentId + ", type=" + type + ", value=" + value + ", company=" + company
				+ "]";
	}	
}