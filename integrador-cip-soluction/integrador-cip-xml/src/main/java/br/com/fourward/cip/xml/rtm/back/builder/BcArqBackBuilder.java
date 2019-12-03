
package br.com.fourward.cip.xml.rtm.back.builder;

import java.util.Date;

import br.com.fourward.cip.xml.rtm.back.BcArqBack;

public class BcArqBackBuilder {

	public static BcArqBackBuilder create() {
		return new BcArqBackBuilder();
	}

	private BcArqBackBuilder() {

	}

	private String tipoArquivo;
	private String numCtrlEmis;
	private String nsu;
	private Date dtHrArq;

	public BcArqBackBuilder setTipoArquivo(final String tipoArquivo) {
		this.tipoArquivo = tipoArquivo;
		return this;
	}

	public BcArqBackBuilder setNumCtrlEmis(final String numCtrlEmis) {
		this.numCtrlEmis = numCtrlEmis;
		return this;
	}

	public BcArqBackBuilder setNsu(final String nsu) {
		this.nsu = nsu;
		return this;
	}

	public BcArqBackBuilder setDtHrArq(final Date dtHrArq) {
		this.dtHrArq = dtHrArq;
		return this;
	}

	public BcArqBack build() {
		return new BcArqBack(tipoArquivo, numCtrlEmis, nsu, dtHrArq);
	}
}
