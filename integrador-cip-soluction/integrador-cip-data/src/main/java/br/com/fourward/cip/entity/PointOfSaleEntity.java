package br.com.fourward.cip.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="point_of_sale")
@PrimaryKeyJoinColumn(name="company_id")
public class PointOfSaleEntity extends CompanyEntity implements Serializable{

	private static final long serialVersionUID = -4735020023676313265L;
	
	public PointOfSaleEntity(){
		
	}
	
	public PointOfSaleEntity(List<PaymentEntity> payments) {
		super();
		this.payments = payments;
	}
		
	@OneToMany(mappedBy="pointOfSaleEntity", targetEntity=PaymentEntity.class, cascade={CascadeType.ALL}, fetch=FetchType.LAZY)
	private List<PaymentEntity> payments;
	
	public List<PaymentEntity> getPayments() {
		return payments;
	}

	public void setPayments(List<PaymentEntity> payments) {
		this.payments = payments;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((payments == null) ? 0 : payments.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		PointOfSaleEntity other = (PointOfSaleEntity) obj;
		if (payments == null) {
			if (other.payments != null)
				return false;
		} else if (!payments.equals(other.payments))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PointOfSale [payments=" + payments + "]";
	}	
}
