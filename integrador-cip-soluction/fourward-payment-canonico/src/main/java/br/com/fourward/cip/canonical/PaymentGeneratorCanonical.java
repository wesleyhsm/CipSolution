
package br.com.fourward.cip.canonical;

import java.io.Serializable;

public class PaymentGeneratorCanonical implements Serializable {

	private static final long serialVersionUID = 6833927351106033892L;

	private final PaymentFileCanonical paymentFileCanonical;
	private final BankIspbTranslateCanonical bankIspbTranslateCanonicalSubAcquirer;
	private final BankIspbTranslateCanonical bankIspbTranslateCanonicalPontoVenda;

	public PaymentGeneratorCanonical(final PaymentFileCanonical paymentFileCanonical,
			final BankIspbTranslateCanonical bankIspbTranslateCanonicalSubAcquirer,
			final BankIspbTranslateCanonical bankIspbTranslateCanonicalPontoVenda) {
		super();
		this.paymentFileCanonical = paymentFileCanonical;
		this.bankIspbTranslateCanonicalSubAcquirer = bankIspbTranslateCanonicalSubAcquirer;
		this.bankIspbTranslateCanonicalPontoVenda = bankIspbTranslateCanonicalPontoVenda;
	}

	public PaymentFileCanonical getPaymentFileCanonical() {
		return paymentFileCanonical;
	}

	public BankIspbTranslateCanonical getBankIspbTranslateCanonicalSubAcquirer() {
		return bankIspbTranslateCanonicalSubAcquirer;
	}

	public BankIspbTranslateCanonical getBankIspbTranslateCanonicalPontoVenda() {
		return bankIspbTranslateCanonicalPontoVenda;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (prime * result)
				+ ((bankIspbTranslateCanonicalPontoVenda == null) ? 0
						: bankIspbTranslateCanonicalPontoVenda.hashCode());
		result = (prime * result)
				+ ((bankIspbTranslateCanonicalSubAcquirer == null) ? 0
						: bankIspbTranslateCanonicalSubAcquirer.hashCode());
		result = (prime * result) + ((paymentFileCanonical == null) ? 0 : paymentFileCanonical.hashCode());
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
		final PaymentGeneratorCanonical other = (PaymentGeneratorCanonical) obj;
		if (bankIspbTranslateCanonicalPontoVenda == null) {
			if (other.bankIspbTranslateCanonicalPontoVenda != null) {
				return false;
			}
		} else if (!bankIspbTranslateCanonicalPontoVenda.equals(other.bankIspbTranslateCanonicalPontoVenda)) {
			return false;
		}
		if (bankIspbTranslateCanonicalSubAcquirer == null) {
			if (other.bankIspbTranslateCanonicalSubAcquirer != null) {
				return false;
			}
		} else if (!bankIspbTranslateCanonicalSubAcquirer.equals(other.bankIspbTranslateCanonicalSubAcquirer)) {
			return false;
		}
		if (paymentFileCanonical == null) {
			if (other.paymentFileCanonical != null) {
				return false;
			}
		} else if (!paymentFileCanonical.equals(other.paymentFileCanonical)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "PaymentGeneratorCanonical [paymentFileCanonical="
				+ paymentFileCanonical
				+ ", bankIspbTranslateCanonicalSubAcquirer="
				+ bankIspbTranslateCanonicalSubAcquirer
				+ ", bankIspbTranslateCanonicalPontoVenda="
				+ bankIspbTranslateCanonicalPontoVenda
				+ "]";
	}
}
