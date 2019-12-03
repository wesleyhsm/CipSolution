
package br.com.fourward.cip.xml.rtm.send.converter;

import org.springframework.stereotype.Component;

import br.com.fourward.cip.canonical.GeneratorFileNameRulesCanonical;
import br.com.fourward.cip.xml.rtm.send.TpProdLiquid;
import br.com.fourward.cip.xml.rtm.send.builder.TpProdLiquidBuilder;

@Component
public class TpProdLiquidConverter {

	public TpProdLiquid converter(final GeneratorFileNameRulesCanonical generatorFileNameRulesCanonical) {

		final String value = generatorFileNameRulesCanonical.getFileType();

		return TpProdLiquidBuilder.create().setValue(value).build();
	}
}
