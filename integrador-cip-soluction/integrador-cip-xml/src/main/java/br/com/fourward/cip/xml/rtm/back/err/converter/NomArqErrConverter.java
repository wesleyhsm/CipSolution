
package br.com.fourward.cip.xml.rtm.back.err.converter;

import org.springframework.stereotype.Component;

import br.com.fourward.cip.xml.rtm.back.err.NomArqErr;
import br.com.fourward.cip.xml.rtm.back.err.builder.NomArqErrBuilder;

@Component
public class NomArqErrConverter {

	public NomArqErr converter() {

		final String content = null;
		final String codErro = null;

		return NomArqErrBuilder.create().setContent(content).setCodErro(codErro).build();
	}

}
