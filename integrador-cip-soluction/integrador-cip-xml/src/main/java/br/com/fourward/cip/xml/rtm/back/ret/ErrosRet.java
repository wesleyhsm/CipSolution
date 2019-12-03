
package br.com.fourward.cip.xml.rtm.back.ret;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonPropertyOrder({ "Erro" })
public class ErrosRet {

	private List<ErroRet> erros;

	public ErrosRet() {

	}

	public ErrosRet(final List<ErroRet> erros) {
		super();
		this.erros = erros;
	}

	@JacksonXmlElementWrapper(useWrapping = false)
	@JacksonXmlProperty(localName = "Erro")
	public List<ErroRet> getErros() {
		return erros;
	}

	public void setErros(final List<ErroRet> erros) {
		this.erros = erros;
	}

	@Override
	public String toString() {
		return "Erros [erros=" + erros + "]";
	}
}
