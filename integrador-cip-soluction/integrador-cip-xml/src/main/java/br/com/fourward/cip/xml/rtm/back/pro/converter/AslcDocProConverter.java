
package br.com.fourward.cip.xml.rtm.back.pro.converter;

import org.springframework.stereotype.Component;

import br.com.fourward.cip.xml.rtm.back.pro.AslcDocPro;
import br.com.fourward.cip.xml.rtm.back.pro.BcArqPro;
import br.com.fourward.cip.xml.rtm.back.pro.builder.AslcDocProBuilder;

@Component
public class AslcDocProConverter {

	public AslcDocPro createAslcDocPro() {

		final BcArqPro bcArq = null;

		return AslcDocProBuilder.create().setBcArq(bcArq).build();
	}
}
