
package br.com.fourward.cip.xml.rtm.back.pro.converter;

import java.util.Date;

import org.springframework.stereotype.Component;

import br.com.fourward.cip.xml.rtm.back.pro.BcArqPro;
import br.com.fourward.cip.xml.rtm.back.pro.builder.BcArqProBuilder;

@Component
public class BcArqProConverter {

	public BcArqPro converter() {

		final String tipoArquivo = null;
		final String numCtrlEmis = null;
		final String nsu = null;
		final Date dtHrArq = null;

		return BcArqProBuilder.create()
				.setTipoArquivo(tipoArquivo)
				.setNumCtrlEmis(numCtrlEmis)
				.setNsu(nsu)
				.setDtHrArq(dtHrArq)
				.build();
	}
}
