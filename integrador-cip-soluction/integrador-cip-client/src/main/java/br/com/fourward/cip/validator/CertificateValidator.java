package br.com.fourward.cip.validator;

import java.io.File;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import br.com.fourward.cip.annotation.ExistValidCertificate;

public class CertificateValidator implements ConstraintValidator<ExistValidCertificate, String>{

	@Override
	public void initialize(ExistValidCertificate constraintAnnotation) {
	}
	
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		return value == null || value.isEmpty() || isCertificate(value);
	}
	
	private boolean isCertificate(final String certificate){
		
		final int totalCaracter = certificate.length();
		
		final int partCaracter = (totalCaracter - 4);
		
		final String extension = certificate.substring(partCaracter, totalCaracter);
		
		final boolean exist = new File(certificate).exists();
		
		if((".pfx".equalsIgnoreCase(extension) && exist == true) || (".cer".equalsIgnoreCase(extension) && exist == true)){
			return true;
		}else{
			return false;
		}	
	}
}
