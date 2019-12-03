
package br.com.fourward.cip.xml.rtm.back.ret;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonPropertyOrder({ "Campo", "CodErro" })
public class ErroRet {

	private String Campo;
	private String CodErro;

	public ErroRet() {

	}

	public ErroRet(final String campo, final String codErro) {
		super();
		Campo = campo;
		CodErro = codErro;
	}

	@JacksonXmlProperty(localName = "Campo")
	public String getCampo() {
		return Campo;
	}

	public void setCampo(final String campo) {
		Campo = campo;
	}

	@JacksonXmlProperty(localName = "CodErro")
	public String getCodErro() {
		return CodErro;
	}

	public void setCodErro(final String codErro) {
		CodErro = codErro;
	}

	@Override
	public String toString() {
		return "Erro [Campo=" + Campo + ", CodErro=" + CodErro + "]";
	}
}
