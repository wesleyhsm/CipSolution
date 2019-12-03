package br.com.fourward.cip.entity.converter;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import br.com.fourward.cip.canonical.AcquirerCanonical;
import br.com.fourward.cip.entity.AcquirerEntity;
import br.com.fourward.cip.entity.builder.AcquirerBuilder;

@Component
public class AcquirerEntityConverter {

	public AcquirerEntity convert(final AcquirerCanonical acquirerCanonical) {
		
		Assert.notNull(acquirerCanonical, "acquirerCanonical is null.");
		Assert.notNull(acquirerCanonical.getValue(), "acquirerCanonical.Value is null");
		return AcquirerBuilder 
				.create() 
				.setValue(acquirerCanonical.getValue()) 
				.build();
	}
}
