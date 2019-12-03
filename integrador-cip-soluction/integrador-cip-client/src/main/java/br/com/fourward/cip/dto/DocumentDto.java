package br.com.fourward.cip.dto;

import java.io.Serializable;

public class DocumentDto implements Serializable {

	private static final long serialVersionUID = -2055606218549469046L;

	private DocumentTypeDto type;
	private String value;

	public DocumentTypeDto getType() {
		return type;
	}

	public void setType(DocumentTypeDto type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
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
		DocumentDto other = (DocumentDto) obj;
		if (type != other.type)
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Document [type=" + type + ", value=" + value + "]";
	}
}