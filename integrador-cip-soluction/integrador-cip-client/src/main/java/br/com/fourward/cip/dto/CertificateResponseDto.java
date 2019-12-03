package br.com.fourward.cip.dto;

import java.io.Serializable;

import br.com.fourward.cip.canonical.CertificateReportCanonical;

public class CertificateResponseDto extends MessageResponseDto implements Serializable {

	private static final long serialVersionUID = -5917877758978933269L;

	private final CertificateReportCanonical certificateReportCanonical;

	public static CertificateResponseDto create(final Integer code, final String message) {
		return create(code, message, null);
	}

	public static CertificateResponseDto create(final Integer code, final String message,
			final CertificateReportCanonical certificateReportCanonical) {
		return new CertificateResponseDto(code, message, certificateReportCanonical);
	}

	private CertificateResponseDto(final Integer code, final String message,
			final CertificateReportCanonical certificateReportCanonical) {
		super(code, message);
		this.certificateReportCanonical = certificateReportCanonical;
	}

	public CertificateReportCanonical getCertificateReportCanonical() {
		return certificateReportCanonical;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((certificateReportCanonical == null) ? 0 : certificateReportCanonical.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		CertificateResponseDto other = (CertificateResponseDto) obj;
		if (certificateReportCanonical == null) {
			if (other.certificateReportCanonical != null)
				return false;
		} else if (!certificateReportCanonical.equals(other.certificateReportCanonical))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CertificateResponseDto [certificateReportCanonical=" + certificateReportCanonical + "]";
	}
}
