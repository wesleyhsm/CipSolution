package br.com.fourward.cip.canonical;

import java.util.Arrays;

public enum StatusTypeCanonical {	
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
	ESLC0114("ESLC0114"),
	CODOCORC00("00"),
	CODOCORC01("01"),
	CODOCORC02("02"),
	CODOCORC03("03"),
	CODOCORC04("04"),
	CODOCORC05("05"),
	CODOCORC06("06"),
	CODOCORC07("07"),
	CODOCORC08("08"),
	CODOCORC09("09"),
	CODOCORC10("10"),
	CODOCORC11("11"),
	CODOCORC12("12"),
	CODOCORC13("13"),
	CODOCORC14("14"),
	CODOCORC15("15"),
	CODOCORC16("16"),
	CODOCORC17("17"),
	CODOCORC18("18"),
	CODOCORC30("30"),
	CODOCORC31("31"),
	CODOCORC32("32"),
	CODOCORC99("99");
	
	private final String value;
	
	private StatusTypeCanonical(final String value){
		this.value = value;
	}
	
	public String getValue(){
		return value;
	}
	
	public static StatusTypeCanonical create(final String value){
		return Arrays.asList(StatusTypeCanonical.values()).parallelStream().filter(predicate->predicate.value.equals(value)).findFirst().orElseThrow(()->new RuntimeException("StatusType not found"));
	}
}
