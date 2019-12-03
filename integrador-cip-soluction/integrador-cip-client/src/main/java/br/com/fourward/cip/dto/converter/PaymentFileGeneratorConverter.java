
package br.com.fourward.cip.dto.converter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.fourward.cip.canonical.GeneratorFileNameRulesCanonical;
import br.com.fourward.cip.canonical.PaymentFileGeneratorCanonical;
import br.com.fourward.cip.canonical.PaymentGeneratorCanonical;
import br.com.fourward.cip.canonical.builder.PaymentFileGeneratorCanonicalBuilder;
import br.com.fourward.cip.entity.PaymentEntity;
import br.com.fourward.cip.rules.GeneratorFileNameRules;

@Component
public class PaymentFileGeneratorConverter {

	@Autowired
	private GeneratorFileNameRulesCanonicalConverter generatorFileNameRulesCanonicalConverter;

	@Autowired
	private PaymentGeneratorCanonicalConverter paymentGeneratorCanonicalConverter;

	public PaymentFileGeneratorCanonical converter(final List<PaymentEntity> paymentEntitys,
			final GeneratorFileNameRules generatorFileNameRules) {

		final GeneratorFileNameRulesCanonical generatorFileNameRulesCanonical =
				generatorFileNameRulesCanonicalConverter.converter(generatorFileNameRules);

		final List<PaymentGeneratorCanonical> paymentGeneratorCanonicals =
				paymentGeneratorCanonicalConverter.converter(paymentEntitys);

		return PaymentFileGeneratorCanonicalBuilder.create()
				.setGeneratorFileNameRulesCanonical(generatorFileNameRulesCanonical)
				.setPaymentGeneratorCanonical(paymentGeneratorCanonicals)
				.build();
	}

}
