package br.com.fourward.cip.canonical.builder;

import br.com.fourward.cip.canonical.StatusTypeCanonical;

public class StatusTypeCanonicalBuilder {

	private String value;
	
	public static StatusTypeCanonicalBuilder create() {
		return new StatusTypeCanonicalBuilder();
	}
	
	private StatusTypeCanonicalBuilder(){
		
	}
		
	public StatusTypeCanonicalBuilder setValue(final String value) {
		this.value = value;
		return this;
	}

	public StatusTypeCanonical build() {
		return StatusTypeCanonical.create(value);
	}
}
