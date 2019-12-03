
package br.com.fourward.cip.canonical;

import java.io.Serializable;
import java.util.List;

public class PaymentFileGeneratorCanonical implements Serializable {

	private static final long serialVersionUID = 3522851243011780262L;

	private final GeneratorFileNameRulesCanonical generatorFileNameRulesCanonical;
	private final List<PaymentGeneratorCanonical> paymentGeneratorCanonical;

	public PaymentFileGeneratorCanonical(final GeneratorFileNameRulesCanonical generatorFileNameRulesCanonical,
			final List<PaymentGeneratorCanonical> paymentGeneratorCanonical) {
		super();
		this.generatorFileNameRulesCanonical = generatorFileNameRulesCanonical;
		this.paymentGeneratorCanonical = paymentGeneratorCanonical;
	}

	public GeneratorFileNameRulesCanonical getGeneratorFileNameRulesCanonical() {
		return generatorFileNameRulesCanonical;
	}

	public List<PaymentGeneratorCanonical> getPaymentGeneratorCanonical() {
		return paymentGeneratorCanonical;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (prime * result)
				+ ((generatorFileNameRulesCanonical == null) ? 0 : generatorFileNameRulesCanonical.hashCode());
		result = (prime * result) + ((paymentGeneratorCanonical == null) ? 0 : paymentGeneratorCanonical.hashCode());
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final PaymentFileGeneratorCanonical other = (PaymentFileGeneratorCanonical) obj;
		if (generatorFileNameRulesCanonical == null) {
			if (other.generatorFileNameRulesCanonical != null) {
				return false;
			}
		} else if (!generatorFileNameRulesCanonical.equals(other.generatorFileNameRulesCanonical)) {
			return false;
		}
		if (paymentGeneratorCanonical == null) {
			if (other.paymentGeneratorCanonical != null) {
				return false;
			}
		} else if (!paymentGeneratorCanonical.equals(other.paymentGeneratorCanonical)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "PaymentFileGeneratorCanonical [generatorFileNameRulesCanonical="
				+ generatorFileNameRulesCanonical
				+ ", paymentGeneratorCanonical="
				+ paymentGeneratorCanonical
				+ "]";
	}
}
