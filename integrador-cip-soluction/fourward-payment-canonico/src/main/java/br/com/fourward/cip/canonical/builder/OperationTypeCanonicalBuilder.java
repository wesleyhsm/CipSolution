package br.com.fourward.cip.canonical.builder;

import br.com.fourward.cip.canonical.OperationTypeCanonical;

public class OperationTypeCanonicalBuilder {

	private String value;
	
	public static OperationTypeCanonicalBuilder create() {
		return new OperationTypeCanonicalBuilder();
	}

	private OperationTypeCanonicalBuilder() {

	}

	public OperationTypeCanonicalBuilder setValue(final String value) {
		this.value = value;
		return this;
	}

	public OperationTypeCanonical build() {
		return OperationTypeCanonical.create(value);
	}
}