package br.com.fourward.cip.dto;

import java.io.Serializable;
import java.util.List;

import br.com.fourward.cip.canonical.PaymentReportCanonical;

public class PaymentResponseDto extends MessageResponseDto implements Serializable{
	
	private static final long serialVersionUID = 6695958948147010162L;
	
	private final List<PaymentReportCanonical> paymentReportsCanonical;

	public static PaymentResponseDto create(final Integer code, final String message){
		return create(code, message, null);
	}
	
	public static PaymentResponseDto create(final Integer code, final String message, final List<PaymentReportCanonical> paymentReportsCanonical) {
		return new PaymentResponseDto(code, message, paymentReportsCanonical);
	}
	
	private PaymentResponseDto(final Integer code, final String message, final List<PaymentReportCanonical> paymentReportsCanonical) {
		super(code, message);
		this.paymentReportsCanonical = paymentReportsCanonical;
	}

	public List<PaymentReportCanonical> getPaymentReportsCanonical() {
		return paymentReportsCanonical;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((paymentReportsCanonical == null) ? 0 : paymentReportsCanonical.hashCode());
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
		PaymentResponseDto other = (PaymentResponseDto) obj;
		if (paymentReportsCanonical == null) {
			if (other.paymentReportsCanonical != null)
				return false;
		} else if (!paymentReportsCanonical.equals(other.paymentReportsCanonical))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PaymentResponseDto [paymentReportsCanonical=" + paymentReportsCanonical + "]";
	}	
}
