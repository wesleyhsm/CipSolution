
package br.com.fourward.cip.xml.rtm.back.pro.builder;

import java.util.Date;

import br.com.fourward.cip.xml.rtm.back.pro.BcArqPro;

public class BcArqProBuilder {

	public static BcArqProBuilder create() {
		return new BcArqProBuilder();
	}

	private BcArqProBuilder() {

	}

	private String tipoArquivo;
	private String numCtrlEmis;
	private String nsu;
	private Date dtHrArq;

	public BcArqProBuilder setTipoArquivo(final String tipoArquivo) {
		this.tipoArquivo = tipoArquivo;
		return this;
	}

	public BcArqProBuilder setNumCtrlEmis(final String numCtrlEmis) {
		this.numCtrlEmis = numCtrlEmis;
		return this;
	}

	public BcArqProBuilder setNsu(final String nsu) {
		this.nsu = nsu;
		return this;
	}

	public BcArqProBuilder setDtHrArq(final Date dtHrArq) {
		this.dtHrArq = dtHrArq;
		return this;
	}

	public BcArqPro build() {
		return new BcArqPro(tipoArquivo, numCtrlEmis, nsu, dtHrArq);
	}
}
