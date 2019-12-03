
package br.com.fourward.cip.xml.rtm.back.converter;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import br.com.fourward.cip.xml.rtm.back.GrupoLiquidTranscBack;
import br.com.fourward.cip.xml.rtm.back.builder.GrupoLiquidTranscBackBuilder;

@Component
public class GrupoLiquidTranscBackConverter {

	public GrupoLiquidTranscBack converter() {

		final String nuLiquid = null;
		final List<String> codOcorc = null;
		final Date dtHrManut = null;

		return GrupoLiquidTranscBackBuilder.create()
				.setNuLiquid(nuLiquid)
				.setCodOcorc(codOcorc)
				.setDtHrManut(dtHrManut)
				.build();
	}

}
