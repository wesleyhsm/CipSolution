
package br.com.fourward.cip.xml.rtm.back;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonPropertyOrder({ "NULiquid", "CodOcorc", "DtHrManut" })
public class GrupoLiquidTranscBack {

	private String nuLiquid;
	private List<String> codOcorc;
	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
	private Date dtHrManut;

	public GrupoLiquidTranscBack() {

	}

	public GrupoLiquidTranscBack(final String nuLiquid, final List<String> codOcorc, final Date dtHrManut) {
		super();
		this.nuLiquid = nuLiquid;
		this.codOcorc = codOcorc;
		this.dtHrManut = dtHrManut;
	}

	@JacksonXmlProperty(localName = "NULiquid")
	public String getNuLiquid() {
		return nuLiquid;
	}

	public void setNuLiquid(final String nuLiquid) {
		this.nuLiquid = nuLiquid;
	}

	@JacksonXmlElementWrapper(useWrapping = false)
	@JacksonXmlProperty(localName = "CodOcorc")
	public List<String> getCodOcorc() {
		return codOcorc;
	}

	public void setCodOcorc(final List<String> codOcorc) {
		this.codOcorc = codOcorc;
	}

	@JacksonXmlProperty(localName = "DtHrManut")
	public Date getDtHrManut() {
		return dtHrManut;
	}

	public void setDtHrManut(final Date dtHrManut) {
		this.dtHrManut = dtHrManut;
	}

	@Override
	public String toString() {
		return "GrupoLiquidTransc [nuLiquid=" + nuLiquid + ", codOcorc=" + codOcorc + ", dtHrManut=" + dtHrManut + "]";
	}
}
