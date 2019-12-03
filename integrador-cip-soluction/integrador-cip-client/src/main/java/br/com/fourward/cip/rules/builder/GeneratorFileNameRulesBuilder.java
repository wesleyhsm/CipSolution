
package br.com.fourward.cip.rules.builder;

import br.com.fourward.cip.rules.GeneratorFileNameRules;

public class GeneratorFileNameRulesBuilder {

	private String systemDate;
	private String fileType;
	private String sequenceNumber;

	public static GeneratorFileNameRulesBuilder create() {
		return new GeneratorFileNameRulesBuilder();
	}

	public GeneratorFileNameRulesBuilder setSystemDate(final String systemDate) {
		this.systemDate = systemDate;
		return this;
	}

	public GeneratorFileNameRulesBuilder setFileType(final String fileType) {
		this.fileType = fileType;
		return this;
	}

	public GeneratorFileNameRulesBuilder setSequenceNumber(final String sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
		return this;
	}

	public GeneratorFileNameRules build() {
		return new GeneratorFileNameRules(systemDate, fileType, sequenceNumber);
	}
}
