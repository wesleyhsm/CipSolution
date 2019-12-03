package br.com.fourward.cip.certificate;

import java.io.Serializable;
import java.util.Date;

public class ValidateDateCertificate implements Serializable{

	private static final long serialVersionUID = 1825209285013847241L;

	private Date activation;
	private Date expiration;
	
	public ValidateDateCertificate(){
		
	}
		
	public Date getActivation() {
		return activation;
	}
	
	public void setActivation(Date activation) {
		this.activation = activation;
	}
	
	public Date getExpiration() {
		return expiration;
	}
	
	public void setExpiration(Date expiration) {
		this.expiration = expiration;
	}

	@Override
	public String toString() {
		return "ValidateDateCertificate [activation=" + activation + ", expiration=" + expiration + "]";
	}	
}
