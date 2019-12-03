
package br.com.fourward.cip.xml.rtm.back.ret;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "ASLCDOC")
@JsonPropertyOrder({ "BcArq", "GrupoLiquidTranscParcActoPVActo", "GrupoLiquidTranscParcActoPVRecsdo" })
public class AslcDocRet {

	private BcArqRet BcArq;
	private List<GrupoLiquidTranscParcActoPVActoRet> grupoLiquidTranscParcActoPVActos;
	private List<GrupoLiquidTranscParcActoPVRecsdoRet> grupoLiquidTranscParcActoPVRecsdos;

	public AslcDocRet() {

	}

	public AslcDocRet(final BcArqRet bcArq,
			final List<GrupoLiquidTranscParcActoPVActoRet> grupoLiquidTranscParcActoPVActos,
			final List<GrupoLiquidTranscParcActoPVRecsdoRet> grupoLiquidTranscParcActoPVRecsdos) {
		super();
		BcArq = bcArq;
		this.grupoLiquidTranscParcActoPVActos = grupoLiquidTranscParcActoPVActos;
		this.grupoLiquidTranscParcActoPVRecsdos = grupoLiquidTranscParcActoPVRecsdos;
	}

	@JacksonXmlProperty(localName = "BcArq")
	public BcArqRet getBcArq() {
		return BcArq;
	}

	public void setBcArq(final BcArqRet bcArq) {
		BcArq = bcArq;
	}

	@JacksonXmlElementWrapper(useWrapping = false)
	@JacksonXmlProperty(localName = "GrupoLiquidTranscParcActoPVActo")
	public List<GrupoLiquidTranscParcActoPVActoRet> getGrupoLiquidTranscParcActoPVActos() {
		return grupoLiquidTranscParcActoPVActos;
	}

	public void setGrupoLiquidTranscParcActoPVActos(
			final List<GrupoLiquidTranscParcActoPVActoRet> grupoLiquidTranscParcActoPVActos) {
		this.grupoLiquidTranscParcActoPVActos = grupoLiquidTranscParcActoPVActos;
	}

	@JacksonXmlElementWrapper(useWrapping = false)
	@JacksonXmlProperty(localName = "GrupoLiquidTranscParcActoPVRecsdo")
	public List<GrupoLiquidTranscParcActoPVRecsdoRet> getGrupoLiquidTranscParcActoPVRecsdos() {
		return grupoLiquidTranscParcActoPVRecsdos;
	}

	public void setGrupoLiquidTranscParcActoPVRecsdos(
			final List<GrupoLiquidTranscParcActoPVRecsdoRet> grupoLiquidTranscParcActoPVRecsdos) {
		this.grupoLiquidTranscParcActoPVRecsdos = grupoLiquidTranscParcActoPVRecsdos;
	}

	@Override
	public String toString() {
		return "ASLCDOC [BcArq="
				+ BcArq
				+ ", grupoLiquidTranscParcActoPVActos="
				+ grupoLiquidTranscParcActoPVActos
				+ ", grupoLiquidTranscParcActoPVRecsdos="
				+ grupoLiquidTranscParcActoPVRecsdos
				+ "]";
	}
}
