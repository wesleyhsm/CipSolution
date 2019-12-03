package br.com.fourward.cip.entity.converter;

import org.springframework.stereotype.Component;

import br.com.fourward.cip.canonical.PaymentSummaryCanonical;
import br.com.fourward.cip.canonical.StatusCanonical;
import br.com.fourward.cip.entity.StatusTypeEntity;
import br.com.fourward.cip.entity.builder.StatusTypeBuilder;

@Component
public class StatusTypeEntityConverter {
	
	public StatusTypeEntity convert(final PaymentSummaryCanonical paymentSummaryCanonical) {

		final StatusCanonical statusCanonical = paymentSummaryCanonical.getStatusCanonical();
		
		return StatusTypeBuilder 
				.create() 
				.setValue(statusCanonical.getStatusTypeCanonical().getValue()) 
				.build();
	}
	
	public StatusTypeEntity statusConvert(final String statusType) {
				
		return StatusTypeBuilder 
				.create() 
				.setValue(statusType) 
				.build();
	}
}
