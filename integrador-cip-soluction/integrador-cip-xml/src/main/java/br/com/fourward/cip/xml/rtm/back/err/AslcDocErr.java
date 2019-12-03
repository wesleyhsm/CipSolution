
package br.com.fourward.cip.xml.rtm.back.err;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "BcArq")
@JsonPropertyOrder({ "NomArq" })
public class AslcDocErr {

	private NomArqErr nomArq;

	public AslcDocErr() {

	}

	public AslcDocErr(final NomArqErr nomArq) {
		super();
		this.nomArq = nomArq;
	}

	public NomArqErr getNomArq() {
		return nomArq;
	}

	public void setNomArq(final NomArqErr nomArq) {
		this.nomArq = nomArq;
	}

	@Override
	public String toString() {
		return "BcArq [nomArq=" + nomArq + "]";
	}
}
