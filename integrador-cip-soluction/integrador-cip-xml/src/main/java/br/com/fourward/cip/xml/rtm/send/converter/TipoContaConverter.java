
package br.com.fourward.cip.xml.rtm.send.converter;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import br.com.fourward.cip.canonical.BankAccountCanonical;
import br.com.fourward.cip.xml.rtm.send.TipoConta;
import br.com.fourward.cip.xml.rtm.send.builder.TipoContaBuilder;

@Component
public class TipoContaConverter {

	private final Map<String, String> tpConta = new HashMap<>();

	public TipoContaConverter() {
		tpConta.put("Checking Account", "CC");
		tpConta.put("Savings Account", "PP");
	}

	public TipoConta converter(final BankAccountCanonical bankAccountCanonical) {

		final String value = tpConta.get(bankAccountCanonical.getAccountTypeCanonical().getValue());

		return TipoContaBuilder.create().setValue(value).build();
	}
}
