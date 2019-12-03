package br.com.fourward.cip.canonical.builder;

import br.com.fourward.cip.canonical.CertificateCanonical;
import br.com.fourward.cip.canonical.DigitalCertificateCanonical;
import br.com.fourward.cip.canonical.ValidateDateCertificateCanonical;

public class DigitalCertificateCanonicalBuilder {

	private Long id;
	private CertificateCanonical certificateCanonical;
	private ValidateDateCertificateCanonical validateDateCertificateCanonical;
		
	public static DigitalCertificateCanonicalBuilder create(){
		return new DigitalCertificateCanonicalBuilder();
	}

	private DigitalCertificateCanonicalBuilder(){

	}
	
	public DigitalCertificateCanonicalBuilder setId(final Long id){
		this.id = id;
		return this;
	}
	
	public DigitalCertificateCanonicalBuilder setCertificateCanonical(final CertificateCanonical certificateCanonical){
		this.certificateCanonical = certificateCanonical;
		return this;
	}

	public DigitalCertificateCanonicalBuilder setValidateDateCertificateCanonical(final ValidateDateCertificateCanonical validateDateCertificateCanonical){
		this.validateDateCertificateCanonical = validateDateCertificateCanonical;
		return this;
	}

	public DigitalCertificateCanonical build(){
		return new DigitalCertificateCanonical(certificateCanonical, validateDateCertificateCanonical, id);
	}
}