
package br.com.fourward.cip.xml.rtm.back.builder;

import java.util.List;

import br.com.fourward.cip.xml.rtm.back.AslcDocBack;
import br.com.fourward.cip.xml.rtm.back.BcArqBack;
import br.com.fourward.cip.xml.rtm.back.GrupoLiquidTranscBack;

public class AslcDocBackBuilder {

	public static AslcDocBackBuilder create() {
		return new AslcDocBackBuilder();
	}

	private AslcDocBackBuilder() {

	}

	private BcArqBack bcArq;
	private List<GrupoLiquidTranscBack> grupoLiquidTransc;

	public AslcDocBackBuilder setBcArq(final BcArqBack bcArq) {
		this.bcArq = bcArq;
		return this;
	}

	public AslcDocBackBuilder setGrupoLiquidTransc(final List<GrupoLiquidTranscBack> grupoLiquidTransc) {
		this.grupoLiquidTransc = grupoLiquidTransc;
		return this;
	}

	public AslcDocBack build() {
		return new AslcDocBack(bcArq, grupoLiquidTransc);
	}
}
