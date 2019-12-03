
package br.com.fourward.cip.xml.rtm.send.builder;

import br.com.fourward.cip.xml.rtm.send.CodMoeda;

public class CodMoedaBuilder {

	public static CodMoedaBuilder create() {
		return new CodMoedaBuilder();
	}

	private CodMoedaBuilder() {

	}

	private String value;

	public CodMoedaBuilder setValue(final String value) {
		this.value = value;
		return this;
	}

	public CodMoeda build() {
		return CodMoeda.create(value);
	}
}
