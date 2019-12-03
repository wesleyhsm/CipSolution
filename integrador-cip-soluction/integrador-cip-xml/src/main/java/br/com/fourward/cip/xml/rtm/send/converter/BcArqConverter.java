
package br.com.fourward.cip.xml.rtm.send.converter;

import org.springframework.stereotype.Component;

import br.com.fourward.cip.canonical.GeneratorFileNameRulesCanonical;
import br.com.fourward.cip.canonical.PaymentFileGeneratorCanonical;
import br.com.fourward.cip.xml.rtm.send.BcArq;
import br.com.fourward.cip.xml.rtm.send.builder.BcArqBuilder;

@Component
public class BcArqConverter {

	public BcArq converter(final PaymentFileGeneratorCanonical paymentFileGeneratorCanonical) {

		final GeneratorFileNameRulesCanonical generatorFileNameRulesCanonical =
				paymentFileGeneratorCanonical.getGeneratorFileNameRulesCanonical();

		final String numCtrlEmis = generatorFileNameRulesCanonical.getSequenceNumber();

		return BcArqBuilder.create().setNumCtrlEmis(numCtrlEmis).build();
	}
}
