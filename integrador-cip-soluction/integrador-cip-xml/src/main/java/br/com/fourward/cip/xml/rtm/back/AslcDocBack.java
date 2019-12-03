
package br.com.fourward.cip.xml.rtm.back;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "ASLCDOC")
@JsonPropertyOrder({ "BcArq", "GrupoLiquidTransc" })
public class AslcDocBack {

	private BcArqBack bcArq;
	private List<GrupoLiquidTranscBack> grupoLiquidTransc;

	public AslcDocBack() {

	}

	public AslcDocBack(final BcArqBack bcArq, final List<GrupoLiquidTranscBack> grupoLiquidTransc) {
		super();
		this.bcArq = bcArq;
		this.grupoLiquidTransc = grupoLiquidTransc;
	}

	@JacksonXmlProperty(localName = "BcArq")
	public BcArqBack getBcArq() {
		return bcArq;
	}

	public void setBcArq(final BcArqBack bcArq) {
		this.bcArq = bcArq;
	}

	@JacksonXmlElementWrapper(useWrapping = false)
	@JacksonXmlProperty(localName = "GrupoLiquidTransc")
	public List<GrupoLiquidTranscBack> getGrupoLiquidTransc() {
		return grupoLiquidTransc;
	}

	public void setGrupoLiquidTransc(final List<GrupoLiquidTranscBack> grupoLiquidTransc) {
		this.grupoLiquidTransc = grupoLiquidTransc;
	}

	@Override
	public String toString() {
		return "ASLCDOC [bcArq=" + bcArq + ", grupoLiquidTransc=" + grupoLiquidTransc + "]";
	}
}
