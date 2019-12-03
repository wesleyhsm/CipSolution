package br.com.fourward.cip.entity.converter;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import br.com.fourward.cip.canonical.OperationTypeCanonical;
import br.com.fourward.cip.entity.OperationTypeEntity;
import br.com.fourward.cip.entity.builder.OperationTypeBuilder;

@Component
public class OperationTypeEntityConverter {

	public OperationTypeEntity convert(final OperationTypeCanonical operationTypeCanonical) {

		Assert.notNull(operationTypeCanonical, "operationTypeCanonical is null.");
		Assert.notNull(operationTypeCanonical.getValue(), "operationTypeCanonical.Value is null.");
		return OperationTypeBuilder 
				.create() 
				.setValue(operationTypeCanonical.getValue()) 
				.build();
	}
}
