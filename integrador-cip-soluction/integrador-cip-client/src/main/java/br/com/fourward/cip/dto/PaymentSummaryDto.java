package br.com.fourward.cip.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.validation.Valid;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

public class PaymentSummaryDto implements Serializable{
	
	private static final long serialVersionUID = -6521249258127334123L;
		
	@NotNull(message="O código do pagamento não pode ser nulo.")
	@Size(min=1, max=50, message="O código do pagamento deve ter tamanho de 1 áte 50 caracteres.")
	private String externalKey;
	
	@NotNull(message="O nome da adquirente não pode ser nulo.")
	private AcquirerDto acquirer;
	
	@NotNull(message="O nome da bandeira não pode ser nulo.")
	private BrandDto brand;
	
	@NotNull(message="O tipo do produto não pode ser nulo.")
	private ProductTypeDto productType;
	
	@NotNull(message="O tipo da operação não pode ser nulo.")
	private OperationTypeDto operationType;
	
	@NotNull(message="A data de pagamento não pode ser nulo.")
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date date;
	
	@NotNull(message="O valor do pagamento não pode ser nulo")
	@DecimalMax(value="99999999999999999.99", message="{O valor máximo para pagamento 99999999999999999.99}")
	@DecimalMin(value="00.01", message="{O valor minimo para pagamento 00.01}")
	private BigDecimal amount;   
        
	@NotNull(message="Os dados da subadquirente não pode ser nulo.")
	@Valid
	private SubAcquirerDto subacquirer;
	 
	@NotNull(message="Os dados do ponto de venda não pode ser nulo.")
    @Valid
    private PointOfSaleDto pointOfSale;

	public String getExternalKey() {
		return externalKey;
	}
	public void setExternalKey(String externalKey) {
		this.externalKey = externalKey;
	}

	public AcquirerDto getAcquirer() {
		return acquirer;
	}
	public void setAcquirer(AcquirerDto acquirer) {
		this.acquirer = acquirer;
	}
	
	public BrandDto getBrand() {
		return brand;
	}
	public void setBrand(BrandDto brand) {
		this.brand = brand;
	}
	
	public ProductTypeDto getProductType() {
		return productType;
	}
	public void setProductType(ProductTypeDto productType) {
		this.productType = productType;
	}

	public OperationTypeDto getOperationType() {
		return operationType;
	}
	public void setOperationType(OperationTypeDto operationType) {
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

	public SubAcquirerDto getSubacquirer() {
		return subacquirer;
	}
	public void setSubacquirer(SubAcquirerDto subacquirer) {
		this.subacquirer = subacquirer;
	}

	public PointOfSaleDto getPointOfSale() {
		return pointOfSale;
	}
	public void setPointOfSale(PointOfSaleDto pointOfSale) {
		this.pointOfSale = pointOfSale;
	}
			
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((acquirer == null) ? 0 : acquirer.hashCode());
		result = prime * result + ((amount == null) ? 0 : amount.hashCode());
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((externalKey == null) ? 0 : externalKey.hashCode());
		result = prime * result + ((operationType == null) ? 0 : operationType.hashCode());
		result = prime * result + ((pointOfSale == null) ? 0 : pointOfSale.hashCode());
		result = prime * result + ((productType == null) ? 0 : productType.hashCode());
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
		PaymentSummaryDto other = (PaymentSummaryDto) obj;
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
		if (externalKey == null) {
			if (other.externalKey != null)
				return false;
		} else if (!externalKey.equals(other.externalKey))
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
		if (subacquirer == null) {
			if (other.subacquirer != null)
				return false;
		} else if (!subacquirer.equals(other.subacquirer))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "PaymentSummary [externalKey=" + externalKey + ", acquirer=" + acquirer + ", brand=" + brand
				+ ", productType=" + productType + ", operationType=" + operationType + ", date=" + date + ", amount="
				+ amount + ", subacquirer=" + subacquirer + ", pointOfSale=" + pointOfSale + "]";
	}    
}
