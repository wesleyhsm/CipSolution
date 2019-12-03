
package br.com.fourward.cip.xml.rtm.back.ret.builder;

import java.util.List;

import br.com.fourward.cip.xml.rtm.back.ret.AslcDocRet;
import br.com.fourward.cip.xml.rtm.back.ret.BcArqRet;
import br.com.fourward.cip.xml.rtm.back.ret.GrupoLiquidTranscParcActoPVActoRet;
import br.com.fourward.cip.xml.rtm.back.ret.GrupoLiquidTranscParcActoPVRecsdoRet;

public class AslcDocRetBuilder {

	public static AslcDocRetBuilder create() {
		return new AslcDocRetBuilder();
	}

	private AslcDocRetBuilder() {

	}

	private BcArqRet BcArq;
	private List<GrupoLiquidTranscParcActoPVActoRet> grupoLiquidTranscParcActoPVActos;
	private List<GrupoLiquidTranscParcActoPVRecsdoRet> grupoLiquidTranscParcActoPVRecsdos;

	public AslcDocRetBuilder setBcArq(final BcArqRet BcArq) {
		this.BcArq = BcArq;
		return this;
	}

	public AslcDocRetBuilder setGrupoLiquidTranscParcActoPVActos(
			final List<GrupoLiquidTranscParcActoPVActoRet> grupoLiquidTranscParcActoPVActos) {
		this.grupoLiquidTranscParcActoPVActos = grupoLiquidTranscParcActoPVActos;
		return this;
	}

	public AslcDocRetBuilder setGrupoLiquidTranscParcActoPVRecsdos(
			final List<GrupoLiquidTranscParcActoPVRecsdoRet> grupoLiquidTranscParcActoPVRecsdos) {
		this.grupoLiquidTranscParcActoPVRecsdos = grupoLiquidTranscParcActoPVRecsdos;
		return this;
	}

	public AslcDocRet build() {
		return new AslcDocRet(BcArq, grupoLiquidTranscParcActoPVActos, grupoLiquidTranscParcActoPVRecsdos);
	}
}
