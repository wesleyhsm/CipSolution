package br.com.fourward.cip.entity;

import java.util.Arrays;

public enum StatusTypeEntity {
	Received("Received"),
	Processing("Processing"),
	Approved("Approved"),
	EGEN0043("EGEN0043"),
	EGEN0085("EGEN0085"),
	ESLC0006("ESLC0006"),
	ESLC0007("ESLC0007"),
	ESLC0029("ESLC0029"),
	ESLC0088("ESLC0088"),
	ESLC0089("ESLC0089"),
	ESLC0090("ESLC0090"),
	ESLC0091("ESLC0091"),
	ESLC0102("ESLC0102"),
	ESLC0103("ESLC0103"),
	ESLC0104("ESLC0104"),
	ESLC0105("ESLC0105"),
	ESLC0106("ESLC0106"),
	ESLC0107("ESLC0107"),
	ESLC0108("ESLC0108"),
	ESLC0112("ESLC0112"),
	ESLC0117("ESLC0117"),
	ESLC0118("ESLC0118"),
	ESLC0119("ESLC0119"),
	ESLC0121("ESLC0121"),
	ESLC0122("ESLC0122"),
	ESLC0123("ESLC0123"),
	ESLC0124("ESLC0124"),
	ESLC0125("ESLC0125"),
	ESLC0126("ESLC0126"),
	ESLC0127("ESLC0127"),
	ESLC0131("ESLC0131"),
	ESLC0132("ESLC0132"),
	ESLC0133("ESLC0133"),
	ESLC0138("ESLC0138"),
	ESLC0139("ESLC0139"),
	ESLC0140("ESLC0140"),
	ESLC0141("ESLC0141"),
	ESLC0142("ESLC0142"),
	ESLC0143("ESLC0143"),
	ESLC0144("ESLC0144"),
	ESLC0145("ESLC0145"),
	ESLC0042("ESLC0042"),
	ESLC0110("ESLC0110"),
	ESLC0111("ESLC0111"),
	ESLC0114("ESLC0114");	
	
	private final String value;
	
	private StatusTypeEntity(final String value){
		this.value = value;
	}
	
	public String getValue(){
		return value;
	}
	
	public static StatusTypeEntity create(final String value){
		return Arrays.asList(StatusTypeEntity.values()).parallelStream().filter(predicate->predicate.value.equals(value)).findFirst().orElseThrow(()->new RuntimeException("StatusType not found"));
	}
}
