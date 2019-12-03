
package br.com.fourward.cip.xml.rtm.send;

import java.util.Arrays;

public enum TipoConta {

	ContaCorrente("CC"),
	ContaDeposito("CD"),
	ContaPagamento("PG"),
	ContaPoupanca("PP");

	private final String value;

	private TipoConta(final String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public static TipoConta create(final String value) {
		return Arrays.asList(TipoConta.values())
				.parallelStream()
				.filter(predicate -> predicate.value.equals(value))
				.findFirst()
				.orElseThrow(() -> new RuntimeException("TipoConta not found"));
	}
}
