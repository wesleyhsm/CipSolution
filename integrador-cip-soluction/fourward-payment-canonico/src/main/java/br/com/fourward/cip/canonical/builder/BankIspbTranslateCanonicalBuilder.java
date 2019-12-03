package br.com.fourward.cip.canonical.builder;

import br.com.fourward.cip.canonical.BankIspbTranslateCanonical;

public class BankIspbTranslateCanonicalBuilder {

	private String bankCode;
	private String ispb;
	
	public static BankIspbTranslateCanonicalBuilder create(){
		return new BankIspbTranslateCanonicalBuilder();
	}

	private BankIspbTranslateCanonicalBuilder(){

	}

	public BankIspbTranslateCanonicalBuilder setBankCode(final String bankCode){
		this.bankCode = bankCode;
		return this;
	}

	public BankIspbTranslateCanonicalBuilder setIspb(final String ispb){
		this.ispb = ispb;
		return this;
	}

	public BankIspbTranslateCanonical build(){
		return new BankIspbTranslateCanonical(bankCode, ispb);
	}
}