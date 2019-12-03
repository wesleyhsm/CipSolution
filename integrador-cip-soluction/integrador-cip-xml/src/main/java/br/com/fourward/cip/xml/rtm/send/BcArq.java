
package br.com.fourward.cip.xml.rtm.send;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonPropertyOrder({ "NumCtrlEmis" })
public class BcArq {

	private String numCtrlEmis;

	public BcArq() {

	}

	public BcArq(final String numCtrlEmis) {
		super();
		this.numCtrlEmis = numCtrlEmis;
	}

	@JacksonXmlProperty(localName = "NumCtrlEmis")
	public String getNumCtrlEmis() {
		return numCtrlEmis;
	}

	public void setNumCtrlEmis(final String numCtrlEmis) {
		this.numCtrlEmis = numCtrlEmis;
	}

	@Override
	public String toString() {
		return "BcArq [numCtrlEmis=" + numCtrlEmis + "]";
	}
}
