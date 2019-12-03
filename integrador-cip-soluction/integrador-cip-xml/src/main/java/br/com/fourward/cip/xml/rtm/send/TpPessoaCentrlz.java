
package br.com.fourward.cip.xml.rtm.send;

import java.util.Arrays;

public enum TpPessoaCentrlz {

	CPF("F"),
	CNPJ("J");

	private final String value;

	private TpPessoaCentrlz(final String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public static TpPessoaCentrlz create(final String value) {
		return Arrays.asList(TpPessoaCentrlz.values())
				.parallelStream()
				.filter(predicate -> predicate.value.equals(value))
				.findFirst()
				.orElseThrow(() -> new RuntimeException("TpPessoaCentrlz not found"));
	}
}
