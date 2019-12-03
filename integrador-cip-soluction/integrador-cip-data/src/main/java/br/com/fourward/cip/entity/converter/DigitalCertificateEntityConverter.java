package br.com.fourward.cip.entity.converter;

import java.util.Date;

import org.springframework.stereotype.Component;

import br.com.fourward.cip.canonical.CertificateCanonical;
import br.com.fourward.cip.canonical.DigitalCertificateCanonical;
import br.com.fourward.cip.canonical.ValidateDateCertificateCanonical;
import br.com.fourward.cip.entity.DigitalCertificateEntity;
import br.com.fourward.cip.entity.builder.DigitalCertificateBuilder;

@Component
public class DigitalCertificateEntityConverter {
	
	public DigitalCertificateEntity converter(final DigitalCertificateCanonical digitalCertificateCanonical){
		
		final CertificateCanonical certificateCanonical = digitalCertificateCanonical.getCertificateCanonical(); 
		
		final ValidateDateCertificateCanonical validateDateCertificateCanonical = digitalCertificateCanonical.getValidateDateCertificateCanonical();
		
		final Boolean active = true;
		
		final Date activationDate = validateDateCertificateCanonical.getActivation();

		final Date expirationDate = validateDateCertificateCanonical.getExpiration();
		
		final String path = certificateCanonical.getLocaleCertificate();
		
		final String password = certificateCanonical.getPasswordCertificate();
		
		final String ispb = certificateCanonical.getIspb();
		
		final Long id = digitalCertificateCanonical.getId();
		
		return DigitalCertificateBuilder
					.create()
					.setId(id)
					.setActive(active)
					.setActivationDate(activationDate)
					.setExpirationDate(expirationDate)
					.setPath(path)
					.setPassword(password)
					.setIspb(ispb)
					.build();
	}
}
