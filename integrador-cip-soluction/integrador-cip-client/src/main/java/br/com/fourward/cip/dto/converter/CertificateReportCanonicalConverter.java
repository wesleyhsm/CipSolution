package br.com.fourward.cip.dto.converter;

import org.springframework.stereotype.Component;

import br.com.fourward.cip.canonical.CertificateCanonical;
import br.com.fourward.cip.canonical.CertificateReportCanonical;
import br.com.fourward.cip.canonical.builder.CertificateCanonicalBuilder;
import br.com.fourward.cip.canonical.builder.CertificateReportCanonicalBuilder;
import br.com.fourward.cip.entity.DigitalCertificateEntity;

@Component
public class CertificateReportCanonicalConverter {

	public CertificateReportCanonical converterId(final Long id){
		
		return CertificateReportCanonicalBuilder
				.create()
				.setId(id)
				.build();
	}
		
	public CertificateReportCanonical converter(final DigitalCertificateEntity digitalCertificateEntity){
		
		final Long id = digitalCertificateEntity.getId();
		
		final CertificateCanonical certificateCanonical = CertificateCanonicalBuilder
				.create()
				.setIspb(digitalCertificateEntity.getIspb())
				.setLocaleCertificate(digitalCertificateEntity.getPath())
				.setPasswordCertificate(digitalCertificateEntity.getPassword())
				.build();
		
		return CertificateReportCanonicalBuilder
				.create()
				.setId(id)
				.setCertificateCanonical(certificateCanonical)
				.build();
	}
}
