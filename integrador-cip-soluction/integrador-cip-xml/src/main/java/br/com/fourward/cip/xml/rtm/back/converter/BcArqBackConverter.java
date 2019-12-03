
package br.com.fourward.cip.xml.rtm.back.converter;

import java.util.Date;

import org.springframework.stereotype.Component;

import br.com.fourward.cip.xml.rtm.back.BcArqBack;
import br.com.fourward.cip.xml.rtm.back.builder.BcArqBackBuilder;

@Component
public class BcArqBackConverter {

	public BcArqBack converter() {

		final String tipoArquivo = null;
		final String numCtrlEmis = null;
		final String nsu = null;
		final Date dtHrArq = null;

		return BcArqBackBuilder.create()
				.setTipoArquivo(tipoArquivo)
				.setNumCtrlEmis(numCtrlEmis)
				.setNsu(nsu)
				.setDtHrArq(dtHrArq)
				.build();
	}
}
