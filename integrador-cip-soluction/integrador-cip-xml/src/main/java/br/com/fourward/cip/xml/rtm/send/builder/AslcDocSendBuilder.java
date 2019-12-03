
package br.com.fourward.cip.xml.rtm.send.builder;

import java.util.List;

import br.com.fourward.cip.xml.rtm.send.AslcDocSend;
import br.com.fourward.cip.xml.rtm.send.BcArq;
import br.com.fourward.cip.xml.rtm.send.GrupoLiquidTransc;

public class AslcDocSendBuilder {

	public static AslcDocSendBuilder create() {
		return new AslcDocSendBuilder();
	}

	private AslcDocSendBuilder() {

	}

	private BcArq bcArq;
	private List<GrupoLiquidTransc> grupoLiquidTranscs;

	public AslcDocSendBuilder setBcArq(final BcArq bcArq) {
		this.bcArq = bcArq;
		return this;
	}

	public AslcDocSendBuilder setGrupoLiquidTranscs(final List<GrupoLiquidTransc> grupoLiquidTranscs) {
		this.grupoLiquidTranscs = grupoLiquidTranscs;
		return this;
	}

	public AslcDocSend build() {
		return new AslcDocSend(bcArq, grupoLiquidTranscs);
	}
}
