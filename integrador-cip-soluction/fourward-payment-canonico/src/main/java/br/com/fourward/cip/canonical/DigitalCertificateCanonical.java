package br.com.fourward.cip.canonical;

import java.io.Serializable;

public class DigitalCertificateCanonical implements  Serializable{
	
	private static final long serialVersionUID = -655271526776813284L;
	
	private final Long id;
	private final CertificateCanonical certificateCanonical;
	private final ValidateDateCertificateCanonical validateDateCertificateCanonical;
			
	public DigitalCertificateCanonical(final CertificateCanonical certificateCanonical,
			final ValidateDateCertificateCanonical validateDateCertificateCanonical,
			final Long id) {
		super();
		this.certificateCanonical = certificateCanonical;
		this.validateDateCertificateCanonical = validateDateCertificateCanonical;
		this.id=id;
	}

	public Long getId() {
		return id;
	}
	
	public CertificateCanonical getCertificateCanonical() {
		return certificateCanonical;
	}

	public ValidateDateCertificateCanonical getValidateDateCertificateCanonical() {
		return validateDateCertificateCanonical;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((certificateCanonical == null) ? 0 : certificateCanonical.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((validateDateCertificateCanonical == null) ? 0 : validateDateCertificateCanonical.hashCode());
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
		DigitalCertificateCanonical other = (DigitalCertificateCanonical) obj;
		if (certificateCanonical == null) {
			if (other.certificateCanonical != null)
				return false;
		} else if (!certificateCanonical.equals(other.certificateCanonical))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (validateDateCertificateCanonical == null) {
			if (other.validateDateCertificateCanonical != null)
				return false;
		} else if (!validateDateCertificateCanonical.equals(other.validateDateCertificateCanonical))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DigitalCertificateCanonical [id=" + id + ", certificateCanonical=" + certificateCanonical
				+ ", validateDateCertificateCanonical=" + validateDateCertificateCanonical + "]";
	}	
}
