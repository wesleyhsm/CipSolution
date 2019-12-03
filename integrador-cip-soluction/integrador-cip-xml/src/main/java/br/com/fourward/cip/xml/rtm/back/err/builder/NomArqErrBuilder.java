
package br.com.fourward.cip.xml.rtm.back.err.builder;

import br.com.fourward.cip.xml.rtm.back.err.NomArqErr;

public class NomArqErrBuilder {

	public static NomArqErrBuilder create() {
		return new NomArqErrBuilder();
	}

	private NomArqErrBuilder() {

	}

	private String content;
	private String codErro;

	public NomArqErrBuilder setContent(final String content) {
		this.content = content;
		return this;
	}

	public NomArqErrBuilder setCodErro(final String codErro) {
		this.codErro = codErro;
		return this;
	}

	public NomArqErr build() {
		return new NomArqErr(content, codErro);
	}
}
