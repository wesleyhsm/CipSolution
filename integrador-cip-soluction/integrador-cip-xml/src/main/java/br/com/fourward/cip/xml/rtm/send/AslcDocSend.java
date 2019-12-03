
package br.com.fourward.cip.xml.rtm.send;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "ASLCDOC")
@JsonPropertyOrder({ "BcArq", "GrupoLiquidTransc" })
public class AslcDocSend {

	private BcArq bcArq;
	private List<GrupoLiquidTransc> grupoLiquidTranscs = new ArrayList<>();

	public AslcDocSend() {

	}

	public AslcDocSend(final BcArq bcArq, final List<GrupoLiquidTransc> grupoLiquidTranscs) {
		super();
		this.bcArq = bcArq;
		this.grupoLiquidTranscs = grupoLiquidTranscs;
	}

	@JacksonXmlProperty(localName = "BcArq")
	public BcArq getBcArq() {
		return bcArq;
	}

	public void setBcArq(final BcArq bcArq) {
		this.bcArq = bcArq;
	}

	@JacksonXmlElementWrapper(useWrapping = false)
	@JacksonXmlProperty(localName = "GrupoLiquidTransc")
	public List<GrupoLiquidTransc> getGrupoLiquidTranscs() {
		return grupoLiquidTranscs;
	}

	public void setGrupoLiquidTranscs(final List<GrupoLiquidTransc> grupoLiquidTranscs) {
		this.grupoLiquidTranscs = grupoLiquidTranscs;
	}

	@Override
	public String toString() {
		return "ASLCDOC [bcArq=" + bcArq + ", grupoLiquidTranscs=" + grupoLiquidTranscs + "]";
	}
}
