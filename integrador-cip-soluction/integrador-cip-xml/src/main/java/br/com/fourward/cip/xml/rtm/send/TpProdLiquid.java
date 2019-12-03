
package br.com.fourward.cip.xml.rtm.send;

import java.util.Arrays;

public enum TpProdLiquid {

	CartaoCredito("1"),
	AjustesCredito("2"),
	CartaoDebito("1"),
	AjusteDebito("3"),
	AntecipaçaoCredenciador("1");

	private final String value;

	private TpProdLiquid(final String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public static TpProdLiquid create(final String value) {
		return Arrays.asList(TpProdLiquid.values())
				.parallelStream()
				.filter(predicate -> predicate.value.equals(value))
				.findFirst()
				.orElseThrow(() -> new RuntimeException("TpProdLiquid not found"));
	}
}
