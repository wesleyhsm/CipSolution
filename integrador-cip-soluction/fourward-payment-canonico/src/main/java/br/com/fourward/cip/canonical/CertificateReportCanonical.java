package br.com.fourward.cip.canonical;

import java.io.Serializable;

public class CertificateReportCanonical implements Serializable{

	private static final long serialVersionUID = 8660312197505167412L;
	
	private final Long id;
	private final CertificateCanonical certificateCanonical;
		
	public CertificateReportCanonical(final Long id, final CertificateCanonical certificateCanonical) {
		super();
		this.id = id;
		this.certificateCanonical = certificateCanonical;
	}

	public Long getId() {
		return id;
	}

	public CertificateCanonical getCertificateCanonical() {
		return certificateCanonical;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((certificateCanonical == null) ? 0 : certificateCanonical.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		CertificateReportCanonical other = (CertificateReportCanonical) obj;
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
		return true;
	}

	@Override
	public String toString() {
		return "CertificateReportCanonical [id=" + id + ", certificateCanonical=" + certificateCanonical + "]";
	}	
}
