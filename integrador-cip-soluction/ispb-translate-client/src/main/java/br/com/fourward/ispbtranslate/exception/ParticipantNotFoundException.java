package br.com.fourward.ispbtranslate.exception;

import br.com.fourward.cip.canonical.BankIspbTranslateCanonical;

public class ParticipantNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -6250568810138392747L;

	public ParticipantNotFoundException(final BankIspbTranslateCanonical bankIspbTranslateCanonicalParameter) {
		super(String.format("ispb '%s' or bankCode '%s' not found", bankIspbTranslateCanonicalParameter.getIspb(),
				bankIspbTranslateCanonicalParameter.getBankCode()));
	}

	public ParticipantNotFoundException(final String bankCode) {
		super(String.format("bankCode '%s' not found", bankCode));
	}
}