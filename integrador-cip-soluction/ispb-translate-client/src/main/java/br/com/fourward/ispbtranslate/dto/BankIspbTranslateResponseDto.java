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
}
