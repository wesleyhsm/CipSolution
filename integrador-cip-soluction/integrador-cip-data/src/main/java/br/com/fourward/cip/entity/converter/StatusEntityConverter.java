
package br.com.fourward.cip.entity.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.fourward.cip.canonical.PaymentSummaryCanonical;
import br.com.fourward.cip.canonical.StatusCanonical;
import br.com.fourward.cip.entity.StatusEntity;
import br.com.fourward.cip.entity.StatusTypeEntity;
import br.com.fourward.cip.entity.builder.StatusBuilder;

@Component
public class StatusEntityConverter {

	@Autowired
	private StatusTypeEntityConverter statusTypeEntityConverter;

	public StatusEntity convert(final PaymentSummaryCanonical paymentSummaryCanonical) {

		final StatusCanonical statusCanonical = paymentSummaryCanonical.getStatusCanonical();

		final StatusTypeEntity statusTypeEntity = statusTypeEntityConverter.convert(paymentSummaryCanonical);

		return StatusBuilder.create().setDate(statusCanonical.getDate()).setStatusType(statusTypeEntity).build();
	}
}
