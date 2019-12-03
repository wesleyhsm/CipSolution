
package br.com.fourward.cip.xml.rtm.back.pro.builder;

import br.com.fourward.cip.xml.rtm.back.pro.AslcDocPro;
import br.com.fourward.cip.xml.rtm.back.pro.BcArqPro;

public class AslcDocProBuilder {

	public static AslcDocProBuilder create() {
		return new AslcDocProBuilder();
	}

	private AslcDocProBuilder() {

	}

	private BcArqPro bcArq;

	public AslcDocProBuilder setBcArq(final BcArqPro bcArq) {
		this.bcArq = bcArq;
		return this;
	}

	public AslcDocPro build() {
		return new AslcDocPro(bcArq);
	}
}
