package br.com.fourward.cip.canonical;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PaymentSummaryCanonical implements Serializable {

	private static final long serialVersionUID = -6521249258127334123L;

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
		
	public PaymentSummaryCanonical(String externalId, AcquirerCanonical acquirer, BrandCanonical brand,
			ProductTypeCanonical productType, OperationTypeCanonical operationType, Date date, BigDecimal amount,
			SubAcquirerCanonical subacquirer, PointOfSaleCanonical pointOfSale, StatusCanonical statusCanonical) {
		super();
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
		result = prime * result + ((acquirer == null) ? 0 : acquirer.hashCode());
		result = prime * result + ((amount == null) ? 0 : amount.hashCode());
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((externalId == null) ? 0 : externalId.hashCode());
		result = prime * result + ((operationType == null) ? 0 : operationType.hashCode());
		result = prime * result + ((pointOfSale == null) ? 0 : pointOfSale.hashCode());
		result = prime * result + ((productType == null) ? 0 : productType.hashCode());
		result = prime * result + ((statusCanonical == null) ? 0 : statusCanonical.hashCode());
		result = prime * result + ((subacquirer == null) ? 0 : subacquirer.hashCode());
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
		PaymentSummaryCanonical other = (PaymentSummaryCanonical) obj;
		if (acquirer != other.acquirer)
			return false;
		if (amount == null) {
			if (other.amount != null)
				return false;
		} else if (!amount.equals(other.amount))
			return false;
		if (brand != other.brand)
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (externalId == null) {
			if (other.externalId != null)
				return false;
		} else if (!externalId.equals(other.externalId))
			return false;
		if (operationType != other.operationType)
			return false;
		if (pointOfSale == null) {
			if (other.pointOfSale != null)
				return false;
		} else if (!pointOfSale.equals(other.pointOfSale))
			return false;
		if (productType != other.productType)
			return false;
		if (statusCanonical == null) {
			if (other.statusCanonical != null)
				return false;
		} else if (!statusCanonical.equals(other.statusCanonical))
			return false;
		if (subacquirer == null) {
			if (other.subacquirer != null)
				return false;
		} else if (!subacquirer.equals(other.subacquirer))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PaymentSummaryCanonical [externalId=" + externalId + ", acquirer=" + acquirer + ", brand=" + brand
				+ ", productType=" + productType + ", operationType=" + operationType + ", date=" + date + ", amount="
				+ amount + ", subacquirer=" + subacquirer + ", pointOfSale=" + pointOfSale + ", statusCanonical="
				+ statusCanonical + "]";
	}	
}