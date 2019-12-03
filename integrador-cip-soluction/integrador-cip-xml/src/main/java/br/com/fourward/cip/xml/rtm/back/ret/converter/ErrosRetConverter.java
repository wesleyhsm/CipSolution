
package br.com.fourward.cip.xml.rtm.back.ret.converter;

import java.util.List;

import org.springframework.stereotype.Component;

import br.com.fourward.cip.xml.rtm.back.ret.ErroRet;
import br.com.fourward.cip.xml.rtm.back.ret.ErrosRet;
import br.com.fourward.cip.xml.rtm.back.ret.builder.ErrosRetBuilder;

@Component
public class ErrosRetConverter {

	public ErrosRet converter() {

		final List<ErroRet> erros = null;

		return ErrosRetBuilder.create().setErro(erros).build();
	}
}
