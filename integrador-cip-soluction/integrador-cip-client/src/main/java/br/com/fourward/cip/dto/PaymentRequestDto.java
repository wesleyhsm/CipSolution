package br.com.fourward.cip.dto;

import java.io.Serializable;
import java.util.List;

public class PaymentRequestDto implements Serializable {

	private static final long serialVersionUID = 8732180197105614073L;

	private List<PaymentSummaryDto> paymentSummaryDtos;

	public PaymentRequestDto() {

	}

	public PaymentRequestDto(List<PaymentSummaryDto> paymentSummaryDtos) {
		super();
		this.paymentSummaryDtos = paymentSummaryDtos;
	}

	public List<PaymentSummaryDto> getPaymentSummaryDtos() {
		return paymentSummaryDtos;
	}

	public void setPaymentSummaryDtos(List<PaymentSummaryDto> paymentSummaryDtos) {
		this.paymentSummaryDtos = paymentSummaryDtos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((paymentSummaryDtos == null) ? 0 : paymentSummaryDtos.hashCode());
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
		PaymentRequestDto other = (PaymentRequestDto) obj;
		if (paymentSummaryDtos == null) {
			if (other.paymentSummaryDtos != null)
				return false;
		} else if (!paymentSummaryDtos.equals(other.paymentSummaryDtos))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PaymentRequestDto [paymentSummaryDtos=" + paymentSummaryDtos + "]";
	}	
}