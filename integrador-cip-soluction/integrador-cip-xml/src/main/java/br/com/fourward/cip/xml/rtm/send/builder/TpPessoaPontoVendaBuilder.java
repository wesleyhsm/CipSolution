
package br.com.fourward.cip.xml.rtm.send.builder;

import br.com.fourward.cip.xml.rtm.send.TpPessoaPontoVenda;

public class TpPessoaPontoVendaBuilder {

	public static TpPessoaPontoVendaBuilder create() {
		return new TpPessoaPontoVendaBuilder();
	}

	private TpPessoaPontoVendaBuilder() {

	}

	private String value;

	public TpPessoaPontoVendaBuilder setValue(final String value) {
		this.value = value;
		return this;
	}

	public TpPessoaPontoVenda build() {
		return TpPessoaPontoVenda.create(value);
	}
}
