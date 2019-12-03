package br.com.fourward.cip.canonical.builder;

import br.com.fourward.cip.canonical.AcquirerCanonical;

public class AcquirerCanonicalBuilder {

	private String value;
	
	public static AcquirerCanonicalBuilder create() {
		return new AcquirerCanonicalBuilder();
	}

	private AcquirerCanonicalBuilder() {

	}
	
	public AcquirerCanonicalBuilder setValue(final String value) {
		this.value = value;
		return this;
	}

	public AcquirerCanonical build() {
		return AcquirerCanonical.create(value);
	}
}