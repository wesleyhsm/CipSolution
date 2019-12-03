
package br.com.fourward.cip.xml.rtm.send.converter;

import org.springframework.stereotype.Component;

import br.com.fourward.cip.xml.rtm.send.TipoArquivo;
import br.com.fourward.cip.xml.rtm.send.builder.TipoArquivoBuilder;

@Component
public class TipoArquivoConverter {

	public TipoArquivo converter() {

		final String value = null;

		return TipoArquivoBuilder.create().setValue(value).build();
	}
}
