
package br.com.fourward.cip.xml.rtm.send.converter;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import br.com.fourward.cip.canonical.DocumentCanonical;
import br.com.fourward.cip.xml.rtm.send.TpPessoaPontoVenda;
import br.com.fourward.cip.xml.rtm.send.builder.TpPessoaPontoVendaBuilder;

@Component
public class TpPessoaPontoVendaConverter {

	private final Map<String, String> tpPessoa = new HashMap<>();

	public TpPessoaPontoVendaConverter() {
		tpPessoa.put("CPF", "F");
		tpPessoa.put("CNPJ", "J");
	}

	public TpPessoaPontoVenda converter(final DocumentCanonical documentCanonical) {

		final String value = tpPessoa.get(documentCanonical.getType().getValue());

		return TpPessoaPontoVendaBuilder.create().setValue(value).build();
	}
}
