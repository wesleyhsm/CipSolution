package br.com.fourward.cip.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "status")
public class StatusEntity implements Serializable {

	private static final long serialVersionUID = 6278000591901206689L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "status_id")
	private Long statusId;

	@Enumerated(EnumType.STRING)
	@Column(name = "type")
	private StatusTypeEntity statusType;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date")
	private Date date;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "payment_id")
	private PaymentEntity paymentEntity;
	
	public StatusEntity() {

	}

	public StatusEntity(Long statusId, StatusTypeEntity statusType, Date date, PaymentEntity paymentEntity) {
		super();
		this.statusId = statusId;
		this.statusType = statusType;
		this.date = date;
		this.paymentEntity = paymentEntity;
	}

	public Long getStatusId() {
		return statusId;
	}

	public void setStatusId(Long statusId) {
		this.statusId = statusId;
	}

	public StatusTypeEntity getStatusType() {
		return statusType;
	}

	public void setStatusType(StatusTypeEntity statusType) {
		this.statusType = statusType;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
		
	public PaymentEntity getPaymentEntity() {
		return paymentEntity;
	}

	public void setPaymentEntity(PaymentEntity paymentEntity) {
		this.paymentEntity = paymentEntity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((statusId == null) ? 0 : statusId.hashCode());
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
		StatusEntity other = (StatusEntity) obj;
		if (statusId == null) {
			if (other.statusId != null)
				return false;
		} else if (!statusId.equals(other.statusId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "StatusEntity [statusId=" + statusId + ", statusType=" + statusType + ", date=" + date
				+ ", paymentEntity=" + paymentEntity + "]";
	}	
}
