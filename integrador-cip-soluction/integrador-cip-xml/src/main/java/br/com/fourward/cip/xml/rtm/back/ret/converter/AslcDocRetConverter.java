
package br.com.fourward.cip.xml.rtm.back.ret.converter;

import java.util.List;

import org.springframework.stereotype.Component;

import br.com.fourward.cip.xml.rtm.back.ret.AslcDocRet;
import br.com.fourward.cip.xml.rtm.back.ret.BcArqRet;
import br.com.fourward.cip.xml.rtm.back.ret.GrupoLiquidTranscParcActoPVActoRet;
import br.com.fourward.cip.xml.rtm.back.ret.GrupoLiquidTranscParcActoPVRecsdoRet;
import br.com.fourward.cip.xml.rtm.back.ret.builder.AslcDocRetBuilder;

@Component
public class AslcDocRetConverter {

	public AslcDocRet createAslcDocRet() {

		final BcArqRet BcArq = null;
		final List<GrupoLiquidTranscParcActoPVActoRet> grupoLiquidTranscParcActoPVActos = null;
		final List<GrupoLiquidTranscParcActoPVRecsdoRet> grupoLiquidTranscParcActoPVRecsdos = null;

		return AslcDocRetBuilder.create()
				.setBcArq(BcArq)
				.setGrupoLiquidTranscParcActoPVActos(grupoLiquidTranscParcActoPVActos)
				.setGrupoLiquidTranscParcActoPVRecsdos(grupoLiquidTranscParcActoPVRecsdos)
				.build();
	}
}
