package br.com.fourward.cip.canonical;

import java.io.Serializable;

public class PaymentResponseCanonical implements Serializable{
	
	private static final long serialVersionUID = 6695958948147010162L;
	
	private final Integer code;
	private final String message;

	public static PaymentResponseCanonical create(final Integer code, final String message){
		return new PaymentResponseCanonical(code, message);
	}
	
	private PaymentResponseCanonical(final Integer code, final String message) {
		super();
		this.code = code;
		this.message = message;
	}

	public Integer getCode() {
		return code;
	}
	
	public String getMessage() {
		return message;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		PaymentResponseCanonical other = (PaymentResponseCanonical) obj;
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
		return "PaymentResponseCanonical [code=" + code + ", message=" + message + "]";
	}	
}
