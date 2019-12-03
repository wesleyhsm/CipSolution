
package br.com.fourward.cip.tools;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import br.com.fourward.cip.xml.rtm.back.AslcDocBack;
import br.com.fourward.cip.xml.rtm.back.BcArqBack;
import br.com.fourward.cip.xml.rtm.back.GrupoLiquidTranscBack;

public class CreateXmlBack {

	@Test
	public void create() throws JsonProcessingException {
		final XmlMapper objectMapper = new XmlMapper();
		final String xml = objectMapper.writeValueAsString(getASLCDOC());
		System.out.println(xml);
	}

	private AslcDocBack getASLCDOC() {

		final BcArqBack bcArq = new BcArqBack();
		bcArq.setTipoArquivo("2");
		bcArq.setNumCtrlEmis("321");
		bcArq.setNsu("1");
		bcArq.setDtHrArq(new Date());

		final List<GrupoLiquidTranscBack> grupoLiquidTranscs = new ArrayList<>();

		final int contador = 3;
		for (int cont = 0; cont < contador; cont++) {
			final GrupoLiquidTranscBack grupoLiquidTransc = new GrupoLiquidTranscBack();
			grupoLiquidTransc.setNuLiquid("4154545454545" + (cont + 1));
			grupoLiquidTransc.setDtHrManut(new Date());

			final List<String> codOcorc = new ArrayList<>();

			for (int cont2 = 0; cont2 < contador; cont2++) {
				codOcorc.add(((cont2 + 1) * 10) + "");
			}

			grupoLiquidTransc.setCodOcorc(codOcorc);
			grupoLiquidTranscs.add(grupoLiquidTransc);
		}

		final AslcDocBack aslcDoc = new AslcDocBack();
		aslcDoc.setBcArq(bcArq);
		aslcDoc.setGrupoLiquidTransc(grupoLiquidTranscs);

		return aslcDoc;
	}

}
