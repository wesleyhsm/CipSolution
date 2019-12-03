package br.com.fourward.cip.canonical;

import java.util.Arrays;

public enum BrandCanonical {
	Mastercard("003"),
	Visa("004"),
	DinersClub("005"),
	AmericanExpress("006"),
	HiperDebito("007"),
	Elo("008"),
	Alelo("009"),
	Cabal("010"),
	Agiplan("011"),
	Aura("012"),
	Banescard("013"),
	Calcard("014"),
	Credsystem("015"),
	Cup("016"),
	Redesplan("017"),
	Sicred("018"),
	Sorocred("019"),
	Verdecard("020"),
	Hipercard("021"),
	Avista("022"),
	Credz("023"),
	Discover("024"),
	Maestro("025"),
	VisaElectron("026"),
	EloDebito("027"),
	SicrediDebito("028"),
	HiperCredito("029"),
	CabalDebito("030"),
	JCB("031"),
	Ticket("032"),
	Sodexo("033"),
	VR("034"),
	Policard("035"),
	Valecard("036"),
	Goodcard("037"),
	Greencard("038"),
	Coopercard("039"),
	Verocheque("040"),
	Nutricash("041"),
	Banricard("042");

	private final String value;
	
	private BrandCanonical(final String value){
		this.value = value;
	}
	
	public String getValue(){
		return value;
	}
	
	public static BrandCanonical create(final String value){
		return Arrays.asList(BrandCanonical.values()).parallelStream().filter(predicate->predicate.value.equals(value)).findFirst().orElseThrow(()->new RuntimeException("Brand not found"));
	}
}
