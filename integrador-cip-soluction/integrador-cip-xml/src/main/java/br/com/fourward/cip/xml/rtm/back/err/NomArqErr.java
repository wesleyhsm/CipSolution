
package br.com.fourward.cip.xml.rtm.back.err;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

public class NomArqErr {

	private String content;
	private String codErro;

	public NomArqErr() {

	}

	public NomArqErr(final String content, final String codErro) {
		super();
		this.content = content;
		this.codErro = codErro;
	}

	@JacksonXmlText
	public String getContent() {
		return content;
	}

	public void setContent(final String content) {
		this.content = content;
	}

	@JacksonXmlProperty(isAttribute = true, localName = "CodErro")
	public String getCodErro() {
		return codErro;
	}

	public void setCodErro(final String codErro) {
		this.codErro = codErro;
	}

	@Override
	public String toString() {
		return "NomArq [content=" + content + ", codErro=" + codErro + "]";
	}
}
