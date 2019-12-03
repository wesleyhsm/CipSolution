package br.com.fourward.cip.entity.converter;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import br.com.fourward.cip.canonical.ProductTypeCanonical;
import br.com.fourward.cip.entity.ProductTypeEntity;
import br.com.fourward.cip.entity.builder.ProductTypeBuilder;

@Component
public class ProductTypeEntityConverter {

	public ProductTypeEntity convert(final ProductTypeCanonical productTypeCanonical) {

		Assert.notNull(productTypeCanonical, "productTypeCanonical is null.");
		Assert.notNull(productTypeCanonical.getValue(), "productTypeCanonical.Value is null.");
		return ProductTypeBuilder 
				.create() 
				.setValue(productTypeCanonical.getValue()) 
				.build();
	}
}
