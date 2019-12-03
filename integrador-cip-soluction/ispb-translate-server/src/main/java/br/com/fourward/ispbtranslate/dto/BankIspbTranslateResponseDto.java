package br.com.fourward.ispbtranslate.dto;

import java.io.Serializable;

import br.com.fourward.cip.canonical.BankIspbTranslateCanonical;

public class BankIspbTranslateResponseDto implements Serializable {

	private static final long serialVersionUID = -31726862211216313L;

	private Integer code;
	private String message;
	private BankIspbTranslateCanonical bankIspbTranslateCanonical;

	public static BankIspbTranslateResponseDto create(final Integer code, final String message) {
		return create(code, message, null);
	}

	public static BankIspbTranslateResponseDto create(final Integer code, final String message,
			final BankIspbTranslateCanonical bankIspbTranslateCanonical) {
		return new BankIspbTranslateResponseDto(code, message, bankIspbTranslateCanonical);
	}

	public BankIspbTranslateResponseDto() {

	}

	private BankIspbTranslateResponseDto(final Integer code, final String message,
			final BankIspbTranslateCanonical bankIspbTranslateCanonical) {
		this.code = code;
		this.message = message;
		this.bankIspbTranslateCanonical = bankIspbTranslateCanonical;
	}

	public Integer getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}

	public BankIspbTranslateCanonical getBankIspbTranslateCanonical() {
		return bankIspbTranslateCanonical;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bankIspbTranslateCanonical == null) ? 0 : bankIspbTranslateCanonical.hashCode());
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((message == null) ? 0 : message.hashCode());
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
		BankIspbTranslateResponseDto other = (BankIspbTranslateResponseDto) obj;
		if (bankIspbTranslateCanonical == null) {
			if (other.bankIspbTranslateCanonical != null)
				return false;
		} else if (!bankIspbTranslateCanonical.equals(other.bankIspbTranslateCanonical))
			return false;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BankIspbTranslateResponseDto [code=" + code + ", message=" + message + ", bankIspbTranslateCanonical="
				+ bankIspbTranslateCanonical + "]";
	}	
}
