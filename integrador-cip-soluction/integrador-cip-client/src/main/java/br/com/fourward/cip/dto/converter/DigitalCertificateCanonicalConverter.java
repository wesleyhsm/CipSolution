package br.com.fourward.cip.dto.converter;

import org.springframework.stereotype.Component;

import br.com.fourward.cip.canonical.CertificateCanonical;
import br.com.fourward.cip.canonical.DigitalCertificateCanonical;
import br.com.fourward.cip.canonical.ValidateDateCertificateCanonical;
import br.com.fourward.cip.canonical.builder.CertificateCanonicalBuilder;
import br.com.fourward.cip.canonical.builder.DigitalCertificateCanonicalBuilder;
import br.com.fourward.cip.canonical.builder.ValidateDateCertificateCanonicalBuilder;
import br.com.fourward.cip.entity.DigitalCertificateEntity;

@Component
public class DigitalCertificateCanonicalConverter {

	public DigitalCertificateCanonical converter(final DigitalCertificateEntity digitalCertificateEntity) {
		
		final CertificateCanonical certificateCanonical = CertificateCanonicalBuilder
				.create()
				.setIspb(digitalCertificateEntity.getIspb())
				.setLocaleCertificate(digitalCertificateEntity.getPath())
				.setPasswordCertificate(digitalCertificateEntity.getPassword())
				.build();
		
		final ValidateDateCertificateCanonical validateDateCertificateCanonical = ValidateDateCertificateCanonicalBuilder
				.create()
				.setActivation(digitalCertificateEntity.getActivationDate())
				.setExpiration(digitalCertificateEntity.getExpirationDate())
				.build();
		
		return DigitalCertificateCanonicalBuilder
				.create()
				.setCertificateCanonical(certificateCanonical)
				.setValidateDateCertificateCanonical(validateDateCertificateCanonical)
				.build();
	}
}
