
package br.com.fourward.cip.canonical;

import java.io.Serializable;

public class GeneratorFileNameRulesCanonical implements Serializable {

	private static final long serialVersionUID = -5906575905086964771L;

	private final String systemDate;
	private final String fileType;
	private final String sequenceNumber;

	public GeneratorFileNameRulesCanonical(final String systemDate,
			final String fileType,
			final String sequenceNumber) {
		super();
		this.systemDate = systemDate;
		this.fileType = fileType;
		this.sequenceNumber = sequenceNumber;
	}

	public String getSystemDate() {
		return systemDate;
	}

	public String getFileType() {
		return fileType;
	}

	public String getSequenceNumber() {
		return sequenceNumber;
	}

	public String getFileName() {
		return String.format("%s_%s_%s", fileType, systemDate, sequenceNumber);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (prime * result) + ((fileType == null) ? 0 : fileType.hashCode());
		result = (prime * result) + ((sequenceNumber == null) ? 0 : sequenceNumber.hashCode());
		result = (prime * result) + ((systemDate == null) ? 0 : systemDate.hashCode());
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final GeneratorFileNameRulesCanonical other = (GeneratorFileNameRulesCanonical) obj;
		if (fileType == null) {
			if (other.fileType != null) {
				return false;
			}
		} else if (!fileType.equals(other.fileType)) {
			return false;
		}
		if (sequenceNumber == null) {
			if (other.sequenceNumber != null) {
				return false;
			}
		} else if (!sequenceNumber.equals(other.sequenceNumber)) {
			return false;
		}
		if (systemDate == null) {
			if (other.systemDate != null) {
				return false;
			}
		} else if (!systemDate.equals(other.systemDate)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "GeneratorFileNameRulesCanonical [systemDate="
				+ systemDate
				+ ", fileType="
				+ fileType
				+ ", sequenceNumber="
				+ sequenceNumber
				+ "]";
	}
}
