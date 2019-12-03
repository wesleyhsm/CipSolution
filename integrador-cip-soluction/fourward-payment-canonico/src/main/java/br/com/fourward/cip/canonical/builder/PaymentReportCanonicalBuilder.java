package br.com.fourward.cip.canonical.builder;

import br.com.fourward.cip.canonical.PaymentReportCanonical;
import br.com.fourward.cip.canonical.PaymentSummaryCanonical;

public class PaymentReportCanonicalBuilder {

	private PaymentSummaryCanonical paymentSummaryCanonical;
	private Long id;
	
	public static PaymentReportCanonicalBuilder create() {
		return new PaymentReportCanonicalBuilder();
	}

	private PaymentReportCanonicalBuilder() {

	}
		
	public PaymentReportCanonicalBuilder setId(final Long id) {
		this.id = id;
		return this;
	}

	public PaymentReportCanonicalBuilder setPaymentSummaryCanonical(
			final PaymentSummaryCanonical paymentSummaryCanonical) {
		this.paymentSummaryCanonical = paymentSummaryCanonical;
		return this;
	}
	
	public PaymentReportCanonical build() {
		return new PaymentReportCanonical(id, paymentSummaryCanonical);
	}
}