
package br.com.fourward.cip.dto.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.fourward.cip.canonical.BankIspbTranslateCanonical;
import br.com.fourward.cip.canonical.PaymentFileCanonical;
import br.com.fourward.cip.canonical.PaymentGeneratorCanonical;
import br.com.fourward.cip.canonical.builder.PaymentGeneratorCanonicalBuilder;
import br.com.fourward.cip.entity.PaymentEntity;

@Component
public class PaymentGeneratorCanonicalConverter {

	@Autowired
	private PaymentFileCanonicalConverter paymentFileCanonicalConverter;

	@Autowired
	private IspbConverter ispbConverter;

	public List<PaymentGeneratorCanonical> converter(final List<PaymentEntity> paymentEntitys) {

		final List<PaymentGeneratorCanonical> paymentGeneratorCanonicals = new ArrayList<>();

		paymentEntitys.forEach(paymentEntity -> {
			final PaymentFileCanonical paymentFileCanonical = paymentFileCanonicalConverter.convert(paymentEntity);
			final String bankCodeSubAcquirer = paymentFileCanonical.getSubacquirer().getBankAccount().getBankCode();
			final String bankCodePontoVenda = paymentFileCanonical.getPointOfSale().getBankAccount().getBankCode();

			final BankIspbTranslateCanonical bankIspbTranslateCanonicalSubAcquirer =
					ispbConverter.converterBankCode(bankCodeSubAcquirer);
			final BankIspbTranslateCanonical bankIspbTranslateCanonicalPontoVenda =
					ispbConverter.converterBankCode(bankCodePontoVenda);

			final PaymentGeneratorCanonical paymentGeneratorCanonical = PaymentGeneratorCanonicalBuilder.create()
					.setPaymentFileCanonical(paymentFileCanonical)
					.setBankIspbTranslateCanonicalSubAcquirer(bankIspbTranslateCanonicalSubAcquirer)
					.setBankIspbTranslateCanonicalPontoVenda(bankIspbTranslateCanonicalPontoVenda)
					.build();

			paymentGeneratorCanonicals.add(paymentGeneratorCanonical);
		});

		return paymentGeneratorCanonicals;
	}
}
