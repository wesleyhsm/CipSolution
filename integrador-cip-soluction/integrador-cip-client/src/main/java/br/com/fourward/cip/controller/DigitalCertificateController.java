package br.com.fourward.cip.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.fourward.cip.business.DigitalCertificateBusiness;
import br.com.fourward.cip.canonical.CertificateCanonical;
import br.com.fourward.cip.canonical.CertificateReportCanonical;
import br.com.fourward.cip.canonical.builder.CertificateReportCanonicalBuilder;
import br.com.fourward.cip.dto.CertificateRequestDto;
import br.com.fourward.cip.dto.CertificateResponseDto;
import br.com.fourward.cip.dto.converter.CertificateCanonicalConverter;
import br.com.fourward.cip.dto.converter.CertificateReportCanonicalConverter;
import br.com.fourward.logger.Logger;

@RestController
@RequestMapping("/certificate")
@Logger
public class DigitalCertificateController {

	@Autowired
	private DigitalCertificateBusiness digitalCertificateBusiness;
				
	@Autowired
	private CertificateCanonicalConverter certificateCanonicalConverter;

	@Autowired
	private CertificateReportCanonicalConverter certificateReportCanonicalConverter;
	
	@CrossOrigin
	@RequestMapping(method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_VALUE }, consumes = {
			MediaType.APPLICATION_JSON_VALUE })
	public @ResponseBody CertificateResponseDto save(@Valid @RequestBody final CertificateRequestDto certificateRequestDto) throws KeyStoreException, NoSuchAlgorithmException, CertificateException, FileNotFoundException, IOException{
				
		final CertificateCanonical certificateCanonical = certificateCanonicalConverter.converter(certificateRequestDto);				
		final Long id = digitalCertificateBusiness.saveCerticate(certificateCanonical);
		
		final CertificateReportCanonical certificateReportCanonical = CertificateReportCanonicalBuilder
				.create()
				.setId(id)
				.setCertificateCanonical(certificateCanonical)
				.build();
		
		return CertificateResponseDto.create(0, "OK", certificateReportCanonical);
	}
			
	@CrossOrigin
	@RequestMapping(value = "/id/{id}", method = RequestMethod.GET, produces={ MediaType.APPLICATION_JSON_VALUE }, consumes = {
			MediaType.APPLICATION_JSON_VALUE })
	public @ResponseBody CertificateResponseDto seachCertificate(@Valid @PathVariable("id") final Long id){
		
		final CertificateReportCanonical certificateReportCanonicalParameter = certificateReportCanonicalConverter.converterId(id);
		final CertificateReportCanonical certificateReportCanonicalResult = digitalCertificateBusiness.seachCertificate(certificateReportCanonicalParameter);
		
		return CertificateResponseDto.create(0, "OK", certificateReportCanonicalResult);
	}
	
	@CrossOrigin
	@RequestMapping(value = "/id/{id}", method = RequestMethod.PUT, produces={ MediaType.APPLICATION_JSON_VALUE }, consumes = {
			MediaType.APPLICATION_JSON_VALUE })
	public @ResponseBody CertificateResponseDto updateCertificate(@Valid @PathVariable("id") final Long id, @Valid @RequestBody final CertificateRequestDto certificateRequestDto) 
			throws KeyStoreException, NoSuchAlgorithmException, CertificateException, FileNotFoundException, IOException{

		final CertificateCanonical certificateCanonical = certificateCanonicalConverter.converter(certificateRequestDto);

		final CertificateReportCanonical certificateReportCanonicalParameter = CertificateReportCanonicalBuilder
				.create()
				.setId(id)
				.setCertificateCanonical(certificateCanonical)
				.build();

		digitalCertificateBusiness.updateCertificate(certificateReportCanonicalParameter);

		return CertificateResponseDto.create(0, "OK", certificateReportCanonicalParameter);
	}
	
	@CrossOrigin
	@RequestMapping(value = "/id/{id}", method = RequestMethod.DELETE, produces={ MediaType.APPLICATION_JSON_VALUE }, consumes = {
			MediaType.APPLICATION_JSON_VALUE })
	public @ResponseBody CertificateResponseDto deleteCertificate(@Valid @PathVariable("id") final Long id){
		
		final CertificateReportCanonical certificateReportCanonical = certificateReportCanonicalConverter.converterId(id);
		digitalCertificateBusiness.deleteCertificate(certificateReportCanonical);
		
		return CertificateResponseDto.create(0, "OK", certificateReportCanonical);
	}
}
