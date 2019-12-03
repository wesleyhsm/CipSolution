package br.com.fourward.cip.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "payment")
public class PaymentEntity implements Serializable {

	private static final long serialVersionUID = -4550333525011727612L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "payment_id")
	private Long paymentId;

	@Column(name = "external_key")
	private String externalKey;

	@Column(name = "name_file")
	private String nameFile;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "acquirer")
	private AcquirerEntity acquirer;

	@Enumerated(EnumType.STRING)
	@Column(name = "brand")
	private BrandEntity brand;

	@Enumerated(EnumType.STRING)
	@Column(name = "product_type")
	private ProductTypeEntity productType;

	@Enumerated(EnumType.STRING)
	@Column(name = "operation_type")
	private OperationTypeEntity operationType;

	@Temporal(TemporalType.DATE)
	@Column(name = "date")
	private Date date;

	@Column(name = "amount")
	private BigDecimal amount;

	@OneToMany(mappedBy="paymentEntity", targetEntity=StatusEntity.class, cascade={CascadeType.ALL}, fetch=FetchType.EAGER)
	private List<StatusEntity> statusEntitys;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "pointOfSale_id")
	private PointOfSaleEntity pointOfSaleEntity;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "subAcquirer_id")
	private SubAcquirerEntity subAcquirerEntity;

	public PaymentEntity() {
	}
	
	public PaymentEntity(final Long paymentId, final String externalKey, final AcquirerEntity acquirer, final BrandEntity brand,
			final ProductTypeEntity productType, final OperationTypeEntity operationType, final Date date, final BigDecimal amount,
			final List<StatusEntity> statusEntitys, final PointOfSaleEntity pointOfSaleEntity,
			final SubAcquirerEntity subAcquirerEntity, final String nameFile) {
		super();
		this.paymentId = paymentId;
		this.externalKey = externalKey;
		this.acquirer = acquirer;
		this.brand = brand;
		this.productType = productType;
		this.operationType = operationType;
		this.date = date;
		this.amount = amount;
		this.statusEntitys = statusEntitys;
		this.pointOfSaleEntity = pointOfSaleEntity;
		this.subAcquirerEntity = subAcquirerEntity;
		this.nameFile = nameFile;
	}

	public Long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}

	public String getExternalKey() {
		return externalKey;
	}

	public void setExternalKey(String externalKey) {
		this.externalKey = externalKey;
	}

	public AcquirerEntity getAcquirer() {
		return acquirer;
	}

	public void setAcquirer(AcquirerEntity acquirer) {
		this.acquirer = acquirer;
	}

	public BrandEntity getBrand() {
		return brand;
	}

	public void setBrand(BrandEntity brand) {
		this.brand = brand;
	}

	public ProductTypeEntity getProductType() {
		return productType;
	}

	public void setProductType(ProductTypeEntity productType) {
		this.productType = productType;
	}

	public OperationTypeEntity getOperationType() {
		return operationType;
	}

	public void setOperationType(OperationTypeEntity operationType) {
		this.operationType = operationType;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	
	public List<StatusEntity> getStatusEntitys() {
		return statusEntitys;
	}

	public void setStatusEntitys(List<StatusEntity> statusEntitys) {
		this.statusEntitys = statusEntitys;
	}

	public PointOfSaleEntity getPointOfSaleEntity() {
		return pointOfSaleEntity;
	}

	public void setPointOfSaleEntity(PointOfSaleEntity pointOfSaleEntity) {
		this.pointOfSaleEntity = pointOfSaleEntity;
	}

	public SubAcquirerEntity getSubAcquirerEntity() {
		return subAcquirerEntity;
	}

	public void setSubAcquirerEntity(SubAcquirerEntity subAcquirerEntity) {
		this.subAcquirerEntity = subAcquirerEntity;
	}
		
	public String getNameFile() {
		return nameFile;
	}

	public void setNameFile(String nameFile) {
		this.nameFile = nameFile;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((paymentId == null) ? 0 : paymentId.hashCode());
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
		PaymentEntity other = (PaymentEntity) obj;
		if (paymentId == null) {
			if (other.paymentId != null)
				return false;
		} else if (!paymentId.equals(other.paymentId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PaymentEntity [paymentId=" + paymentId + ", externalKey=" + externalKey + ", nameFile=" + nameFile
				+ ", acquirer=" + acquirer + ", brand=" + brand + ", productType=" + productType + ", operationType="
				+ operationType + ", date=" + date + ", amount=" + amount + ", statusEntitys=" + statusEntitys
				+ ", pointOfSaleEntity=" + pointOfSaleEntity + ", subAcquirerEntity=" + subAcquirerEntity + "]";
	}		
}
