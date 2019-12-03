
package br.com.fourward.cip.xml.rtm.send.builder;

import br.com.fourward.cip.xml.rtm.send.TpProdLiquid;

public class TpProdLiquidBuilder {

	public static TpProdLiquidBuilder create() {
		return new TpProdLiquidBuilder();
	}

	private TpProdLiquidBuilder() {

	}

	private String value;

	public TpProdLiquidBuilder setValue(final String value) {
		this.value = value;
		return this;
	}

	public TpProdLiquid build() {
		return TpProdLiquid.create(value);
	}
}
