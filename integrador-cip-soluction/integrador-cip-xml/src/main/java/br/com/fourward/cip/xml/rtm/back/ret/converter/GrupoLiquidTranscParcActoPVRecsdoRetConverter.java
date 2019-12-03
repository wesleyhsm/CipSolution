
package br.com.fourward.cip.xml.rtm.back.ret.converter;

import java.util.Date;

import org.springframework.stereotype.Component;

import br.com.fourward.cip.xml.rtm.back.ret.ErrosRet;
import br.com.fourward.cip.xml.rtm.back.ret.GrupoLiquidTranscParcActoPVRecsdoRet;
import br.com.fourward.cip.xml.rtm.back.ret.builder.GrupoLiquidTranscParcActoPVRecsdoRetBuilder;

@Component
public class GrupoLiquidTranscParcActoPVRecsdoRetConverter {

	public GrupoLiquidTranscParcActoPVRecsdoRet converter() {

		final String ispbIfDevdr = null;
		final String ispbIfCredr = null;
		final String sitRetReq = null;
		final String numCtrlCreddrCentrlz = null;
		final String tpPessoaCentrlz = null;
		final String cnpjCpfCentrlz = null;
		final String codCentrlz = null;
		final String tpCt = null;
		final String ctPgtoCentrlz = null;
		final String numCtrlCreddrPontoVenda = null;
		final String ispbIfLiquidPontoVenda = null;
		final String codPontoVenda = null;
		final String nomePontoVenda = null;
		final String tpPessoaPontoVenda = null;
		final String cnpjCpfPontoVenda = null;
		final String codInstitdrArrajPgto = null;
		final String tpProdLiquid = null;
		final String indrFormaTransf = null;
		final String codMoeda = null;
		final Date dtPgto = null;
		final String vlrPgto = null;
		final ErrosRet erros = null;

		return GrupoLiquidTranscParcActoPVRecsdoRetBuilder.create()
				.setIspbIfDevdr(ispbIfDevdr)
				.setIspbIfCredr(ispbIfCredr)
				.setSitRetReq(sitRetReq)
				.setNumCtrlCreddrCentrlz(numCtrlCreddrCentrlz)
				.setTpPessoaCentrlz(tpPessoaCentrlz)
				.setCnpjCpfCentrlz(cnpjCpfCentrlz)
				.setCodCentrlz(codCentrlz)
				.setTpCt(tpCt)
				.setCtPgtoCentrlz(ctPgtoCentrlz)
				.setNumCtrlCreddrPontoVenda(numCtrlCreddrPontoVenda)
				.setIspbIfLiquidPontoVenda(ispbIfLiquidPontoVenda)
				.setCodPontoVenda(codPontoVenda)
				.setNomePontoVenda(nomePontoVenda)
				.setTpPessoaPontoVenda(tpPessoaPontoVenda)
				.setCnpjCpfPontoVenda(cnpjCpfPontoVenda)
				.setCodInstitdrArrajPgto(codInstitdrArrajPgto)
				.setTpProdLiquid(tpProdLiquid)
				.setIndrFormaTransf(indrFormaTransf)
				.setCodMoeda(codMoeda)
				.setDtPgto(dtPgto)
				.setVlrPgto(vlrPgto)
				.setErros(erros)
				.build();
	}
}
