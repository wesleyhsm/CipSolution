
package br.com.fourward.cip.tools;

import java.util.Date;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import br.com.fourward.cip.xml.rtm.back.pro.AslcDocPro;
import br.com.fourward.cip.xml.rtm.back.pro.BcArqPro;

public class CreateXmlPro {

	@Test
	public void create() throws JsonProcessingException {
		final XmlMapper objectMapper = new XmlMapper();
		final String xml = objectMapper.writeValueAsString(getAslcDocPro());
		System.out.println(xml);
	}

	private AslcDocPro getAslcDocPro() {

		final BcArqPro bcArq = new BcArqPro();
		bcArq.setTipoArquivo("2");
		bcArq.setNumCtrlEmis("654545");
		bcArq.setNsu("45454545454");
		bcArq.setDtHrArq(new Date());

		final AslcDocPro aslcDocPro = new AslcDocPro();
		aslcDocPro.setBcArq(bcArq);

		return aslcDocPro;
	}

}
