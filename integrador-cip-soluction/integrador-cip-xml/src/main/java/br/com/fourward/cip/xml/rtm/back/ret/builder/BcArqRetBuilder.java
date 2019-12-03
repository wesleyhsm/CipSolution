
package br.com.fourward.cip.xml.rtm.back.ret.builder;

import java.util.Date;

import br.com.fourward.cip.xml.rtm.back.ret.BcArqRet;

public class BcArqRetBuilder {

	public static BcArqRetBuilder create() {
		return new BcArqRetBuilder();
	}

	private BcArqRetBuilder() {

	}

	private String tipoArquivo;
	private String numCtrlEmis;
	private String nsu;
	private Date dtHrArq;

	public BcArqRetBuilder setTipoArquivo(final String tipoArquivo) {
		this.tipoArquivo = tipoArquivo;
		return this;
	}

	public BcArqRetBuilder setNumCtrlEmis(final String numCtrlEmis) {
		this.numCtrlEmis = numCtrlEmis;
		return this;
	}

	public BcArqRetBuilder setNsu(final String nsu) {
		this.nsu = nsu;
		return this;
	}

	public BcArqRetBuilder setDtHrArq(final Date dtHrArq) {
		this.dtHrArq = dtHrArq;
		return this;
	}

	public BcArqRet build() {
		return new BcArqRet(tipoArquivo, numCtrlEmis, nsu, dtHrArq);
	}
}
