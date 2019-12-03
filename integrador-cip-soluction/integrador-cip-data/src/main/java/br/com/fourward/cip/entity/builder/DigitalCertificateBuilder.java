package br.com.fourward.cip.entity.builder;

import java.util.Date;

import br.com.fourward.cip.entity.DigitalCertificateEntity;

public class DigitalCertificateBuilder {

	private Long id;
	private String path;
	private String password;
	private Date expirationDate;
	private Date activationDate;
	private Boolean active;
	private String ispb;
	
	public static DigitalCertificateBuilder create(){
		return new DigitalCertificateBuilder();
	}

	private DigitalCertificateBuilder(){

	}
	
	public DigitalCertificateBuilder setId(final Long id){
		this.id = id;
		return this;
	}

	public DigitalCertificateBuilder setPath(final String path){
		this.path = path;
		return this;
	}

	public DigitalCertificateBuilder setPassword(final String password){
		this.password = password;
		return this;
	}

	public DigitalCertificateBuilder setExpirationDate(final Date expirationDate){
		this.expirationDate = expirationDate;
		return this;
	}

	public DigitalCertificateBuilder setActivationDate(final Date activationDate){
		this.activationDate = activationDate;
		return this;
	}

	public DigitalCertificateBuilder setActive(final Boolean active){
		this.active = active;
		return this;
	}

	public DigitalCertificateBuilder setIspb(final String ispb){
		this.ispb = ispb;
		return this;
	}

	public DigitalCertificateEntity build(){
		return new DigitalCertificateEntity(id, path, password, expirationDate, activationDate, active, ispb);
	}
}