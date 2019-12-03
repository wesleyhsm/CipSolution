
package br.com.fourward.cip.xml.rtm.send.builder;

import java.math.BigDecimal;
import java.util.Date;

import br.com.fourward.cip.xml.rtm.send.GrupoLiquidTransc;

public class GrupoLiquidTranscBuilder {

	public static GrupoLiquidTranscBuilder create() {
		return new GrupoLiquidTranscBuilder();
	}

	private GrupoLiquidTranscBuilder() {

	}

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
	private Date dtPgto;
	private BigDecimal vlrPgto;

	public GrupoLiquidTranscBuilder setTipoArquivo(final String tipoArquivo) {
		this.tipoArquivo = tipoArquivo;
		return this;
	}

	public GrupoLiquidTranscBuilder setIspbIfDevdr(final String ispbIfDevdr) {
		this.ispbIfDevdr = ispbIfDevdr;
		return this;
	}

	public GrupoLiquidTranscBuilder setIspbIfCredr(final String ispbIfCredr) {
		this.ispbIfCredr = ispbIfCredr;
		return this;
	}

	public GrupoLiquidTranscBuilder setAgCreddr(final String agCreddr) {
		this.agCreddr = agCreddr;
		return this;
	}

	public GrupoLiquidTranscBuilder setCtCreddr(final String ctCreddr) {
		this.ctCreddr = ctCreddr;
		return this;
	}

	public GrupoLiquidTranscBuilder setNumCtrlCreddrCentrlz(final String numCtrlCreddrCentrlz) {
		this.numCtrlCreddrCentrlz = numCtrlCreddrCentrlz;
		return this;
	}

	public GrupoLiquidTranscBuilder setTpPessoaCentrlz(final String tpPessoaCentrlz) {
		this.tpPessoaCentrlz = tpPessoaCentrlz;
		return this;
	}

	public GrupoLiquidTranscBuilder setCnpjCpfCentrlz(final String cnpjCpfCentrlz) {
		this.cnpjCpfCentrlz = cnpjCpfCentrlz;
		return this;
	}

	public GrupoLiquidTranscBuilder setCodCentrlz(final String codCentrlz) {
		this.codCentrlz = codCentrlz;
		return this;
	}

	public GrupoLiquidTranscBuilder setTpCt(final String tpCt) {
		this.tpCt = tpCt;
		return this;
	}

	public GrupoLiquidTranscBuilder setAgCentrlz(final String agCentrlz) {
		this.agCentrlz = agCentrlz;
		return this;
	}

	public GrupoLiquidTranscBuilder setCtCentrlz(final String ctCentrlz) {
		this.ctCentrlz = ctCentrlz;
		return this;
	}

	public GrupoLiquidTranscBuilder setNumCtrlCreddrPontoVenda(final String numCtrlCreddrPontoVenda) {
		this.numCtrlCreddrPontoVenda = numCtrlCreddrPontoVenda;
		return this;
	}

	public GrupoLiquidTranscBuilder setIspbIfLiquidPontoVenda(final String ispbIfLiquidPontoVenda) {
		this.ispbIfLiquidPontoVenda = ispbIfLiquidPontoVenda;
		return this;
	}

	public GrupoLiquidTranscBuilder setCodPontoVenda(final String codPontoVenda) {
		this.codPontoVenda = codPontoVenda;
		return this;
	}

	public GrupoLiquidTranscBuilder setNomePontoVenda(final String nomePontoVenda) {
		this.nomePontoVenda = nomePontoVenda;
		return this;
	}

	public GrupoLiquidTranscBuilder setTpPessoaPontoVenda(final String tpPessoaPontoVenda) {
		this.tpPessoaPontoVenda = tpPessoaPontoVenda;
		return this;
	}

	public GrupoLiquidTranscBuilder setCnpjCpfPontoVenda(final String cnpjCpfPontoVenda) {
		this.cnpjCpfPontoVenda = cnpjCpfPontoVenda;
		return this;
	}

	public GrupoLiquidTranscBuilder setCodInstitdrArrajPgto(final Integer codInstitdrArrajPgto) {
		this.codInstitdrArrajPgto = codInstitdrArrajPgto;
		return this;
	}

	public GrupoLiquidTranscBuilder setTpProdLiquid(final String tpProdLiquid) {
		this.tpProdLiquid = tpProdLiquid;
		return this;
	}

	public GrupoLiquidTranscBuilder setIndrFormaTransf(final String indrFormaTransf) {
		this.indrFormaTransf = indrFormaTransf;
		return this;
	}

	public GrupoLiquidTranscBuilder setCodMoeda(final String codMoeda) {
		this.codMoeda = codMoeda;
		return this;
	}

	public GrupoLiquidTranscBuilder setDtPgto(final Date dtPgto) {
		this.dtPgto = dtPgto;
		return this;
	}

	public GrupoLiquidTranscBuilder setVlrPgto(final BigDecimal vlrPgto) {
		this.vlrPgto = vlrPgto;
		return this;
	}

	public GrupoLiquidTransc build() {
		return new GrupoLiquidTransc(cnpjCpfPontoVenda,
				tipoArquivo,
				codCentrlz,
				tpCt,
				ctCentrlz,
				codMoeda,
				ispbIfDevdr,
				numCtrlCreddrCentrlz,
				numCtrlCreddrPontoVenda,
				tpProdLiquid,
				indrFormaTransf,
				tpPessoaCentrlz,
				codPontoVenda,
				agCentrlz,
				agCreddr,
				ispbIfCredr,
				ispbIfLiquidPontoVenda,
				dtPgto,
				codInstitdrArrajPgto,
				nomePontoVenda,
				tpPessoaPontoVenda,
				cnpjCpfCentrlz,
				ctCreddr,
				vlrPgto);
	}
}
