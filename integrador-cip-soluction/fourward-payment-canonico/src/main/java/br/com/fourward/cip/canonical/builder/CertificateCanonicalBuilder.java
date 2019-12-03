package br.com.fourward.cip.canonical.builder;

import br.com.fourward.cip.canonical.CertificateCanonical;

public class CertificateCanonicalBuilder {

	private String localeCertificate;
	private String passwordCertificate;
	private String ispb;
	
	public static CertificateCanonicalBuilder create(){
		return new CertificateCanonicalBuilder();
	}

	private CertificateCanonicalBuilder(){

	}
		
	public CertificateCanonicalBuilder setLocaleCertificate(final String localeCertificate){
		this.localeCertificate = localeCertificate;
		return this;
	}

	public CertificateCanonicalBuilder setPasswordCertificate(final String passwordCertificate){
		this.passwordCertificate = passwordCertificate;
		return this;
	}

	public CertificateCanonicalBuilder setIspb(final String ispb){
		this.ispb = ispb;
		return this;
	}

	public CertificateCanonical build(){
		return new CertificateCanonical(localeCertificate, passwordCertificate, ispb);
	}
}