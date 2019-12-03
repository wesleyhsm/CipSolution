
package br.com.fourward.cip.xml.rtm.back.errortm.builder;

import br.com.fourward.cip.xml.rtm.back.errortm.ErroRtm;

public class ErroRtmBuilder {

	public static ErroRtmBuilder create() {
		return new ErroRtmBuilder();
	}

	private ErroRtmBuilder() {

	}

	private String linha;
	private String coluna;
	private String arquivo;
	private String campo;
	private String descricao;
	private String bcArq;

	public ErroRtmBuilder setLinha(final String linha) {
		this.linha = linha;
		return this;
	}

	public ErroRtmBuilder setColuna(final String coluna) {
		this.coluna = coluna;
		return this;
	}

	public ErroRtmBuilder setArquivo(final String arquivo) {
		this.arquivo = arquivo;
		return this;
	}

	public ErroRtmBuilder setCampo(final String campo) {
		this.campo = campo;
		return this;
	}

	public ErroRtmBuilder setDescricao(final String descricao) {
		this.descricao = descricao;
		return this;
	}

	public ErroRtmBuilder setBcArq(final String bcArq) {
		this.bcArq = bcArq;
		return this;
	}

	public ErroRtm build() {
		return new ErroRtm(linha, coluna, arquivo, campo, descricao, bcArq);
	}
}
