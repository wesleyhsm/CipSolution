package br.com.fourward.cip.exception;

public class PaymentException extends Exception{

	private static final long serialVersionUID = 3689366898566355194L;
	
    public PaymentException(String message, Throwable cause) {
        super(message, cause);
    }
   
    public PaymentException(String message) {
        super(message);
    }
}
