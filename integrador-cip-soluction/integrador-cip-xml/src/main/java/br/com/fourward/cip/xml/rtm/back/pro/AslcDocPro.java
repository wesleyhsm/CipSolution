
package br.com.fourward.cip.xml.rtm.back.pro;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "ASLCDOC")
@JsonPropertyOrder({ "BcArq" })
public class AslcDocPro {

	private BcArqPro bcArq;

	public AslcDocPro() {

	}

	public AslcDocPro(final BcArqPro bcArq) {
		super();
		this.bcArq = bcArq;
	}

	@JacksonXmlProperty(localName = "BcArq")
	public BcArqPro getBcArq() {
		return bcArq;
	}

	public void setBcArq(final BcArqPro bcArq) {
		this.bcArq = bcArq;
	}

	@Override
	public String toString() {
		return "AslcDocPro [bcArq=" + bcArq + "]";
	}
}
