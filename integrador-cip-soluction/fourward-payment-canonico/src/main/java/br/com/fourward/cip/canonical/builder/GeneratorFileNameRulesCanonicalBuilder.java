
package br.com.fourward.cip.canonical.builder;

import br.com.fourward.cip.canonical.GeneratorFileNameRulesCanonical;

public class GeneratorFileNameRulesCanonicalBuilder {

	private String systemDate;
	private String fileType;
	private String sequenceNumber;

	public static GeneratorFileNameRulesCanonicalBuilder create() {
		return new GeneratorFileNameRulesCanonicalBuilder();
	}

	private GeneratorFileNameRulesCanonicalBuilder() {

	}

	public GeneratorFileNameRulesCanonicalBuilder setSystemDate(final String systemDate) {
		this.systemDate = systemDate;
		return this;
	}

	public GeneratorFileNameRulesCanonicalBuilder setFileType(final String fileType) {
		this.fileType = fileType;
		return this;
	}

	public GeneratorFileNameRulesCanonicalBuilder setSequenceNumber(final String sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
		return this;
	}

	public GeneratorFileNameRulesCanonical build() {
		return new GeneratorFileNameRulesCanonical(systemDate, fileType, sequenceNumber);
	}
}
