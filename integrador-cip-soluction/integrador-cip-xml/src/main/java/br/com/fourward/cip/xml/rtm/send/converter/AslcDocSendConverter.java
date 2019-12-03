
package br.com.fourward.cip.xml.rtm.send.converter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.fourward.cip.canonical.PaymentFileGeneratorCanonical;
import br.com.fourward.cip.xml.rtm.send.AslcDocSend;
import br.com.fourward.cip.xml.rtm.send.BcArq;
import br.com.fourward.cip.xml.rtm.send.GrupoLiquidTransc;
import br.com.fourward.cip.xml.rtm.send.builder.AslcDocSendBuilder;

@Component
public class AslcDocSendConverter {

	@Autowired
	private BcArqConverter bcArqConverter;

	@Autowired
	private GrupoLiquidTranscConverter grupoLiquidTranscConverter;

	public AslcDocSend converter(final PaymentFileGeneratorCanonical paymentFileGeneratorCanonical) {

		final BcArq bcArq = bcArqConverter.converter(paymentFileGeneratorCanonical);
		final List<GrupoLiquidTransc> grupoLiquidTranscs =
				grupoLiquidTranscConverter.converter(paymentFileGeneratorCanonical);

		return AslcDocSendBuilder.create().setBcArq(bcArq).setGrupoLiquidTranscs(grupoLiquidTranscs).build();
	}
}
