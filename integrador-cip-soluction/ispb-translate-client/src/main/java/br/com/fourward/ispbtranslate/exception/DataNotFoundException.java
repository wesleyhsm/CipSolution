package br.com.fourward.ispbtranslate.exception;

public class DataNotFoundException extends RuntimeException{

	private static final long serialVersionUID = -4599292346097601088L;

	public DataNotFoundException(final String message) {
		super(message);
	}
}
