
package br.com.fourward.cip.xml.rtm.back.ret.converter;

import java.util.Date;

import org.springframework.stereotype.Component;

import br.com.fourward.cip.xml.rtm.back.ret.BcArqRet;
import br.com.fourward.cip.xml.rtm.back.ret.builder.BcArqRetBuilder;

@Component
public class BcArqRetConverter {

	public BcArqRet converter() {

		final String tipoArquivo = null;
		final String numCtrlEmis = null;
		final String nsu = null;
		final Date dtHrArq = null;

		return BcArqRetBuilder.create()
				.setTipoArquivo(tipoArquivo)
				.setNumCtrlEmis(numCtrlEmis)
				.setNsu(nsu)
				.setDtHrArq(dtHrArq)
				.build();
	}

}
