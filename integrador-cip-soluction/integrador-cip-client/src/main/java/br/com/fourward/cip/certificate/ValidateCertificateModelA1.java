package br.com.fourward.cip.certificate;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Enumeration;

import org.springframework.stereotype.Component;

@Component
public class ValidateCertificateModelA1 implements Serializable{

	private static final long serialVersionUID = -2127320935776448744L;
		    
	public ValidateDateCertificate validateCertificate(final String locateFile, final String passwordFile) throws KeyStoreException, NoSuchAlgorithmException, CertificateException, FileNotFoundException, IOException{
		
		ValidateDateCertificate validateDateCertificate = new ValidateDateCertificate();

		KeyStore keystore = KeyStore.getInstance(("PKCS12"));

		keystore.load(new FileInputStream(locateFile), passwordFile.toCharArray());  

		Enumeration<String> eAliases = keystore.aliases();  

		while (eAliases.hasMoreElements()) {  
			final String alias = (String) eAliases.nextElement();  
			final Certificate certificate = (Certificate) keystore.getCertificate(alias);  

			X509Certificate cert = (X509Certificate) certificate;  

			validateDateCertificate.setActivation(cert.getNotBefore());
			validateDateCertificate.setExpiration(cert.getNotAfter());
		}		
		return validateDateCertificate;
	}
}
