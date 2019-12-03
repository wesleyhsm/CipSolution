package br.com.fourward.cip.canonical.builder;

import br.com.fourward.cip.canonical.BrandCanonical;

public class BrandCanonicalBuilder {

	private String value;
	
	public static BrandCanonicalBuilder create() {
		return new BrandCanonicalBuilder();
	}

	private BrandCanonicalBuilder() {

	}	

	public BrandCanonicalBuilder setValue(final String value) {
		this.value = value;
		return this;
	}

	public BrandCanonical build() {
		return BrandCanonical.create(value);
	}
}