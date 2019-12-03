
package br.com.fourward.cip.xml.rtm.back.ret.builder;

import java.util.Date;

import br.com.fourward.cip.xml.rtm.back.ret.GrupoLiquidTranscParcActoPVActoRet;

public class GrupoLiquidTranscParcActoPVActoRetBuilder {

	public static GrupoLiquidTranscParcActoPVActoRetBuilder create() {
		return new GrupoLiquidTranscParcActoPVActoRetBuilder();
	}

	private GrupoLiquidTranscParcActoPVActoRetBuilder() {

	}

	private String ispbIfDevdr;
	private String ispbIfCredr;
	private String sitRetReq;
	private String numCtrlCreddrCentrlzActo;
	private String numCtrlCIPCentrlzActo;
	private String numCtrlCreddrPontoVendaActo;
	private String numCtrlCIPPontoVendaActo;
	private String nuLiquid;
	private Date dtHrManut;

	public GrupoLiquidTranscParcActoPVActoRetBuilder setIspbIfDevdr(final String ispbIfDevdr) {
		this.ispbIfDevdr = ispbIfDevdr;
		return this;
	}

	public GrupoLiquidTranscParcActoPVActoRetBuilder setIspbIfCredr(final String ispbIfCredr) {
		this.ispbIfCredr = ispbIfCredr;
		return this;
	}

	public GrupoLiquidTranscParcActoPVActoRetBuilder setSitRetReq(final String sitRetReq) {
		this.sitRetReq = sitRetReq;
		return this;
	}

	public GrupoLiquidTranscParcActoPVActoRetBuilder setNumCtrlCreddrCentrlzActo(final String numCtrlCreddrCentrlzActo) {
		this.numCtrlCreddrCentrlzActo = numCtrlCreddrCentrlzActo;
		return this;
	}

	public GrupoLiquidTranscParcActoPVActoRetBuilder setNumCtrlCIPCentrlzActo(final String numCtrlCIPCentrlzActo) {
		this.numCtrlCIPCentrlzActo = numCtrlCIPCentrlzActo;
		return this;
	}

	public GrupoLiquidTranscParcActoPVActoRetBuilder
			setNumCtrlCreddrPontoVendaActo(final String numCtrlCreddrPontoVendaActo) {
		this.numCtrlCreddrPontoVendaActo = numCtrlCreddrPontoVendaActo;
		return this;
	}

	public GrupoLiquidTranscParcActoPVActoRetBuilder setNumCtrlCIPPontoVendaActo(final String numCtrlCIPPontoVendaActo) {
		this.numCtrlCIPPontoVendaActo = numCtrlCIPPontoVendaActo;
		return this;
	}

	public GrupoLiquidTranscParcActoPVActoRetBuilder setNuLiquid(final String nuLiquid) {
		this.nuLiquid = nuLiquid;
		return this;
	}

	public GrupoLiquidTranscParcActoPVActoRetBuilder setDtHrManut(final Date dtHrManut) {
		this.dtHrManut = dtHrManut;
		return this;
	}

	public GrupoLiquidTranscParcActoPVActoRet build() {
		return new GrupoLiquidTranscParcActoPVActoRet(ispbIfDevdr,
				ispbIfCredr,
				sitRetReq,
				numCtrlCreddrCentrlzActo,
				numCtrlCIPCentrlzActo,
				numCtrlCreddrPontoVendaActo,
				numCtrlCIPPontoVendaActo,
				nuLiquid,
				dtHrManut);
	}
}
