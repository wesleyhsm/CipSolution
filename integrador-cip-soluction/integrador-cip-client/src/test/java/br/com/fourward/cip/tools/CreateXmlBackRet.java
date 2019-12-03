
package br.com.fourward.cip.tools;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import br.com.fourward.cip.xml.rtm.back.ret.AslcDocRet;
import br.com.fourward.cip.xml.rtm.back.ret.BcArqRet;
import br.com.fourward.cip.xml.rtm.back.ret.ErroRet;
import br.com.fourward.cip.xml.rtm.back.ret.ErrosRet;
import br.com.fourward.cip.xml.rtm.back.ret.GrupoLiquidTranscParcActoPVActoRet;
import br.com.fourward.cip.xml.rtm.back.ret.GrupoLiquidTranscParcActoPVRecsdoRet;

public class CreateXmlBackRet {

	@Test
	public void create() throws JsonProcessingException {
		final XmlMapper objectMapper = new XmlMapper();
		final String xml = objectMapper.writeValueAsString(getASLCDOC());
		System.out.println(xml);
	}

	private AslcDocRet getASLCDOC() {
		final BcArqRet bcArq = new BcArqRet();
		bcArq.setTipoArquivo("2");
		bcArq.setNumCtrlEmis("56545454554");
		bcArq.setNsu("11");
		bcArq.setDtHrArq(new Date());

		final GrupoLiquidTranscParcActoPVActoRet grupoLiquidTranscParcActoPVActo = new GrupoLiquidTranscParcActoPVActoRet();
		grupoLiquidTranscParcActoPVActo.setIspbIfDevdr("14725836");
		grupoLiquidTranscParcActoPVActo.setIspbIfCredr("14563298");
		grupoLiquidTranscParcActoPVActo.setSitRetReq("1");
		grupoLiquidTranscParcActoPVActo.setNumCtrlCreddrCentrlzActo("5554545151515554545");
		grupoLiquidTranscParcActoPVActo.setNumCtrlCIPCentrlzActo("554555454545545");
		grupoLiquidTranscParcActoPVActo.setNumCtrlCreddrPontoVendaActo("5454545454545");
		grupoLiquidTranscParcActoPVActo.setNumCtrlCIPPontoVendaActo("55454545454545454");
		grupoLiquidTranscParcActoPVActo.setNuLiquid("5454545545454545454");
		grupoLiquidTranscParcActoPVActo.setDtHrManut(new Date());

		final List<GrupoLiquidTranscParcActoPVActoRet> grupoLiquidTranscParcActoPVActos = new ArrayList<>();
		grupoLiquidTranscParcActoPVActos.add(grupoLiquidTranscParcActoPVActo);

		final ErrosRet erros = new ErrosRet();

		final int contador = 3;
		for (int cont = 0; cont < contador; cont++) {
			final ErroRet erro = new ErroRet();
			erro.setCampo("GrupoLiquidTranscRecsdo");
			erro.setCodErro("ESLC0" + (127 + cont));

			erros.getErros().add(erro);
		}

		final GrupoLiquidTranscParcActoPVRecsdoRet grupoLiquidTranscParcActoPVRecsdo =
				new GrupoLiquidTranscParcActoPVRecsdoRet();
		grupoLiquidTranscParcActoPVRecsdo.setIspbIfDevdr("14725639");
		grupoLiquidTranscParcActoPVRecsdo.setIspbIfCredr("45236987");
		grupoLiquidTranscParcActoPVRecsdo.setSitRetReq("1");
		grupoLiquidTranscParcActoPVRecsdo.setNumCtrlCreddrCentrlz("454545454545454");
		grupoLiquidTranscParcActoPVRecsdo.setTpPessoaCentrlz("J");
		grupoLiquidTranscParcActoPVRecsdo.setCnpjCpfCentrlz("14725836914572");
		grupoLiquidTranscParcActoPVRecsdo.setCodCentrlz("25545454");
		grupoLiquidTranscParcActoPVRecsdo.setTpCt("CC");
		grupoLiquidTranscParcActoPVRecsdo.setCtPgtoCentrlz("55455454545454545");
		grupoLiquidTranscParcActoPVRecsdo.setNumCtrlCreddrPontoVenda("54545545545454545554");
		grupoLiquidTranscParcActoPVRecsdo.setIspbIfLiquidPontoVenda("44445555");
		grupoLiquidTranscParcActoPVRecsdo.setCodPontoVenda("55454545454554");
		grupoLiquidTranscParcActoPVRecsdo.setNomePontoVenda("nome teste ponto venda");
		grupoLiquidTranscParcActoPVRecsdo.setTpPessoaPontoVenda("F");
		grupoLiquidTranscParcActoPVRecsdo.setCnpjCpfPontoVenda("14725836912");
		grupoLiquidTranscParcActoPVRecsdo.setCodInstitdrArrajPgto("25");
		grupoLiquidTranscParcActoPVRecsdo.setTpProdLiquid("2");
		grupoLiquidTranscParcActoPVRecsdo.setIndrFormaTransf("3");
		grupoLiquidTranscParcActoPVRecsdo.setCodMoeda("790");
		grupoLiquidTranscParcActoPVRecsdo.setDtPgto(new Date());
		grupoLiquidTranscParcActoPVRecsdo.setVlrPgto("2548.02");
		grupoLiquidTranscParcActoPVRecsdo.setErros(erros);

		final List<GrupoLiquidTranscParcActoPVRecsdoRet> grupoLiquidTranscParcActoPVRecsdos = new ArrayList<>();
		grupoLiquidTranscParcActoPVRecsdos.add(grupoLiquidTranscParcActoPVRecsdo);

		final AslcDocRet aslcDoc = new AslcDocRet();
		aslcDoc.setBcArq(bcArq);
		aslcDoc.setGrupoLiquidTranscParcActoPVActos(grupoLiquidTranscParcActoPVActos);
		aslcDoc.setGrupoLiquidTranscParcActoPVRecsdos(grupoLiquidTranscParcActoPVRecsdos);

		return aslcDoc;
	}

}
