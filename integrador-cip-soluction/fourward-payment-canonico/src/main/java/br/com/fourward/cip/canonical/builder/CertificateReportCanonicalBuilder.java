package br.com.fourward.cip.canonical.builder;

import br.com.fourward.cip.canonical.CertificateReportCanonical;
import br.com.fourward.cip.canonical.CertificateCanonical;

public class CertificateReportCanonicalBuilder {

	private Long id;
	private CertificateCanonical certificateCanonical;
	
	public static CertificateReportCanonicalBuilder create(){
		return new CertificateReportCanonicalBuilder();
	}

	private CertificateReportCanonicalBuilder(){

	}

	public CertificateReportCanonicalBuilder setId(final Long id){
		this.id = id;
		return this;
	}

	public CertificateReportCanonicalBuilder setCertificateCanonical(final CertificateCanonical certificateCanonical){
		this.certificateCanonical = certificateCanonical;
		return this;
	}

	public CertificateReportCanonical build(){
		return new CertificateReportCanonical(id, certificateCanonical);
	}
}