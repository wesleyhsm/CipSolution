
package br.com.fourward.cip.xml.rtm.back.ret.converter;

import java.util.Date;

import org.springframework.stereotype.Component;

import br.com.fourward.cip.xml.rtm.back.ret.GrupoLiquidTranscParcActoPVActoRet;
import br.com.fourward.cip.xml.rtm.back.ret.builder.GrupoLiquidTranscParcActoPVActoRetBuilder;

@Component
public class GrupoLiquidTranscParcActoPVActoRetConverter {

	public GrupoLiquidTranscParcActoPVActoRet converter() {

		final String ispbIfDevdr = null;
		final String ispbIfCredr = null;
		final String sitRetReq = null;
		final String numCtrlCreddrCentrlzActo = null;
		final String numCtrlCIPCentrlzActo = null;
		final String numCtrlCreddrPontoVendaActo = null;
		final String numCtrlCIPPontoVendaActo = null;
		final String nuLiquid = null;
		final Date dtHrManut = null;

		return GrupoLiquidTranscParcActoPVActoRetBuilder.create()
				.setIspbIfDevdr(ispbIfDevdr)
				.setIspbIfCredr(ispbIfCredr)
				.setSitRetReq(sitRetReq)
				.setNumCtrlCreddrCentrlzActo(numCtrlCreddrCentrlzActo)
				.setNumCtrlCIPCentrlzActo(numCtrlCIPCentrlzActo)
				.setNumCtrlCreddrPontoVendaActo(numCtrlCreddrPontoVendaActo)
				.setNumCtrlCIPPontoVendaActo(numCtrlCIPPontoVendaActo)
				.setNuLiquid(nuLiquid)
				.setDtHrManut(dtHrManut)
				.build();
	}

}
