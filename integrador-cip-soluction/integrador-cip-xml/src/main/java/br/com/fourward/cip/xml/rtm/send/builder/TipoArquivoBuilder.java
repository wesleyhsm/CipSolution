
package br.com.fourward.cip.xml.rtm.send.builder;

import br.com.fourward.cip.xml.rtm.send.TipoArquivo;

public class TipoArquivoBuilder {

	public static TipoArquivoBuilder create() {
		return new TipoArquivoBuilder();
	}

	private TipoArquivoBuilder() {

	}

	private String value;

	public TipoArquivoBuilder setValue(final String value) {
		this.value = value;
		return this;
	}

	public TipoArquivo build() {
		return TipoArquivo.create(value);
	}
}
