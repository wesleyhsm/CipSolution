
package br.com.fourward.cip.xml.rtm.send.converter;

import org.springframework.stereotype.Component;

import br.com.fourward.cip.xml.rtm.send.IndrFormaTransf;
import br.com.fourward.cip.xml.rtm.send.builder.IndrFormaTransfBuilder;

@Component
public class IndrFormaTransfConverter {

	public IndrFormaTransf converter() {

		final String value = IndrFormaTransf.Siloc.getValue();

		return IndrFormaTransfBuilder.create().setValue(value).build();
	}
}
