
package br.com.fourward.cip.rules;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import br.com.fourward.cip.xml.rtm.send.AslcDocSend;
import br.com.fourward.cip.xml.rtm.send.BcArq;
import br.com.fourward.cip.xml.rtm.send.CodMoeda;
import br.com.fourward.cip.xml.rtm.send.GrupoLiquidTransc;
import br.com.fourward.cip.xml.rtm.send.IndrFormaTransf;
import br.com.fourward.cip.xml.rtm.send.TipoArquivo;
import br.com.fourward.cip.xml.rtm.send.TipoConta;
import br.com.fourward.cip.xml.rtm.send.TpPessoaCentrlz;
import br.com.fourward.cip.xml.rtm.send.TpPessoaPontoVenda;
import br.com.fourward.cip.xml.rtm.send.TpProdLiquid;

public class CreateFolderFileRulesTest {

	@Test
	public void create() throws IOException {

		final XmlMapper xmlMapper = new XmlMapper();
		final String xml = xmlMapper.writeValueAsString(getAslcDocSend());

		final String localeFile = "C://Users//Wesley//Documents//cip//envio//credit//1_20180822.xml";

		final CreateFolderFileRules createFolderFileRules = new CreateFolderFileRules();

		createFolderFileRules.createFile(xml, localeFile);

	}

	private AslcDocSend getAslcDocSend() {

		final BcArq bcArq = new BcArq("123");
		final List<GrupoLiquidTransc> grupoLiquidTranscs = new ArrayList<>();

		final int contador = 3;
		for (int cont = 0; cont < contador; cont++) {

			final GrupoLiquidTransc grupoLiquidTransc = new GrupoLiquidTransc();
			grupoLiquidTransc.setAgCentrlz("4444");
			grupoLiquidTransc.setAgCreddr("5555");
			grupoLiquidTransc.setCnpjCpfCentrlz("14725836914724");
			grupoLiquidTransc.setCnpjCpfPontoVenda("14725836914");
			grupoLiquidTransc.setCodCentrlz("545454");
			grupoLiquidTransc.setCodInstitdrArrajPgto(5);
			grupoLiquidTransc.setCodMoeda(CodMoeda.Real.getValue());
			grupoLiquidTransc.setCodPontoVenda("1121212121121");
			grupoLiquidTransc.setCtCentrlz("44545454");
			grupoLiquidTransc.setCtCreddr("55454");
			grupoLiquidTransc.setDtPgto(new Date());
			grupoLiquidTransc.setIndrFormaTransf(IndrFormaTransf.Siloc.getValue());
			grupoLiquidTransc.setIspbIfCredr("14725836");
			grupoLiquidTransc.setIspbIfDevdr("12345678");
			grupoLiquidTransc.setIspbIfLiquidPontoVenda("14725836");
			grupoLiquidTransc.setNomePontoVenda("nome ponto de vanda");
			grupoLiquidTransc.setNumCtrlCreddrCentrlz("5418181");
			grupoLiquidTransc.setNumCtrlCreddrPontoVenda("251554545");
			grupoLiquidTransc.setTipoArquivo(TipoArquivo.Credit.getValue());
			grupoLiquidTransc.setTpCt(TipoConta.ContaCorrente.getValue());
			grupoLiquidTransc.setTpPessoaCentrlz(TpPessoaCentrlz.CNPJ.getValue());
			grupoLiquidTransc.setTpPessoaPontoVenda(TpPessoaPontoVenda.CPF.getValue());
			grupoLiquidTransc.setTpProdLiquid(TpProdLiquid.CartaoCredito.getValue());
			grupoLiquidTransc.setVlrPgto(new BigDecimal((cont + 1) * 1500.25));

			grupoLiquidTranscs.add(grupoLiquidTransc);
		}

		final AslcDocSend aslcDocSend = new AslcDocSend();
		aslcDocSend.setBcArq(bcArq);
		aslcDocSend.setGrupoLiquidTranscs(grupoLiquidTranscs);

		return aslcDocSend;
	}
}
