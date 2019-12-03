package br.com.fourward.cip.dto.converter;

import org.springframework.stereotype.Component;

import br.com.fourward.cip.canonical.CertificateCanonical;
import br.com.fourward.cip.canonical.builder.CertificateCanonicalBuilder;
import br.com.fourward.cip.dto.CertificateRequestDto;

@Component
public class CertificateCanonicalConverter {

	public CertificateCanonical converter(final CertificateRequestDto certificateRequestDto){
		
		return CertificateCanonicalBuilder
				.create()
				.setIspb(certificateRequestDto.getIspb())
				.setLocaleCertificate(certificateRequestDto.getLocaleCertificate())
				.setPasswordCertificate(certificateRequestDto.getPasswordCertificate())
				.build();
	}
}
