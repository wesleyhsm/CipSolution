
package br.com.fourward.cip.xml.rtm.send.converter;

import org.springframework.stereotype.Component;

import br.com.fourward.cip.xml.rtm.send.CodMoeda;
import br.com.fourward.cip.xml.rtm.send.builder.CodMoedaBuilder;

@Component
public class CodMoedaConverter {

	public CodMoeda converter() {

		final String value = CodMoeda.Real.getValue();

		return CodMoedaBuilder.create().setValue(value).build();
	}
}
