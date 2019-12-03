
package br.com.fourward.cip.xml.rtm.back.builder;

import java.util.Date;
import java.util.List;

import br.com.fourward.cip.xml.rtm.back.GrupoLiquidTranscBack;

public class GrupoLiquidTranscBackBuilder {

	public static GrupoLiquidTranscBackBuilder create() {
		return new GrupoLiquidTranscBackBuilder();
	}

	private GrupoLiquidTranscBackBuilder() {

	}

	private String nuLiquid;
	private List<String> codOcorc;
	private Date dtHrManut;

	public GrupoLiquidTranscBackBuilder setNuLiquid(final String nuLiquid) {
		this.nuLiquid = nuLiquid;
		return this;
	}

	public GrupoLiquidTranscBackBuilder setCodOcorc(final List<String> codOcorc) {
		this.codOcorc = codOcorc;
		return this;
	}

	public GrupoLiquidTranscBackBuilder setDtHrManut(final Date dtHrManut) {
		this.dtHrManut = dtHrManut;
		return this;
	}

	public GrupoLiquidTranscBack build() {
		return new GrupoLiquidTranscBack(nuLiquid, codOcorc, dtHrManut);
	}
}
