
package br.com.fourward.cip.xml.rtm.back.ret.builder;

import java.util.Date;

import br.com.fourward.cip.xml.rtm.back.ret.ErrosRet;
import br.com.fourward.cip.xml.rtm.back.ret.GrupoLiquidTranscParcActoPVRecsdoRet;

public class GrupoLiquidTranscParcActoPVRecsdoRetBuilder {

	public static GrupoLiquidTranscParcActoPVRecsdoRetBuilder create() {
		return new GrupoLiquidTranscParcActoPVRecsdoRetBuilder();
	}

	private GrupoLiquidTranscParcActoPVRecsdoRetBuilder() {

	}

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

	public GrupoLiquidTranscParcActoPVRecsdoRetBuilder setIspbIfDevdr(final String ispbIfDevdr) {
		this.ispbIfDevdr = ispbIfDevdr;
		return this;
	}

	public GrupoLiquidTranscParcActoPVRecsdoRetBuilder setIspbIfCredr(final String ispbIfCredr) {
		this.ispbIfCredr = ispbIfCredr;
		return this;
	}

	public GrupoLiquidTranscParcActoPVRecsdoRetBuilder setSitRetReq(final String sitRetReq) {
		this.sitRetReq = sitRetReq;
		return this;
	}

	public GrupoLiquidTranscParcActoPVRecsdoRetBuilder setNumCtrlCreddrCentrlz(final String numCtrlCreddrCentrlz) {
		this.numCtrlCreddrCentrlz = numCtrlCreddrCentrlz;
		return this;
	}

	public GrupoLiquidTranscParcActoPVRecsdoRetBuilder setTpPessoaCentrlz(final String tpPessoaCentrlz) {
		this.tpPessoaCentrlz = tpPessoaCentrlz;
		return this;
	}

	public GrupoLiquidTranscParcActoPVRecsdoRetBuilder setCnpjCpfCentrlz(final String cnpjCpfCentrlz) {
		this.cnpjCpfCentrlz = cnpjCpfCentrlz;
		return this;
	}

	public GrupoLiquidTranscParcActoPVRecsdoRetBuilder setCodCentrlz(final String codCentrlz) {
		this.codCentrlz = codCentrlz;
		return this;
	}

	public GrupoLiquidTranscParcActoPVRecsdoRetBuilder setTpCt(final String tpCt) {
		this.tpCt = tpCt;
		return this;
	}

	public GrupoLiquidTranscParcActoPVRecsdoRetBuilder setCtPgtoCentrlz(final String ctPgtoCentrlz) {
		this.ctPgtoCentrlz = ctPgtoCentrlz;
		return this;
	}

	public GrupoLiquidTranscParcActoPVRecsdoRetBuilder setNumCtrlCreddrPontoVenda(final String numCtrlCreddrPontoVenda) {
		this.numCtrlCreddrPontoVenda = numCtrlCreddrPontoVenda;
		return this;
	}

	public GrupoLiquidTranscParcActoPVRecsdoRetBuilder setIspbIfLiquidPontoVenda(final String ispbIfLiquidPontoVenda) {
		this.ispbIfLiquidPontoVenda = ispbIfLiquidPontoVenda;
		return this;
	}

	public GrupoLiquidTranscParcActoPVRecsdoRetBuilder setCodPontoVenda(final String codPontoVenda) {
		this.codPontoVenda = codPontoVenda;
		return this;
	}

	public GrupoLiquidTranscParcActoPVRecsdoRetBuilder setNomePontoVenda(final String nomePontoVenda) {
		this.nomePontoVenda = nomePontoVenda;
		return this;
	}

	public GrupoLiquidTranscParcActoPVRecsdoRetBuilder setTpPessoaPontoVenda(final String tpPessoaPontoVenda) {
		this.tpPessoaPontoVenda = tpPessoaPontoVenda;
		return this;
	}

	public GrupoLiquidTranscParcActoPVRecsdoRetBuilder setCnpjCpfPontoVenda(final String cnpjCpfPontoVenda) {
		this.cnpjCpfPontoVenda = cnpjCpfPontoVenda;
		return this;
	}

	public GrupoLiquidTranscParcActoPVRecsdoRetBuilder setCodInstitdrArrajPgto(final String codInstitdrArrajPgto) {
		this.codInstitdrArrajPgto = codInstitdrArrajPgto;
		return this;
	}

	public GrupoLiquidTranscParcActoPVRecsdoRetBuilder setTpProdLiquid(final String tpProdLiquid) {
		this.tpProdLiquid = tpProdLiquid;
		return this;
	}

	public GrupoLiquidTranscParcActoPVRecsdoRetBuilder setIndrFormaTransf(final String indrFormaTransf) {
		this.indrFormaTransf = indrFormaTransf;
		return this;
	}

	public GrupoLiquidTranscParcActoPVRecsdoRetBuilder setCodMoeda(final String codMoeda) {
		this.codMoeda = codMoeda;
		return this;
	}

	public GrupoLiquidTranscParcActoPVRecsdoRetBuilder setDtPgto(final Date dtPgto) {
		this.dtPgto = dtPgto;
		return this;
	}

	public GrupoLiquidTranscParcActoPVRecsdoRetBuilder setVlrPgto(final String vlrPgto) {
		this.vlrPgto = vlrPgto;
		return this;
	}

	public GrupoLiquidTranscParcActoPVRecsdoRetBuilder setErros(final ErrosRet erros) {
		this.erros = erros;
		return this;
	}

	public GrupoLiquidTranscParcActoPVRecsdoRet build() {
		return new GrupoLiquidTranscParcActoPVRecsdoRet(ispbIfDevdr,
				ispbIfCredr,
				sitRetReq,
				numCtrlCreddrCentrlz,
				tpPessoaCentrlz,
				cnpjCpfCentrlz,
				codCentrlz,
				tpCt,
				ctPgtoCentrlz,
				numCtrlCreddrPontoVenda,
				ispbIfLiquidPontoVenda,
				codPontoVenda,
				nomePontoVenda,
				tpPessoaPontoVenda,
				cnpjCpfPontoVenda,
				codInstitdrArrajPgto,
				tpProdLiquid,
				indrFormaTransf,
				codMoeda,
				dtPgto,
				vlrPgto,
				erros);
	}
}
