
package br.com.fourward.cip.xml.rtm.back.errortm;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "ErroReg")
@JsonPropertyOrder({ "Linha", "Coluna", "Arquivo", "Campo", "Descricao", "BcArq" })
public class ErroRtm {

	private String linha;
	private String coluna;
	private String arquivo;
	private String campo;
	private String descricao;
	private String bcArq;

	public ErroRtm() {

	}

	public ErroRtm(final String linha,
			final String coluna,
			final String arquivo,
			final String campo,
			final String descricao,
			final String bcArq) {
		super();
		this.linha = linha;
		this.coluna = coluna;
		this.arquivo = arquivo;
		this.campo = campo;
		this.descricao = descricao;
		this.bcArq = bcArq;
	}

	@JacksonXmlProperty(localName = "Linha")
	public String getLinha() {
		return linha;
	}

	public void setLinha(final String linha) {
		this.linha = linha;
	}

	@JacksonXmlProperty(localName = "Coluna")
	public String getColuna() {
		return coluna;
	}

	public void setColuna(final String coluna) {
		this.coluna = coluna;
	}

	@JacksonXmlProperty(localName = "Arquivo")
	public String getArquivo() {
		return arquivo;
	}

	public void setArquivo(final String arquivo) {
		this.arquivo = arquivo;
	}

	@JacksonXmlProperty(localName = "Campo")
	public String getCampo() {
		return campo;
	}

	public void setCampo(final String campo) {
		this.campo = campo;
	}

	@JacksonXmlProperty(localName = "Descricao")
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(final String descricao) {
		this.descricao = descricao;
	}

	@JacksonXmlProperty(localName = "BcArq")
	public String getBcArq() {
		return bcArq;
	}

	public void setBcArq(final String bcArq) {
		this.bcArq = bcArq;
	}

	@Override
	public String toString() {
		return "ErroReg [linha="
				+ linha
				+ ", coluna="
				+ coluna
				+ ", arquivo="
				+ arquivo
				+ ", campo="
				+ campo
				+ ", descricao="
				+ descricao
				+ ", bcArq="
				+ bcArq
				+ "]";
	}
}
