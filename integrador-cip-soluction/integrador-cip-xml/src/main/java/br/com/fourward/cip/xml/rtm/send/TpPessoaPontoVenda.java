
package br.com.fourward.cip.xml.rtm.send;

import java.util.Arrays;

public enum TpPessoaPontoVenda {

	CPF("F"),
	CNPJ("J");

	private final String value;

	private TpPessoaPontoVenda(final String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public static TpPessoaPontoVenda create(final String value) {
		return Arrays.asList(TpPessoaPontoVenda.values())
				.parallelStream()
				.filter(predicate -> predicate.value.equals(value))
				.findFirst()
				.orElseThrow(() -> new RuntimeException("TpPessoaPontoVenda not found"));
	}
}
