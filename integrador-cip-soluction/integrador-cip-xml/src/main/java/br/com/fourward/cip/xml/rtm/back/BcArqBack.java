
package br.com.fourward.cip.xml.rtm.back;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonPropertyOrder({ "TipoArquivo", "NumCtrlEmis", "Nsu", "DtHrManut" })
public class BcArqBack {

	private String tipoArquivo;
	private String numCtrlEmis;
	private String nsu;
	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
	private Date dtHrArq;

	public BcArqBack() {

	}

	public BcArqBack(final String tipoArquivo, final String numCtrlEmis, final String nsu, final Date dtHrArq) {
		super();
		this.tipoArquivo = tipoArquivo;
		this.numCtrlEmis = numCtrlEmis;
		this.nsu = nsu;
		this.dtHrArq = dtHrArq;
	}

	@JacksonXmlProperty(localName = "TipoArquivo")
	public String getTipoArquivo() {
		return tipoArquivo;
	}

	public void setTipoArquivo(final String tipoArquivo) {
		this.tipoArquivo = tipoArquivo;
	}

	@JacksonXmlProperty(localName = "NumCtrlEmis")
	public String getNumCtrlEmis() {
		return numCtrlEmis;
	}

	public void setNumCtrlEmis(final String numCtrlEmis) {
		this.numCtrlEmis = numCtrlEmis;
	}

	@JacksonXmlProperty(localName = "Nsu")
	public String getNsu() {
		return nsu;
	}

	public void setNsu(final String nsu) {
		this.nsu = nsu;
	}

	@JacksonXmlProperty(localName = "DtHrArq")
	public Date getDtHrArq() {
		return dtHrArq;
	}

	public void setDtHrArq(final Date dtHrArq) {
		this.dtHrArq = dtHrArq;
	}

	@Override
	public String toString() {
		return "BcArq [tipoArquivo="
				+ tipoArquivo
				+ ", numCtrlEmis="
				+ numCtrlEmis
				+ ", nsu="
				+ nsu
				+ ", dtHrArq="
				+ dtHrArq
				+ "]";
	}
}