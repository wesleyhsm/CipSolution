package br.com.fourward.cip.canonical.builder;

import java.util.Date;

import br.com.fourward.cip.canonical.ValidateDateCertificateCanonical;

public class ValidateDateCertificateCanonicalBuilder {
	
	private Date activation;
	private Date expiration;
	
	public static ValidateDateCertificateCanonicalBuilder create() {
		return new ValidateDateCertificateCanonicalBuilder();
	}

	private ValidateDateCertificateCanonicalBuilder() {

	}	
		
	public ValidateDateCertificateCanonicalBuilder setActivation(final Date activation) {
		this.activation = activation;
		return this;
	}
	
	public ValidateDateCertificateCanonicalBuilder setExpiration(final Date expiration) {
		this.expiration = expiration;
		return this;
	}

	public ValidateDateCertificateCanonical build() {
		return new ValidateDateCertificateCanonical(activation, expiration);
	}
}
