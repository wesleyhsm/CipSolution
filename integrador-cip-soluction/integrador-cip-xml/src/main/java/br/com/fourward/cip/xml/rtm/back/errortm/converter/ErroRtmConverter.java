
package br.com.fourward.cip.xml.rtm.back.errortm.converter;

import org.springframework.stereotype.Component;

import br.com.fourward.cip.xml.rtm.back.errortm.ErroRtm;
import br.com.fourward.cip.xml.rtm.back.errortm.builder.ErroRtmBuilder;

@Component
public class ErroRtmConverter {

	public ErroRtm createErroRtm() {

		final String linha = null;
		final String coluna = null;
		final String arquivo = null;
		final String campo = null;
		final String descricao = null;
		final String bcArq = null;

		return ErroRtmBuilder.create()
				.setLinha(linha)
				.setColuna(coluna)
				.setArquivo(arquivo)
				.setCampo(campo)
				.setDescricao(descricao)
				.setBcArq(bcArq)
				.build();
	}
}
