package br.com.fourward.cip.canonical;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PaymentFileCanonical implements Serializable {

	private static final long serialVersionUID = 2491182276322077123L;
	
	private final Long id;
	private final String nameFile;
	private final String externalId;
	private final AcquirerCanonical acquirer;
	private final BrandCanonical brand;
	private final ProductTypeCanonical productType;
	private final OperationTypeCanonical operationType;
	private final Date date;
	private final BigDecimal amount;
	private final SubAcquirerCanonical subacquirer;
	private final PointOfSaleCanonical pointOfSale;
	private final StatusCanonical statusCanonical;
			
	public PaymentFileCanonical(final Long id, final String nameFile, final String externalId, final AcquirerCanonical acquirer,
			final BrandCanonical brand, ProductTypeCanonical productType, final OperationTypeCanonical operationType, final Date date,
			final BigDecimal amount, final SubAcquirerCanonical subacquirer, final PointOfSaleCanonical pointOfSale,
			final StatusCanonical statusCanonical) {
		super();
		this.id = id;
		this.nameFile = nameFile;
		this.externalId = externalId;
		this.acquirer = acquirer;
		this.brand = brand;
		this.productType = productType;
		this.operationType = operationType;
		this.date = date;
		this.amount = amount;
		this.subacquirer = subacquirer;
		this.pointOfSale = pointOfSale;
		this.statusCanonical = statusCanonical;
	}
		
	public Long getId() {
		return id;
	}

	public String getNameFile() {
		return nameFile;
	}

	public String getExternalId() {
		return externalId;
	}

	public AcquirerCanonical getAcquirer() {
		return acquirer;
	}

	public BrandCanonical getBrand() {
		return brand;
	}

	public ProductTypeCanonical getProductType() {
		return productType;
	}

	public OperationTypeCanonical getOperationType() {
		return operationType;
	}

	public Date getDate() {
		return date;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public SubAcquirerCanonical getSubacquirer() {
		return subacquirer;
	}

	public PointOfSaleCanonical getPointOfSale() {
		return pointOfSale;
	}

	public StatusCanonical getStatusCanonical() {
		return statusCanonical;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		PaymentFileCanonical other = (PaymentFileCanonical) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PaymentFileCanonical [id=" + id + ", externalId=" + externalId + ", acquirer=" + acquirer + ", brand="
				+ brand + ", productType=" + productType + ", operationType=" + operationType + ", date=" + date
				+ ", amount=" + amount + ", subacquirer=" + subacquirer + ", pointOfSale=" + pointOfSale
				+ ", statusCanonical=" + statusCanonical + "]";
	}	
}
