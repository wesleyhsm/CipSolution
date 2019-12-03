
package br.com.fourward.cip.xml.rtm.back.ret.converter;

import org.springframework.stereotype.Component;

import br.com.fourward.cip.xml.rtm.back.ret.ErroRet;
import br.com.fourward.cip.xml.rtm.back.ret.builder.ErroRetBuilder;

@Component
public class ErroRetConverter {

	public ErroRet converter() {

		final String Campo = null;
		final String CodErro = null;

		return ErroRetBuilder.create().setCampo(Campo).setCodErro(CodErro).build();
	}
}
