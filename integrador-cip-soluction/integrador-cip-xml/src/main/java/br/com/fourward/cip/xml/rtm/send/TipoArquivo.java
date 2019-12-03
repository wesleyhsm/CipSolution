
package br.com.fourward.cip.xml.rtm.send;

import java.util.Arrays;

public enum TipoArquivo {
	Credit("1"),
	CreditReturn("2"),
	Debit("3"),
	DebitReturn("4"),
	Antecipation("5"),
	AntecipationReturn("6"),
	CreditRet("7"),
	DebitRet("8"),
	AntecipationRet("9"),
	CreditPro("13"),
	DebitPro("14"),
	AntecipationPro("15"),
	CreditErroRtm("16"),
	DebitErroRtm("17"),
	AntecipationErroRtm("18");

	private final String value;

	private TipoArquivo(final String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public static TipoArquivo create(final String value) {
		return Arrays.asList(TipoArquivo.values())
				.parallelStream()
				.filter(predicate -> predicate.value.equals(value))
				.findFirst()
				.orElseThrow(() -> new RuntimeException("TipoArquivo not found"));
	}
}
