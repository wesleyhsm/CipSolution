package br.com.fourward.cip.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.com.fourward.cip.annotation.ExistValidCertificate;

public class CertificateRequestDto implements Serializable{

	private static final long serialVersionUID = -2962492948443259855L;

	@NotNull(message="O local e nome do certificado não pode ser nulo.")
	@ExistValidCertificate
	private String localeCertificate;
	
	@NotNull(message="A senha do certificado não pode ser nulo.")
	private String passwordCertificate;
	
	@NotNull(message="O ISPB não pode ser nulo.")
	@Size(min=8, max=8, message="O ISPB deve ter tamanho de 8 caracteres.")
	private String ispb;

	public CertificateRequestDto(){
	}
	
	public CertificateRequestDto(String localeCertificate, String passwordCertificate, String ispb) {
		super();
		this.localeCertificate = localeCertificate;
		this.passwordCertificate = passwordCertificate;
		this.ispb = ispb;
	}

	public String getLocaleCertificate() {
		return localeCertificate;
	}

	public void setLocaleCertificate(String localeCertificate) {
		this.localeCertificate = localeCertificate;
	}

	public String getPasswordCertificate() {
		return passwordCertificate;
	}

	public void setPasswordCertificate(String passwordCertificate) {
		this.passwordCertificate = passwordCertificate;
	}

	public String getIspb() {
		return ispb;
	}

	public void setIspb(String ispb) {
		this.ispb = ispb;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ispb == null) ? 0 : ispb.hashCode());
		result = prime * result + ((localeCertificate == null) ? 0 : localeCertificate.hashCode());
		result = prime * result + ((passwordCertificate == null) ? 0 : passwordCertificate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CertificateRequestDto other = (CertificateRequestDto) obj;
		if (ispb == null) {
			if (other.ispb != null)
				return false;
		} else if (!ispb.equals(other.ispb))
			return false;
		if (localeCertificate == null) {
			if (other.localeCertificate != null)
				return false;
		} else if (!localeCertificate.equals(other.localeCertificate))
			return false;
		if (passwordCertificate == null) {
			if (other.passwordCertificate != null)
				return false;
		} else if (!passwordCertificate.equals(other.passwordCertificate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CertificateRequestDto [localeCertificate=" + localeCertificate + ", passwordCertificate="
				+ passwordCertificate + ", ispb=" + ispb + "]";
	}	
}
