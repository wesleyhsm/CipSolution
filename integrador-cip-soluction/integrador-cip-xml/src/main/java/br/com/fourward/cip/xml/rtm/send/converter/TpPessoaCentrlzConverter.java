
package br.com.fourward.cip.xml.rtm.send.converter;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import br.com.fourward.cip.canonical.DocumentCanonical;
import br.com.fourward.cip.xml.rtm.send.TpPessoaCentrlz;
import br.com.fourward.cip.xml.rtm.send.builder.TpPessoaCentrlzBuilder;

@Component
public class TpPessoaCentrlzConverter {

	private final Map<String, String> tpPessoa = new HashMap<>();

	public TpPessoaCentrlzConverter() {
		tpPessoa.put("CPF", "F");
		tpPessoa.put("CNPJ", "J");
	}

	public TpPessoaCentrlz converter(final DocumentCanonical documentCanonical) {

		final String value = tpPessoa.get(documentCanonical.getType().getValue());

		return TpPessoaCentrlzBuilder.create().setValue(value).build();
	}
}
