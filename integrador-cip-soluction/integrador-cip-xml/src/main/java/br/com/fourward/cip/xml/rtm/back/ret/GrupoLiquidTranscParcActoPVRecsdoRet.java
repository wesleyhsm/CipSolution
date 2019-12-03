
package br.com.fourward.cip.xml.rtm.back.ret;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonPropertyOrder({ "ISPBIFDevdr",
		"ISPBIFCredr",
		"SitRetReq",
		"NumCtrlCreddrCentrlz",
		"TpPessoaCentrlz",
		"CNPJ_CPFCentrlz",
		"CodCentrlz",
		"TpCt",
		"CtPgtoCentrlz",
		"NumCtrlCreddrPontoVenda",
		"ISPBIFLiquidPontoVenda",
		"CodPontoVenda",
		"NomePontoVenda",
		"TpPessoaPontoVenda",
		"CNPJ_CPFPontoVenda",
		"CodInstitdrArrajPgto",
		"TpProdLiquid",
		"IndrFormaTransf",
		"CodMoeda",
		"DtPgto",
		"VlrPgto",
		"Erros" })
public class GrupoLiquidTranscParcActoPVRecsdoRet {

	private String ispbIfDevdr;
	private String ispbIfCredr;
	private String sitRetReq;
	private String numCtrlCreddrCentrlz;
	private String tpPessoaCentrlz;
	private String cnpjCpfCentrlz;
	private String codCentrlz;
	private String tpCt;
	private String ctPgtoCentrlz;
	private String numCtrlCreddrPontoVenda;
	private String ispbIfLiquidPontoVenda;
	private String codPontoVenda;
	private String nomePontoVenda;
	private String tpPessoaPontoVenda;
	private String cnpjCpfPontoVenda;
	private String codInstitdrArrajPgto;
	private String tpProdLiquid;
	private String indrFormaTransf;
	private String codMoeda;
	private Date dtPgto;
	private String vlrPgto;
	private ErrosRet erros;

	public GrupoLiquidTranscParcActoPVRecsdoRet() {

	}

	public GrupoLiquidTranscParcActoPVRecsdoRet(final String ispbIfDevdr,
			final String ispbIfCredr,
			final String sitRetReq,
			final String numCtrlCreddrCentrlz,
			final String tpPessoaCentrlz,
			final String cnpjCpfCentrlz,
			final String codCentrlz,
			final String tpCt,
			final String ctPgtoCentrlz,
			final String numCtrlCreddrPontoVenda,
			final String ispbIfLiquidPontoVenda,
			final String codPontoVenda,
			final String nomePontoVenda,
			final String tpPessoaPontoVenda,
			final String cnpjCpfPontoVenda,
			final String codInstitdrArrajPgto,
			final String tpProdLiquid,
			final String indrFormaTransf,
			final String codMoeda,
			final Date dtPgto,
			final String vlrPgto,
			final ErrosRet erros) {
		super();
		this.ispbIfDevdr = ispbIfDevdr;
		this.ispbIfCredr = ispbIfCredr;
		this.sitRetReq = sitRetReq;
		this.numCtrlCreddrCentrlz = numCtrlCreddrCentrlz;
		this.tpPessoaCentrlz = tpPessoaCentrlz;
		this.cnpjCpfCentrlz = cnpjCpfCentrlz;
		this.codCentrlz = codCentrlz;
		this.tpCt = tpCt;
		this.ctPgtoCentrlz = ctPgtoCentrlz;
		this.numCtrlCreddrPontoVenda = numCtrlCreddrPontoVenda;
		this.ispbIfLiquidPontoVenda = ispbIfLiquidPontoVenda;
		this.codPontoVenda = codPontoVenda;
		this.nomePontoVenda = nomePontoVenda;
		this.tpPessoaPontoVenda = tpPessoaPontoVenda;
		this.cnpjCpfPontoVenda = cnpjCpfPontoVenda;
		this.codInstitdrArrajPgto = codInstitdrArrajPgto;
		this.tpProdLiquid = tpProdLiquid;
		this.indrFormaTransf = indrFormaTransf;
		this.codMoeda = codMoeda;
		this.dtPgto = dtPgto;
		this.vlrPgto = vlrPgto;
		this.erros = erros;
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

	@JacksonXmlProperty(localName = "NumCtrlCreddrCentrlz")
	public String getNumCtrlCreddrCentrlz() {
		return numCtrlCreddrCentrlz;
	}

	public void setNumCtrlCreddrCentrlz(final String numCtrlCreddrCentrlz) {
		this.numCtrlCreddrCentrlz = numCtrlCreddrCentrlz;
	}

	@JacksonXmlProperty(localName = "TpPessoaCentrlz")
	public String getTpPessoaCentrlz() {
		return tpPessoaCentrlz;
	}

	public void setTpPessoaCentrlz(final String tpPessoaCentrlz) {
		this.tpPessoaCentrlz = tpPessoaCentrlz;
	}

	@JacksonXmlProperty(localName = "CNPJ_CPFCentrlz")
	public String getCnpjCpfCentrlz() {
		return cnpjCpfCentrlz;
	}

	public void setCnpjCpfCentrlz(final String cnpjCpfCentrlz) {
		this.cnpjCpfCentrlz = cnpjCpfCentrlz;
	}

	@JacksonXmlProperty(localName = "CodCentrlz")
	public String getCodCentrlz() {
		return codCentrlz;
	}

	public void setCodCentrlz(final String codCentrlz) {
		this.codCentrlz = codCentrlz;
	}

	@JacksonXmlProperty(localName = "TpCt")
	public String getTpCt() {
		return tpCt;
	}

	public void setTpCt(final String tpCt) {
		this.tpCt = tpCt;
	}

	@JacksonXmlProperty(localName = "CtPgtoCentrlz")
	public String getCtPgtoCentrlz() {
		return ctPgtoCentrlz;
	}

	public void setCtPgtoCentrlz(final String ctPgtoCentrlz) {
		this.ctPgtoCentrlz = ctPgtoCentrlz;
	}

	@JacksonXmlProperty(localName = "NumCtrlCreddrPontoVenda")
	public String getNumCtrlCreddrPontoVenda() {
		return numCtrlCreddrPontoVenda;
	}

	public void setNumCtrlCreddrPontoVenda(final String numCtrlCreddrPontoVenda) {
		this.numCtrlCreddrPontoVenda = numCtrlCreddrPontoVenda;
	}

	@JacksonXmlProperty(localName = "ISPBIFLiquidPontoVenda")
	public String getIspbIfLiquidPontoVenda() {
		return ispbIfLiquidPontoVenda;
	}

	public void setIspbIfLiquidPontoVenda(final String ispbIfLiquidPontoVenda) {
		this.ispbIfLiquidPontoVenda = ispbIfLiquidPontoVenda;
	}

	@JacksonXmlProperty(localName = "CodPontoVenda")
	public String getCodPontoVenda() {
		return codPontoVenda;
	}

	public void setCodPontoVenda(final String codPontoVenda) {
		this.codPontoVenda = codPontoVenda;
	}

	@JacksonXmlProperty(localName = "NomePontoVenda")
	public String getNomePontoVenda() {
		return nomePontoVenda;
	}

	public void setNomePontoVenda(final String nomePontoVenda) {
		this.nomePontoVenda = nomePontoVenda;
	}

	@JacksonXmlProperty(localName = "TpPessoaPontoVenda")
	public String getTpPessoaPontoVenda() {
		return tpPessoaPontoVenda;
	}

	public void setTpPessoaPontoVenda(final String tpPessoaPontoVenda) {
		this.tpPessoaPontoVenda = tpPessoaPontoVenda;
	}

	@JacksonXmlProperty(localName = "CNPJ_CPFPontoVenda")
	public String getCnpjCpfPontoVenda() {
		return cnpjCpfPontoVenda;
	}

	public void setCnpjCpfPontoVenda(final String cnpjCpfPontoVenda) {
		this.cnpjCpfPontoVenda = cnpjCpfPontoVenda;
	}

	@JacksonXmlProperty(localName = "CodInstitdrArrajPgto")
	public String getCodInstitdrArrajPgto() {
		return codInstitdrArrajPgto;
	}

	public void setCodInstitdrArrajPgto(final String codInstitdrArrajPgto) {
		this.codInstitdrArrajPgto = codInstitdrArrajPgto;
	}

	@JacksonXmlProperty(localName = "TpProdLiquid")
	public String getTpProdLiquid() {
		return tpProdLiquid;
	}

	public void setTpProdLiquid(final String tpProdLiquid) {
		this.tpProdLiquid = tpProdLiquid;
	}

	@JacksonXmlProperty(localName = "IndrFormaTransf")
	public String getIndrFormaTransf() {
		return indrFormaTransf;
	}

	public void setIndrFormaTransf(final String indrFormaTransf) {
		this.indrFormaTransf = indrFormaTransf;
	}

	@JacksonXmlProperty(localName = "CodMoeda")
	public String getCodMoeda() {
		return codMoeda;
	}

	public void setCodMoeda(final String codMoeda) {
		this.codMoeda = codMoeda;
	}

	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
	@JacksonXmlProperty(localName = "DtPgto")
	public Date getDtPgto() {
		return dtPgto;
	}

	public void setDtPgto(final Date dtPgto) {
		this.dtPgto = dtPgto;
	}

	@JacksonXmlProperty(localName = "VlrPgto")
	public String getVlrPgto() {
		return vlrPgto;
	}

	public void setVlrPgto(final String vlrPgto) {
		this.vlrPgto = vlrPgto;
	}

	@JacksonXmlProperty(localName = "Erros")
	public ErrosRet getErros() {
		return erros;
	}

	public void setErros(final ErrosRet erros) {
		this.erros = erros;
	}

	@Override
	public String toString() {
		return "GrupoLiquidTranscParcActoPVRecsdo [ispbIfDevdr="
				+ ispbIfDevdr
				+ ", ispbIfCredr="
				+ ispbIfCredr
				+ ", sitRetReq="
				+ sitRetReq
				+ ", numCtrlCreddrCentrlz="
				+ numCtrlCreddrCentrlz
				+ ", tpPessoaCentrlz="
				+ tpPessoaCentrlz
				+ ", cnpjCpfCentrlz="
				+ cnpjCpfCentrlz
				+ ", codCentrlz="
				+ codCentrlz
				+ ", tpCt="
				+ tpCt
				+ ", ctPgtoCentrlz="
				+ ctPgtoCentrlz
				+ ", numCtrlCreddrPontoVenda="
				+ numCtrlCreddrPontoVenda
				+ ", ispbIfLiquidPontoVenda="
				+ ispbIfLiquidPontoVenda
				+ ", codPontoVenda="
				+ codPontoVenda
				+ ", nomePontoVenda="
				+ nomePontoVenda
				+ ", tpPessoaPontoVenda="
				+ tpPessoaPontoVenda
				+ ", cnpjCpfPontoVenda="
				+ cnpjCpfPontoVenda
				+ ", codInstitdrArrajPgto="
				+ codInstitdrArrajPgto
				+ ", tpProdLiquid="
				+ tpProdLiquid
				+ ", indrFormaTransf="
				+ indrFormaTransf
				+ ", codMoeda="
				+ codMoeda
				+ ", dtPgto="
				+ dtPgto
				+ ", vlrPgto="
				+ vlrPgto
				+ ", erros="
				+ erros
				+ "]";
	}
}
