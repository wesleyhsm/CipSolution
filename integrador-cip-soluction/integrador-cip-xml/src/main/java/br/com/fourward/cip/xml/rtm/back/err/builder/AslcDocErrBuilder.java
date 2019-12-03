
package br.com.fourward.cip.xml.rtm.back.err.builder;

import br.com.fourward.cip.xml.rtm.back.err.AslcDocErr;
import br.com.fourward.cip.xml.rtm.back.err.NomArqErr;

public class AslcDocErrBuilder {

	public static AslcDocErrBuilder create() {
		return new AslcDocErrBuilder();
	}

	private AslcDocErrBuilder() {

	}

	private NomArqErr nomArq;

	public AslcDocErrBuilder setNomArq(final NomArqErr nomArq) {
		this.nomArq = nomArq;
		return this;
	}

	public AslcDocErr build() {
		return new AslcDocErr(nomArq);
	}
}
