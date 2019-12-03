
package br.com.fourward.cip.xml.rtm.send.builder;

import br.com.fourward.cip.xml.rtm.send.TipoConta;

public class TipoContaBuilder {

	public static TipoContaBuilder create() {
		return new TipoContaBuilder();
	}

	private TipoContaBuilder() {

	}

	private String value;

	public TipoContaBuilder setValue(final String value) {
		this.value = value;
		return this;
	}

	public TipoConta build() {
		return TipoConta.create(value);
	}
}
