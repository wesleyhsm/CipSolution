package br.com.fourward.cip.business;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.fourward.cip.canonical.CertificateCanonical;
import br.com.fourward.cip.canonical.CertificateReportCanonical;
import br.com.fourward.cip.canonical.DigitalCertificateCanonical;
import br.com.fourward.cip.canonical.ValidateDateCertificateCanonical;
import br.com.fourward.cip.canonical.builder.DigitalCertificateCanonicalBuilder;
import br.com.fourward.cip.certificate.ValidateCertificateModelA1;
import br.com.fourward.cip.certificate.ValidateDateCertificate;
import br.com.fourward.cip.dto.converter.CertificateReportCanonicalConverter;
import br.com.fourward.cip.dto.converter.ValidateDateCertificateCanonicalConverter;
import br.com.fourward.cip.entity.DigitalCertificateEntity;
import br.com.fourward.cip.entity.converter.DigitalCertificateEntityConverter;
import br.com.fourward.cip.repository.DigitalCertificateRepository;
import br.com.fourward.ispbtranslate.exception.DataNotFoundException;

@Service
public class DigitalCertificateBusiness {
	
	@Autowired
	private DigitalCertificateRepository digitalCertificateRepository;
		
	@Autowired
	private ValidateCertificateModelA1 validateCertificateModelA1;
	
	@Autowired
	private DigitalCertificateEntityConverter digitalCertificateEntityConverter;
	
	@Autowired
	private CertificateReportCanonicalConverter certificateReportCanonicalConverter;
	
	@Autowired
	private ValidateDateCertificateCanonicalConverter validateDateCertificateCanonicalConverter;
	
	@Transactional
	public Long saveCerticate(final CertificateCanonical certificateCanonical) throws KeyStoreException, NoSuchAlgorithmException, CertificateException, FileNotFoundException, IOException {
					
		final ValidateDateCertificate validateDateCertificate = readCertificate(certificateCanonical);
			
		final ValidateDateCertificateCanonical validateDateCertificateCanonical = validateDateCertificateCanonicalConverter.converter(validateDateCertificate);
		
		final DigitalCertificateCanonical digitalCertificateCanonical = DigitalCertificateCanonicalBuilder
				.create()
				.setCertificateCanonical(certificateCanonical)
				.setValidateDateCertificateCanonical(validateDateCertificateCanonical)
				.build();
		
		final DigitalCertificateEntity digitalCertificateEntity = digitalCertificateEntityConverter.converter(digitalCertificateCanonical);
		
		digitalCertificateRepository.save(digitalCertificateEntity);
		
		return digitalCertificateEntity.getId();
	}

	private ValidateDateCertificate readCertificate(final CertificateCanonical certificateCanonical) throws KeyStoreException, NoSuchAlgorithmException, CertificateException, FileNotFoundException, IOException {
		
		final String localeCertificateFile = certificateCanonical.getLocaleCertificate();		
		final String passwordCertificate = certificateCanonical.getPasswordCertificate();		
		final ValidateDateCertificate validateDateCertificate = validateCertificateModelA1.validateCertificate(localeCertificateFile, passwordCertificate);	
		
		return validateDateCertificate;
	}

	public CertificateReportCanonical seachCertificate(final CertificateReportCanonical certificateReportCanonical) {
				
		final DigitalCertificateEntity digitalCertificateEntity = certificateSeachId(certificateReportCanonical.getId());		
		final CertificateReportCanonical certificateReportCanonicalResult = certificateReportCanonicalConverter.converter(digitalCertificateEntity);
		
		return certificateReportCanonicalResult;
	}
	
	private DigitalCertificateEntity certificateSeachId(final Long id){
		final DigitalCertificateEntity digitalCertificateEntity = digitalCertificateRepository.findOne(id);
		Optional.ofNullable(digitalCertificateEntity).orElseThrow(()->new DataNotFoundException("id=" + id + " Not Found!"));
		return digitalCertificateEntity;
	}

	@Transactional
	public void updateCertificate(final CertificateReportCanonical certificateReportCanonical) throws KeyStoreException, NoSuchAlgorithmException, CertificateException, FileNotFoundException, IOException {
		
		final Long id = certificateReportCanonical.getId();
		
		final CertificateCanonical certificateCanonical = certificateReportCanonical.getCertificateCanonical();
		
		final ValidateDateCertificate validateDateCertificate = readCertificate(certificateCanonical);
		
		final ValidateDateCertificateCanonical validateDateCertificateCanonical = validateDateCertificateCanonicalConverter.converter(validateDateCertificate);
				
		final DigitalCertificateCanonical digitalCertificateCanonical = DigitalCertificateCanonicalBuilder
				.create()
				.setId(id)
				.setCertificateCanonical(certificateCanonical)
				.setValidateDateCertificateCanonical(validateDateCertificateCanonical)
				.build();
		
		final DigitalCertificateEntity digitalCertificateEntity = digitalCertificateEntityConverter.converter(digitalCertificateCanonical);
				
		digitalCertificateRepository.save(digitalCertificateEntity);
	}
	
	public void updatePersistCertificate(final DigitalCertificateEntity digitalCertificateEntity){
		digitalCertificateRepository.save(digitalCertificateEntity);
	}

	public void deleteCertificate(final CertificateReportCanonical certificateReportCanonical) {
		
		final Long id = certificateReportCanonical.getId();		
		certificateDelete(id);
	}
	
	private void certificateDelete(final Long id){
		digitalCertificateRepository.delete(id);		
	}
}