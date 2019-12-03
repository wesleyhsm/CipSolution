package br.com.fourward.ispbtranslate.entity;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "participant")
public class ParticipantEntity implements Serializable {

	private static final long serialVersionUID = -4395180482639375956L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "participant_id")
	private Long participantId;

	@Column(name = "name")
	private String name;

	@Column(name = "ispb")
	private String ispb;

	@Column(name = "bank_code", unique=true)
	private String bankCode;
	
	public ParticipantEntity() {

	}

	public ParticipantEntity(Long participantId, String name, String ispb, String bankCode) {
		super();
		this.participantId = participantId;
		this.name = name;
		this.ispb = ispb;
		this.bankCode = bankCode;
	}

	public Long getParticipantId() {
		return participantId;
	}

	public void setParticipantId(Long participantId) {
		this.participantId = participantId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIspb() {
		return ispb;
	}

	public void setIspb(String ispb) {
		this.ispb = ispb;
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
		result = prime * result + ((participantId == null) ? 0 : participantId.hashCode());
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
		ParticipantEntity other = (ParticipantEntity) obj;
		if (participantId == null) {
			if (other.participantId != null)
				return false;
		} else if (!participantId.equals(other.participantId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ParticipantEntity [participantId=" + participantId + ", name=" + name + ", ispb=" + ispb + ", bankCode="
				+ bankCode + "]";
	}
}
