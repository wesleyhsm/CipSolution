
package br.com.fourward.cip.xml.rtm.send;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonPropertyOrder({ "tipoArquivo",
		"ispbIfDevdr",
		"ispbIfCredr",
		"agCreddr",
		"ctCreddr",
		"numCtrlCreddrCentrlz",
		"tpPessoaCentrlz",
		"cnpjCpfCentrlz",
		"codCentrlz",
		"tpCt",
		"agCentrlz",
		"ctCentrlz",
		"numCtrlCreddrPontoVenda",
		"ispbIfLiquidPontoVenda",
		"codPontoVenda",
		"nomePontoVenda",
		"tpPessoaPontoVenda",
		"cnpjCpfPontoVenda",
		" codInstitdrArrajPgto",
		"tpProdLiquid",
		"indrFormaTransf",
		"codMoeda",
		"dtPgto",
		"vlrPgto" })
public class GrupoLiquidTransc {

	private String tipoArquivo;
	private String ispbIfDevdr;
	private String ispbIfCredr;
	private String agCreddr;
	private String ctCreddr;
	private String numCtrlCreddrCentrlz;
	private String tpPessoaCentrlz;
	private String cnpjCpfCentrlz;
	private String codCentrlz;
	private String tpCt;
	private String agCentrlz;
	private String ctCentrlz;
	private String numCtrlCreddrPontoVenda;
	private String ispbIfLiquidPontoVenda;
	private String codPontoVenda;
	private String nomePontoVenda;
	private String tpPessoaPontoVenda;
	private String cnpjCpfPontoVenda;
	private Integer codInstitdrArrajPgto;
	private String tpProdLiquid;
	private String indrFormaTransf;
	private String codMoeda;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date dtPgto;
	private BigDecimal vlrPgto;

	public GrupoLiquidTransc() {

	}

	public GrupoLiquidTransc(final String cnpjCpfPontoVenda,
			final String tipoArquivo,
			final String codCentrlz,
			final String tpCt,
			final String ctCentrlz,
			final String codMoeda,
			final String ispbIfDevdr,
			final String numCtrlCreddrCentrlz,
			final String numCtrlCreddrPontoVenda,
			final String tpProdLiquid,
			final String indrFormaTransf,
			final String tpPessoaCentrlz,
			final String codPontoVenda,
			final String agCentrlz,
			final String agCreddr,
			final String ispbIfCredr,
			final String ispbIfLiquidPontoVenda,
			final Date dtPgto,
			final Integer codInstitdrArrajPgto,
			final String nomePontoVenda,
			final String tpPessoaPontoVenda,
			final String cnpjCpfCentrlz,
			final String ctCreddr,
			final BigDecimal vlrPgto) {
		super();
		this.cnpjCpfPontoVenda = cnpjCpfPontoVenda;
		this.tipoArquivo = tipoArquivo;
		this.codCentrlz = codCentrlz;
		this.tpCt = tpCt;
		this.ctCentrlz = ctCentrlz;
		this.codMoeda = codMoeda;
		this.ispbIfDevdr = ispbIfDevdr;
		this.numCtrlCreddrCentrlz = numCtrlCreddrCentrlz;
		this.numCtrlCreddrPontoVenda = numCtrlCreddrPontoVenda;
		this.tpProdLiquid = tpProdLiquid;
		this.indrFormaTransf = indrFormaTransf;
		this.tpPessoaCentrlz = tpPessoaCentrlz;
		this.codPontoVenda = codPontoVenda;
		this.agCentrlz = agCentrlz;
		this.agCreddr = agCreddr;
		this.ispbIfCredr = ispbIfCredr;
		this.ispbIfLiquidPontoVenda = ispbIfLiquidPontoVenda;
		this.dtPgto = dtPgto;
		this.codInstitdrArrajPgto = codInstitdrArrajPgto;
		this.nomePontoVenda = nomePontoVenda;
		this.tpPessoaPontoVenda = tpPessoaPontoVenda;
		this.cnpjCpfCentrlz = cnpjCpfCentrlz;
		this.ctCreddr = ctCreddr;
		this.vlrPgto = vlrPgto;
	}

	@JacksonXmlProperty(localName = "TipoArquivo")
	public String getTipoArquivo() {
		return tipoArquivo;
	}

	public void setTipoArquivo(final String tipoArquivo) {
		this.tipoArquivo = tipoArquivo;
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

	@JacksonXmlProperty(localName = "AgCreddr")
	public String getAgCreddr() {
		return agCreddr;
	}

	public void setAgCreddr(final String agCreddr) {
		this.agCreddr = agCreddr;
	}

	@JacksonXmlProperty(localName = "CtCreddr")
	public String getCtCreddr() {
		return ctCreddr;
	}

	public void setCtCreddr(final String ctCreddr) {
		this.ctCreddr = ctCreddr;
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

	@JacksonXmlProperty(localName = "AgCentrlz")
	public String getAgCentrlz() {
		return agCentrlz;
	}

	public void setAgCentrlz(final String agCentrlz) {
		this.agCentrlz = agCentrlz;
	}

	@JacksonXmlProperty(localName = "CtCentrlz")
	public String getCtCentrlz() {
		return ctCentrlz;
	}

	public void setCtCentrlz(final String ctCentrlz) {
		this.ctCentrlz = ctCentrlz;
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
	public Integer getCodInstitdrArrajPgto() {
		return codInstitdrArrajPgto;
	}

	public void setCodInstitdrArrajPgto(final Integer codInstitdrArrajPgto) {
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

	@JacksonXmlProperty(localName = "DtPgto")
	public Date getDtPgto() {
		return dtPgto;
	}

	public void setDtPgto(final Date dtPgto) {
		this.dtPgto = dtPgto;
	}

	@JacksonXmlProperty(localName = "VlrPgto")
	public BigDecimal getVlrPgto() {
		return vlrPgto;
	}

	public void setVlrPgto(final BigDecimal vlrPgto) {
		this.vlrPgto = vlrPgto;
	}

	@Override
	public String toString() {
		return "GrupoLiquidTransc [cnpjCpfPontoVenda="
				+ cnpjCpfPontoVenda
				+ ", tipoArquivo="
				+ tipoArquivo
				+ ", codCentrlz="
				+ codCentrlz
				+ ", tpCt="
				+ tpCt
				+ ", ctCentrlz="
				+ ctCentrlz
				+ ", codMoeda="
				+ codMoeda
				+ ", ispbIfDevdr="
				+ ispbIfDevdr
				+ ", numCtrlCreddrCentrlz="
				+ numCtrlCreddrCentrlz
				+ ", numCtrlCreddrPontoVenda="
				+ numCtrlCreddrPontoVenda
				+ ", tpProdLiquid="
				+ tpProdLiquid
				+ ", indrFormaTransf="
				+ indrFormaTransf
				+ ", tpPessoaCentrlz="
				+ tpPessoaCentrlz
				+ ", codPontoVenda="
				+ codPontoVenda
				+ ", agCentrlz="
				+ agCentrlz
				+ ", agCreddr="
				+ agCreddr
				+ ", ispbIfCredr="
				+ ispbIfCredr
				+ ", ispbIfLiquidPontoVenda="
				+ ispbIfLiquidPontoVenda
				+ ", dtPgto="
				+ dtPgto
				+ ", codInstitdrArrajPgto="
				+ codInstitdrArrajPgto
				+ ", nomePontoVenda="
				+ nomePontoVenda
				+ ", tpPessoaPontoVenda="
				+ tpPessoaPontoVenda
				+ ", cnpjCpfCentrlz="
				+ cnpjCpfCentrlz
				+ ", ctCreddr="
				+ ctCreddr
				+ ", vlrPgto="
				+ vlrPgto
				+ "]";
	}
}
