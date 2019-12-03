package br.com.fourward.cip.canonical.builder;

import br.com.fourward.cip.canonical.ProductTypeCanonical;

public class ProductTypeCanonicalBuilder {

	private String value;
	
	public static ProductTypeCanonicalBuilder create() {
		return new ProductTypeCanonicalBuilder();
	}

	private ProductTypeCanonicalBuilder() {

	}
	
	public ProductTypeCanonicalBuilder setValue(final String value) {
		this.value = value;
		return this;
	}

	public ProductTypeCanonical build() {
		return ProductTypeCanonical.create(value);
	}
}
