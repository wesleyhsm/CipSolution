
package br.com.fourward.cip.tools;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import br.com.fourward.cip.xml.rtm.back.err.AslcDocErr;
import br.com.fourward.cip.xml.rtm.back.err.NomArqErr;

public class CreateXmlErr {

	@Test
	public void create() throws JsonProcessingException {
		final XmlMapper objectMapper = new XmlMapper();
		final String xml = objectMapper.writeValueAsString(getBcArq());
		System.out.println(xml);
	}

	private AslcDocErr getBcArq() {
		final NomArqErr nomArq = new NomArqErr();
		nomArq.setCodErro("ESLC0118");
		nomArq.setContent("ASLC027_03341541_20170531_00001_ERR");

		final AslcDocErr bcArq = new AslcDocErr();
		bcArq.setNomArq(nomArq);

		return bcArq;
	}

}
