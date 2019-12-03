
package br.com.fourward.cip.xml.rtm.send.builder;

import br.com.fourward.cip.xml.rtm.send.BcArq;

public class BcArqBuilder {

	public static BcArqBuilder create() {
		return new BcArqBuilder();
	}

	private BcArqBuilder() {

	}

	private String numCtrlEmis;

	public BcArqBuilder setNumCtrlEmis(final String numCtrlEmis) {
		this.numCtrlEmis = numCtrlEmis;
		return this;
	}

	public BcArq build() {
		return new BcArq(numCtrlEmis);
	}
}
