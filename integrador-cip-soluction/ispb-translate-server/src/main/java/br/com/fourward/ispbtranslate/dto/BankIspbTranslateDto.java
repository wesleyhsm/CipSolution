package br.com.fourward.ispbtranslate.dto;

import java.io.Serializable;

public class BankIspbTranslateDto implements Serializable{
	
	private static final long serialVersionUID = -3692007332665214334L;
	
	private String bankCode;
	private String ispb;
	
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	
	public String getIspb() {
		return ispb;
	}
	public void setIspb(String ispb) {
		this.ispb = ispb;
	}
			
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bankCode == null) ? 0 : bankCode.hashCode());
		result = prime * result + ((ispb == null) ? 0 : ispb.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankIspbTranslateDto other = (BankIspbTranslateDto) obj;
		if (bankCode == null) {
			if (other.bankCode != null)
				return false;
		} else if (!bankCode.equals(other.bankCode))
			return false;
		if (ispb == null) {
			if (other.ispb != null)
				return false;
		} else if (!ispb.equals(other.ispb))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "IspbDto [bankCode=" + bankCode + ", ispb=" + ispb + "]";
	}	
}
