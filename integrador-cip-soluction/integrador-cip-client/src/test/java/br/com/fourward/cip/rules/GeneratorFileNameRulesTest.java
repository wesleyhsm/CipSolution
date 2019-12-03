
package br.com.fourward.cip.rules;

import org.junit.Test;

public class GeneratorFileNameRulesTest {

	private GeneratorFileNameRules getGeneratorFileNameRules() {
		return new GeneratorFileNameRules("20180822", "1", "21");
	}

	@Test
	public void test() {
		System.out.println("File Name: " + getGeneratorFileNameRules().getFileName());
	}
}
