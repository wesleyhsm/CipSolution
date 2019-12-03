
package br.com.fourward.cip.xml.rtm.send.builder;

import br.com.fourward.cip.xml.rtm.send.TpPessoaCentrlz;

public class TpPessoaCentrlzBuilder {

	public static TpPessoaCentrlzBuilder create() {
		return new TpPessoaCentrlzBuilder();
	}

	private TpPessoaCentrlzBuilder() {

	}

	private String value;

	public TpPessoaCentrlzBuilder setValue(final String value) {
		this.value = value;
		return this;
	}

	public TpPessoaCentrlz build() {
		return TpPessoaCentrlz.create(value);
	}
}
