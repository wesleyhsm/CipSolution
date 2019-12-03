
package br.com.fourward.cip.canonical.builder;

import java.util.List;

import br.com.fourward.cip.canonical.GeneratorFileNameRulesCanonical;
import br.com.fourward.cip.canonical.PaymentFileGeneratorCanonical;
import br.com.fourward.cip.canonical.PaymentGeneratorCanonical;

public class PaymentFileGeneratorCanonicalBuilder {

	public static PaymentFileGeneratorCanonicalBuilder create() {
		return new PaymentFileGeneratorCanonicalBuilder();
	}

	private PaymentFileGeneratorCanonicalBuilder() {

	}

	private GeneratorFileNameRulesCanonical generatorFileNameRulesCanonical;
	private List<PaymentGeneratorCanonical> paymentGeneratorCanonical;

	public PaymentFileGeneratorCanonicalBuilder
			setGeneratorFileNameRulesCanonical(final GeneratorFileNameRulesCanonical generatorFileNameRulesCanonical) {
		this.generatorFileNameRulesCanonical = generatorFileNameRulesCanonical;
		return this;
	}

	public PaymentFileGeneratorCanonicalBuilder
			setPaymentGeneratorCanonical(final List<PaymentGeneratorCanonical> paymentGeneratorCanonical) {
		this.paymentGeneratorCanonical = paymentGeneratorCanonical;
		return this;
	}

	public PaymentFileGeneratorCanonical build() {
		return new PaymentFileGeneratorCanonical(generatorFileNameRulesCanonical, paymentGeneratorCanonical);
	}
}
