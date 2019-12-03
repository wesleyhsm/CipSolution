
package br.com.fourward.cip.xml.rtm.back.ret;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonPropertyOrder({ "ISPBIFDevdr",
		"ISPBIFCredr",
		"SitRetReq",
		"NumCtrlCreddrCentrlzActo",
		"NumCtrlCIPCentrlzActo",
		"NumCtrlCreddrPontoVendaActo",
		"NumCtrlCIPPontoVendaActo",
		"NULiquid",
		"DtHrManut" })
public class GrupoLiquidTranscParcActoPVActoRet {

	private String ispbIfDevdr;
	private String ispbIfCredr;
	private String sitRetReq;
	private String numCtrlCreddrCentrlzActo;
	private String numCtrlCIPCentrlzActo;
	private String numCtrlCreddrPontoVendaActo;
	private String numCtrlCIPPontoVendaActo;
	private String nuLiquid;
	private Date dtHrManut;

	public GrupoLiquidTranscParcActoPVActoRet() {

	}

	public GrupoLiquidTranscParcActoPVActoRet(final String ispbIfDevdr,
			final String ispbIfCredr,
			final String sitRetReq,
			final String numCtrlCreddrCentrlzActo,
			final String numCtrlCIPCentrlzActo,
			final String numCtrlCreddrPontoVendaActo,
			final String numCtrlCIPPontoVendaActo,
			final String nuLiquid,
			final Date dtHrManut) {
		super();
		this.ispbIfDevdr = ispbIfDevdr;
		this.ispbIfCredr = ispbIfCredr;
		this.sitRetReq = sitRetReq;
		this.numCtrlCreddrCentrlzActo = numCtrlCreddrCentrlzActo;
		this.numCtrlCIPCentrlzActo = numCtrlCIPCentrlzActo;
		this.numCtrlCreddrPontoVendaActo = numCtrlCreddrPontoVendaActo;
		this.numCtrlCIPPontoVendaActo = numCtrlCIPPontoVendaActo;
		this.nuLiquid = nuLiquid;
		this.dtHrManut = dtHrManut;
	}

	@JacksonXmlProperty(localName = "ISPBIFDevdr")
	public String getIspbIfDevdr() {
		return ispbIfDevdr;
	}

	public void setIspbIfDevdr(final String ispbIfDevdr) {
		this.ispbIfDevdr = ispbIfDevdr;
	}

	@JacksonXmlProperty(localName = "ISPBIFCredr")
	public String getIspbIfCredr() {
		return ispbIfCredr;
	}

	public void setIspbIfCredr(final String ispbIfCredr) {
		this.ispbIfCredr = ispbIfCredr;
	}

	@JacksonXmlProperty(localName = "SitRetReq")
	public String getSitRetReq() {
		return sitRetReq;
	}

	public void setSitRetReq(final String sitRetReq) {
		this.sitRetReq = sitRetReq;
	}

	@JacksonXmlProperty(localName = "NumCtrlCreddrCentrlzActo")
	public String getNumCtrlCreddrCentrlzActo() {
		return numCtrlCreddrCentrlzActo;
	}

	public void setNumCtrlCreddrCentrlzActo(final String numCtrlCreddrCentrlzActo) {
		this.numCtrlCreddrCentrlzActo = numCtrlCreddrCentrlzActo;
	}

	@JacksonXmlProperty(localName = "NumCtrlCIPCentrlzActo")
	public String getNumCtrlCIPCentrlzActo() {
		return numCtrlCIPCentrlzActo;
	}

	public void setNumCtrlCIPCentrlzActo(final String numCtrlCIPCentrlzActo) {
		this.numCtrlCIPCentrlzActo = numCtrlCIPCentrlzActo;
	}

	@JacksonXmlProperty(localName = "NumCtrlCreddrPontoVendaActo")
	public String getNumCtrlCreddrPontoVendaActo() {
		return numCtrlCreddrPontoVendaActo;
	}

	public void setNumCtrlCreddrPontoVendaActo(final String numCtrlCreddrPontoVendaActo) {
		this.numCtrlCreddrPontoVendaActo = numCtrlCreddrPontoVendaActo;
	}

	@JacksonXmlProperty(localName = "NumCtrlCIPPontoVendaActo")
	public String getNumCtrlCIPPontoVendaActo() {
		return numCtrlCIPPontoVendaActo;
	}

	public void setNumCtrlCIPPontoVendaActo(final String numCtrlCIPPontoVendaActo) {
		this.numCtrlCIPPontoVendaActo = numCtrlCIPPontoVendaActo;
	}

	@JacksonXmlProperty(localName = "NuLiquid")
	public String getNuLiquid() {
		return nuLiquid;
	}

	public void setNuLiquid(final String nuLiquid) {
		this.nuLiquid = nuLiquid;
	}

	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
	@JacksonXmlProperty(localName = "DtHrManut")
	public Date getDtHrManut() {
		return dtHrManut;
	}

	public void setDtHrManut(final Date dtHrManut) {
		this.dtHrManut = dtHrManut;
	}

	@Override
	public String toString() {
		return "GrupoLiquidTranscParcActoPVActo [ispbIfDevdr="
				+ ispbIfDevdr
				+ ", ispbIfCredr="
				+ ispbIfCredr
				+ ", sitRetReq="
				+ sitRetReq
				+ ", numCtrlCreddrCentrlzActo="
				+ numCtrlCreddrCentrlzActo
				+ ", numCtrlCIPCentrlzActo="
				+ numCtrlCIPCentrlzActo
				+ ", numCtrlCreddrPontoVendaActo="
				+ numCtrlCreddrPontoVendaActo
				+ ", numCtrlCIPPontoVendaActo="
				+ numCtrlCIPPontoVendaActo
				+ ", nULiquid="
				+ nuLiquid
				+ ", dtHrManut="
				+ dtHrManut
				+ "]";
	}
}
