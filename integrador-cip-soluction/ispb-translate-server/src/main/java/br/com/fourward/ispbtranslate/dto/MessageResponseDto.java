package br.com.fourward.ispbtranslate.dto;

import java.io.Serializable;

public class MessageResponseDto implements Serializable{

	private static final long serialVersionUID = -2390303868744501428L;

	private final Integer code;
	private final String message;
	
	public static MessageResponseDto createMessageResponseDto(final Integer code, final String message){
		return new MessageResponseDto(code, message);
	}

	protected MessageResponseDto(final Integer code, final String message) {
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
		MessageResponseDto other = (MessageResponseDto) obj;
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
		return "MessageResponseDto [code=" + code + ", message=" + message + "]";
	}
}
