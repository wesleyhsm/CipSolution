
package br.com.fourward.cip.xml.rtm.back.converter;

import java.util.List;

import org.springframework.stereotype.Component;

import br.com.fourward.cip.xml.rtm.back.AslcDocBack;
import br.com.fourward.cip.xml.rtm.back.BcArqBack;
import br.com.fourward.cip.xml.rtm.back.GrupoLiquidTranscBack;
import br.com.fourward.cip.xml.rtm.back.builder.AslcDocBackBuilder;

@Component
public class AslcDocBackConverter {

	public AslcDocBack converter() {

		final BcArqBack bcArq = null;
		final List<GrupoLiquidTranscBack> grupoLiquidTransc = null;

		return AslcDocBackBuilder.create().setBcArq(bcArq).setGrupoLiquidTransc(grupoLiquidTransc).build();
	}
}
