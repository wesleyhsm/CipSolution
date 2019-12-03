package br.com.fourward.cip.canonical;

import java.io.Serializable;

public class DocumentCanonical implements Serializable {

	private static final long serialVersionUID = -2055606218549469046L;

	private DocumentTypeCanonical type;
	private String value;

	public DocumentCanonical() {

	}

	public DocumentCanonical(DocumentTypeCanonical type, String value) {
		super();
		this.type = type;
		this.value = value;
	}

	public DocumentTypeCanonical getType() {
		return type;
	}

	public void setType(DocumentTypeCanonical type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public String getCnpjBase() {
		return this.getValue().substring(0, 8);
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
		DocumentCanonical other = (DocumentCanonical) obj;
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