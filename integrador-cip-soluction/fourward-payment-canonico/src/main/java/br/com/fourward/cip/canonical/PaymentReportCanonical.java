package br.com.fourward.cip.canonical;

import java.io.Serializable;

public class PaymentReportCanonical implements Serializable{

	private static final long serialVersionUID = 5647218244999166236L;
	
	private final Long id;
	private final PaymentSummaryCanonical paymentSummaryCanonical;

	public PaymentReportCanonical(final Long id, final PaymentSummaryCanonical paymentSummaryCanonical) {
		super();
		this.id = id;
		this.paymentSummaryCanonical = paymentSummaryCanonical;
	}

	public Long getId() {
		return id;
	}

	public PaymentSummaryCanonical getPaymentSummaryCanonical() {
		return paymentSummaryCanonical;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((paymentSummaryCanonical == null) ? 0 : paymentSummaryCanonical.hashCode());
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
		PaymentReportCanonical other = (PaymentReportCanonical) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (paymentSummaryCanonical == null) {
			if (other.paymentSummaryCanonical != null)
				return false;
		} else if (!paymentSummaryCanonical.equals(other.paymentSummaryCanonical))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PaymentReportCanonical [id=" + id + ", paymentSummaryCanonical=" + paymentSummaryCanonical + "]";
	}	
}
