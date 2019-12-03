
package br.com.fourward.cip.xml.rtm.send;

import java.util.Arrays;

public enum IndrFormaTransf {
	Siloc("3"),
	DebitoContaCorrente("4"),
	Str("5");

	private final String value;

	private IndrFormaTransf(final String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public static IndrFormaTransf create(final String value) {
		return Arrays.asList(IndrFormaTransf.values())
				.parallelStream()
				.filter(predicate -> predicate.value.equals(value))
				.findFirst()
				.orElseThrow(() -> new RuntimeException("IndrFormaTransf not found"));
	}
}
