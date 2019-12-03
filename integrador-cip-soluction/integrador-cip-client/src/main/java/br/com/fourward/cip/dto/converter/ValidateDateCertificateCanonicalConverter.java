package br.com.fourward.cip.dto.converter;

import org.springframework.stereotype.Component;

import br.com.fourward.cip.canonical.ValidateDateCertificateCanonical;
import br.com.fourward.cip.canonical.builder.ValidateDateCertificateCanonicalBuilder;
import br.com.fourward.cip.certificate.ValidateDateCertificate;

@Component
public class ValidateDateCertificateCanonicalConverter {

	public ValidateDateCertificateCanonical converter(final ValidateDateCertificate validateDateCertificate){
		
		return ValidateDateCertificateCanonicalBuilder
				.create()
				.setActivation(validateDateCertificate.getActivation())
				.setExpiration(validateDateCertificate.getExpiration())
				.build();
	}
}
