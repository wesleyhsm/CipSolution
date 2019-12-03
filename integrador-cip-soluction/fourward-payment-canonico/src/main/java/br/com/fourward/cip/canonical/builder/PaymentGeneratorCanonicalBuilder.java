
package br.com.fourward.cip.canonical.builder;

import br.com.fourward.cip.canonical.BankIspbTranslateCanonical;
import br.com.fourward.cip.canonical.PaymentFileCanonical;
import br.com.fourward.cip.canonical.PaymentGeneratorCanonical;

public class PaymentGeneratorCanonicalBuilder {

	public static PaymentGeneratorCanonicalBuilder create() {
		return new PaymentGeneratorCanonicalBuilder();
	}

	private PaymentGeneratorCanonicalBuilder() {

	}

	private PaymentFileCanonical paymentFileCanonical;
	private BankIspbTranslateCanonical bankIspbTranslateCanonicalSubAcquirer;
	private BankIspbTranslateCanonical bankIspbTranslateCanonicalPontoVenda;

	public PaymentGeneratorCanonicalBuilder setPaymentFileCanonical(final PaymentFileCanonical paymentFileCanonical) {
		this.paymentFileCanonical = paymentFileCanonical;
		return this;
	}

	public PaymentGeneratorCanonicalBuilder setBankIspbTranslateCanonicalSubAcquirer(
			final BankIspbTranslateCanonical bankIspbTranslateCanonicalSubAcquirer) {
		this.bankIspbTranslateCanonicalSubAcquirer = bankIspbTranslateCanonicalSubAcquirer;
		return this;
	}

	public PaymentGeneratorCanonicalBuilder setBankIspbTranslateCanonicalPontoVenda(
			final BankIspbTranslateCanonical bankIspbTranslateCanonicalPontoVenda) {
		this.bankIspbTranslateCanonicalPontoVenda = bankIspbTranslateCanonicalPontoVenda;
		return this;
	}

	public PaymentGeneratorCanonical build() {
		return new PaymentGeneratorCanonical(paymentFileCanonical,
				bankIspbTranslateCanonicalSubAcquirer,
				bankIspbTranslateCanonicalPontoVenda);
	}
}
