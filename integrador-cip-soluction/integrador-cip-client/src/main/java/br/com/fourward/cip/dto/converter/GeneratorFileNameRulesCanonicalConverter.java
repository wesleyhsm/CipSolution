
package br.com.fourward.cip.dto.converter;

import org.springframework.stereotype.Component;

import br.com.fourward.cip.canonical.GeneratorFileNameRulesCanonical;
import br.com.fourward.cip.canonical.builder.GeneratorFileNameRulesCanonicalBuilder;
import br.com.fourward.cip.rules.GeneratorFileNameRules;

@Component
public class GeneratorFileNameRulesCanonicalConverter {

	public GeneratorFileNameRulesCanonical converter(final GeneratorFileNameRules generatorFileNameRules) {

		final String systemDate = generatorFileNameRules.getSystemDate();
		final String fileType = generatorFileNameRules.getFileType();
		final String sequenceNumber = generatorFileNameRules.getSequenceNumber();

		return GeneratorFileNameRulesCanonicalBuilder.create()
				.setSystemDate(systemDate)
				.setFileType(fileType)
				.setSequenceNumber(sequenceNumber)
				.build();
	}
}
