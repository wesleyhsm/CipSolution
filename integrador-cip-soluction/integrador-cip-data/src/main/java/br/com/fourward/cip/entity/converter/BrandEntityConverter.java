package br.com.fourward.cip.entity.converter;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import br.com.fourward.cip.canonical.BrandCanonical;
import br.com.fourward.cip.entity.BrandEntity;
import br.com.fourward.cip.entity.builder.BrandBuilder;

@Component
public class BrandEntityConverter {

	public BrandEntity convert(final BrandCanonical brandCanonical) {
		
		Assert.notNull(brandCanonical, "brandCanonical is null.");
		Assert.notNull(brandCanonical.getValue(), "brandCanonical.Value is null.");
		return BrandBuilder 
				.create() 
				.setValue(brandCanonical.getValue()) 
				.build();

	}
}
