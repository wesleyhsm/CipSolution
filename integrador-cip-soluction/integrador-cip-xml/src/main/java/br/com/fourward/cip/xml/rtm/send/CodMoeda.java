
package br.com.fourward.cip.xml.rtm.send;

import java.util.Arrays;

public enum CodMoeda {

	Real("790");

	private final String value;

	private CodMoeda(final String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public static CodMoeda create(final String value) {
		return Arrays.asList(CodMoeda.values())
				.parallelStream()
				.filter(predicate -> predicate.value.equals(value))
				.findFirst()
				.orElseThrow(() -> new RuntimeException("CodMoeda not found"));
	}
}
