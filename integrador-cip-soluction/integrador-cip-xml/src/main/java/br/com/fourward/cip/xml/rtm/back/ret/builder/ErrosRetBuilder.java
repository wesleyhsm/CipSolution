
package br.com.fourward.cip.xml.rtm.back.ret.builder;

import java.util.List;

import br.com.fourward.cip.xml.rtm.back.ret.ErroRet;
import br.com.fourward.cip.xml.rtm.back.ret.ErrosRet;

public class ErrosRetBuilder {

	public static ErrosRetBuilder create() {
		return new ErrosRetBuilder();
	}

	private ErrosRetBuilder() {

	}

	private List<ErroRet> erros;

	public ErrosRetBuilder setErro(final List<ErroRet> erros) {
		this.erros = erros;
		return this;
	}

	public ErrosRet build() {
		return new ErrosRet(erros);
	}
}
