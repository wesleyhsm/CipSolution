
package br.com.fourward.cip.xml.rtm.back.ret.builder;

import br.com.fourward.cip.xml.rtm.back.ret.ErroRet;

public class ErroRetBuilder {

	public static ErroRetBuilder create() {
		return new ErroRetBuilder();
	}

	private ErroRetBuilder() {

	}

	private String Campo;
	private String CodErro;

	public ErroRetBuilder setCampo(final String Campo) {
		this.Campo = Campo;
		return this;
	}

	public ErroRetBuilder setCodErro(final String CodErro) {
		this.CodErro = CodErro;
		return this;
	}

	public ErroRet build() {
		return new ErroRet(Campo, CodErro);
	}
}
