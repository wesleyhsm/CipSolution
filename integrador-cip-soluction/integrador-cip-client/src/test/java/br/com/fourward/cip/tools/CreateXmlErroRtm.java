
package br.com.fourward.cip.tools;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import br.com.fourward.cip.xml.rtm.back.errortm.ErroRtm;

public class CreateXmlErroRtm {

	@Test
	public void create() throws JsonProcessingException {
		final XmlMapper objectMapper = new XmlMapper();
		final String xml = objectMapper.writeValueAsString(getErroRtm());
		System.out.println(xml);
	}

	private ErroRtm getErroRtm() {

		final ErroRtm erroRtm = new ErroRtm();
		erroRtm.setLinha("3");
		erroRtm.setColuna("6");
		erroRtm.setArquivo("teste.xml");
		erroRtm.setCampo("NumCtrlEmis");
		erroRtm.setDescricao("Tamanho do campo maior que o permitido! Tamanho máximo: 20");
		erroRtm.setBcArq("1");

		return erroRtm;
	}

}
