
package br.com.fourward.cip.xml.rtm.send.builder;

import br.com.fourward.cip.xml.rtm.send.IndrFormaTransf;

public class IndrFormaTransfBuilder {

	public static IndrFormaTransfBuilder create() {
		return new IndrFormaTransfBuilder();
	}

	private IndrFormaTransfBuilder() {

	}

	private String value;

	public IndrFormaTransfBuilder setValue(final String value) {
		this.value = value;
		return this;
	}

	public IndrFormaTransf build() {
		return IndrFormaTransf.create(value);
	}
}
