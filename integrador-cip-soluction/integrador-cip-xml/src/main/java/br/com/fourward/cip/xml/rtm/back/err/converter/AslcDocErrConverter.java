
package br.com.fourward.cip.xml.rtm.back.err.converter;

import org.springframework.stereotype.Component;

import br.com.fourward.cip.xml.rtm.back.err.AslcDocErr;
import br.com.fourward.cip.xml.rtm.back.err.NomArqErr;
import br.com.fourward.cip.xml.rtm.back.err.builder.AslcDocErrBuilder;

@Component
public class AslcDocErrConverter {

	public AslcDocErr createAslcDocErr() {

		final NomArqErr nomArq = null;

		return AslcDocErrBuilder.create().setNomArq(nomArq).build();
	}
}
