
package br.com.fourward.cip.xml.rtm.send.converter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.fourward.cip.canonical.BankAccountCanonical;
import br.com.fourward.cip.canonical.BankIspbTranslateCanonical;
import br.com.fourward.cip.canonical.BrandCanonical;
import br.com.fourward.cip.canonical.DocumentCanonical;
import br.com.fourward.cip.canonical.GeneratorFileNameRulesCanonical;
import br.com.fourward.cip.canonical.PaymentFileCanonical;
import br.com.fourward.cip.canonical.PaymentFileGeneratorCanonical;
import br.com.fourward.cip.canonical.PaymentGeneratorCanonical;
import br.com.fourward.cip.canonical.PointOfSaleCanonical;
import br.com.fourward.cip.canonical.SubAcquirerCanonical;
import br.com.fourward.cip.xml.rtm.send.GrupoLiquidTransc;
import br.com.fourward.cip.xml.rtm.send.builder.GrupoLiquidTranscBuilder;

@Component
public class GrupoLiquidTranscConverter {

	@Autowired
	private TipoContaConverter tipoContaConverter;

	@Autowired
	private TpPessoaPontoVendaConverter tpPessoaPontoVendaConverter;

	@Autowired
	private TpPessoaCentrlzConverter tpPessoaCentrlzConverter;

	@Autowired
	private TpProdLiquidConverter tpProdLiquidConverter;

	@Autowired
	private IndrFormaTransfConverter indrFormaTransfConverter;

	@Autowired
	private CodMoedaConverter codMoedaConverter;

	public List<GrupoLiquidTransc> converter(final PaymentFileGeneratorCanonical paymentFileGeneratorCanonical) {

		final List<GrupoLiquidTransc> grupoLiquidTranscs = new ArrayList<>();

		final GeneratorFileNameRulesCanonical generatorFileNameRulesCanonical =
				paymentFileGeneratorCanonical.getGeneratorFileNameRulesCanonical();

		final String numCtrlEmis = generatorFileNameRulesCanonical.getSequenceNumber();
		final String tipoArquivo = generatorFileNameRulesCanonical.getSequenceNumber();
		final String numCtrlCreddr = generatorFileNameRulesCanonical.getSystemDate() + numCtrlEmis;

		final List<PaymentGeneratorCanonical> paymentGeneratorCanonicals =
				paymentFileGeneratorCanonical.getPaymentGeneratorCanonical();

		paymentGeneratorCanonicals.forEach(paymentGeneratorCanonical -> {

			final PaymentFileCanonical paymentFileCanonical = paymentGeneratorCanonical.getPaymentFileCanonical();
			final String id = paymentFileCanonical.getId().toString();
			final BrandCanonical brandCanonical = paymentFileCanonical.getBrand();

			final SubAcquirerCanonical subAcquirerCanonical = paymentFileCanonical.getSubacquirer();
			final BankAccountCanonical bankAccountCanonicalSubAcquirer = subAcquirerCanonical.getBankAccount();
			final DocumentCanonical documentCanonicalSubAcquirer = subAcquirerCanonical.getDocument();
			final BankIspbTranslateCanonical bankIspbTranslateCanonicalSubAcquirer =
					paymentGeneratorCanonical.getBankIspbTranslateCanonicalSubAcquirer();

			final PointOfSaleCanonical pointOfSaleCanonical = paymentFileCanonical.getPointOfSale();
			final BankAccountCanonical bankAccountCanonicalPointOfSale = pointOfSaleCanonical.getBankAccount();
			final DocumentCanonical documentCanonicalPointOfSale = pointOfSaleCanonical.getDocument();

			final String ispbIfDevdr = documentCanonicalSubAcquirer.getCnpjBase();
			final String ispbIfCredr = bankIspbTranslateCanonicalSubAcquirer.getIspb();
			final String agCreddr = bankAccountCanonicalSubAcquirer.getAgency();
			final String ctCreddr = bankAccountCanonicalSubAcquirer.getChecking();

			final String numCtrlCreddrCentrlz = numCtrlCreddr;
			final String tpPessoaCentrlz = tpPessoaCentrlzConverter.converter(documentCanonicalPointOfSale).getValue();
			final String cnpjCpfCentrlz = documentCanonicalPointOfSale.getValue();
			final String codCentrlz = id;
			final String tpCt = tipoContaConverter.converter(bankAccountCanonicalPointOfSale).getValue();
			final String agCentrlz = bankAccountCanonicalPointOfSale.getAgency();
			final String ctCentrlz = bankAccountCanonicalPointOfSale.getChecking();

			final String numCtrlCreddrPontoVenda = numCtrlCreddr;
			final String ispbIfLiquidPontoVenda = documentCanonicalPointOfSale.getCnpjBase();
			final String codPontoVenda = id;
			final String nomePontoVenda = pointOfSaleCanonical.getName();
			final String tpPessoaPontoVenda =
					tpPessoaPontoVendaConverter.converter(documentCanonicalPointOfSale).getValue();
			final String cnpjCpfPontoVenda = documentCanonicalPointOfSale.getValue();
			final Integer codInstitdrArrajPgto = Integer.parseInt(brandCanonical.getValue());
			final String tpProdLiquid = tpProdLiquidConverter.converter(generatorFileNameRulesCanonical).getValue();
			final String indrFormaTransf = indrFormaTransfConverter.converter().getValue();
			final String codMoeda = codMoedaConverter.converter().getValue();
			final Date dtPgto = paymentFileCanonical.getDate();
			final BigDecimal vlrPgto = paymentFileCanonical.getAmount();

			final GrupoLiquidTransc grupoLiquidTransc = GrupoLiquidTranscBuilder.create()
					.setTipoArquivo(tipoArquivo)
					.setIspbIfDevdr(ispbIfDevdr)
					.setIspbIfCredr(ispbIfCredr)
					.setAgCreddr(agCreddr)
					.setCtCreddr(ctCreddr)
					.setNumCtrlCreddrCentrlz(numCtrlCreddrCentrlz)
					.setTpPessoaCentrlz(tpPessoaCentrlz)
					.setCnpjCpfCentrlz(cnpjCpfCentrlz)
					.setCodCentrlz(codCentrlz)
					.setTpCt(tpCt)
					.setAgCentrlz(agCentrlz)
					.setCtCentrlz(ctCentrlz)
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
					.build();

			grupoLiquidTranscs.add(grupoLiquidTransc);
		});

		return grupoLiquidTranscs;
	}

}
