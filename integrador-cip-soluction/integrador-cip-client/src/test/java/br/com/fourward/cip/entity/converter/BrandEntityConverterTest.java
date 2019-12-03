package br.com.fourward.cip.entity.converter;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.fourward.cip.Application;
import br.com.fourward.cip.canonical.BrandCanonical;
import br.com.fourward.cip.entity.BrandEntity;
import br.com.fourward.cip.entity.converter.BrandEntityConverter;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=Application.class)
public class BrandEntityConverterTest {
	
	private BrandEntity expectedAgiplan = BrandEntity.Agiplan;
	private BrandEntity expectedAlelo = BrandEntity.Alelo;
	private BrandEntity expectedAmericanExpress = BrandEntity.AmericanExpress;
	private BrandEntity expectedAura = BrandEntity.Aura;
	private BrandEntity expectedAvista = BrandEntity.Avista;
	private BrandEntity expectedBanescard = BrandEntity.Banescard;
	private BrandEntity expectedBanricard = BrandEntity.Banricard;
	private BrandEntity expectedCabal = BrandEntity.Cabal;
	private BrandEntity expectedCabalDebito = BrandEntity.CabalDebito;
	private BrandEntity expectedCalcard = BrandEntity.Calcard;
	private BrandEntity expectedCoopercard = BrandEntity.Coopercard;
	private BrandEntity expectedCredsystem = BrandEntity.Credsystem;
	private BrandEntity expectedCredz = BrandEntity.Credz;
	private BrandEntity expectedCup = BrandEntity.Cup;
	private BrandEntity expectedDinersClub = BrandEntity.DinersClub;
	private BrandEntity expectedDiscover = BrandEntity.Discover;
	private BrandEntity expectedElo = BrandEntity.Elo;
	private BrandEntity expectedEloDebito = BrandEntity.EloDebito;
	private BrandEntity expectedGoodcard = BrandEntity.Goodcard;
	private BrandEntity expectedGreencard = BrandEntity.Greencard;
	private BrandEntity expectedHipercard = BrandEntity.Hipercard;
	private BrandEntity expectedHiperCredito = BrandEntity.HiperCredito;
	private BrandEntity expectedHiperDebito = BrandEntity.HiperDebito;
	private BrandEntity expectedJCB = BrandEntity.JCB;
	private BrandEntity expectedMaestro = BrandEntity.Maestro;
	private BrandEntity expectedMastercard = BrandEntity.Mastercard;
	private BrandEntity expectedNutricash = BrandEntity.Nutricash;
	private BrandEntity expectedPolicard = BrandEntity.Policard;
	private BrandEntity expectedRedesplan = BrandEntity.Redesplan;
	private BrandEntity expectedSicred = BrandEntity.Sicred;
	private BrandEntity expectedSicrediDebito = BrandEntity.SicrediDebito;
	private BrandEntity expectedSodexo = BrandEntity.Sodexo;
	private BrandEntity expectedSorocred = BrandEntity.Sorocred;
	private BrandEntity expectedTicket = BrandEntity.Ticket;
	private BrandEntity expectedValecard = BrandEntity.Valecard;
	private BrandEntity expectedVerdecard = BrandEntity.Verdecard;
	private BrandEntity expectedVerocheque = BrandEntity.Verocheque;
	private BrandEntity expectedVisa = BrandEntity.Visa;
	private BrandEntity expectedVisaElectron = BrandEntity.VisaElectron;
	private BrandEntity expectedVR = BrandEntity.VR;
	
	@Autowired
	private BrandEntityConverter brandEntityConverter;
	
	@Test(expected=IllegalArgumentException.class)
	public void testNull() {
		final BrandCanonical brandCanonical = null;
		final BrandEntity brandEntity = brandEntityConverter.convert(brandCanonical);
		Assert.assertEquals(expectedAgiplan, brandEntity);
	}
	
	@Test
	public void testAgiplan() {
		final BrandCanonical brandCanonical = createBrandCanonicalAgiplan();
		final BrandEntity brandEntity = brandEntityConverter.convert(brandCanonical);
		Assert.assertEquals(expectedAgiplan, brandEntity);
	}

	@Test
	public void testAlelo() {
		final BrandCanonical brandCanonical = createBrandCanonicalAlelo();
		final BrandEntity brandEntity = brandEntityConverter.convert(brandCanonical);
		Assert.assertEquals(expectedAlelo, brandEntity);
	}
	
	@Test
	public void testAmericanExpress() {
		final BrandCanonical brandCanonical = createBrandCanonicalAmericanExpress();
		final BrandEntity brandEntity = brandEntityConverter.convert(brandCanonical);
		Assert.assertEquals(expectedAmericanExpress, brandEntity);
	}
	
	@Test
	public void testAura() {
		final BrandCanonical brandCanonical = createBrandCanonicalAura();
		final BrandEntity brandEntity = brandEntityConverter.convert(brandCanonical);
		Assert.assertEquals(expectedAura, brandEntity);
	}
	
	@Test
	public void testAvista() {
		final BrandCanonical brandCanonical = createBrandCanonicalAvista();
		final BrandEntity brandEntity = brandEntityConverter.convert(brandCanonical);
		Assert.assertEquals(expectedAvista, brandEntity);
	}
	
	@Test
	public void testBanescard() {
		final BrandCanonical brandCanonical = createBrandCanonicalBanescard();
		final BrandEntity brandEntity = brandEntityConverter.convert(brandCanonical);
		Assert.assertEquals(expectedBanescard, brandEntity);
	}
	
	@Test
	public void testBanricard() {
		final BrandCanonical brandCanonical = createBrandCanonicalBanricard();
		final BrandEntity brandEntity = brandEntityConverter.convert(brandCanonical);
		Assert.assertEquals(expectedBanricard, brandEntity);
	}
	
	@Test
	public void testCabal() {
		final BrandCanonical brandCanonical = createBrandCanonicalCabal();
		final BrandEntity brandEntity = brandEntityConverter.convert(brandCanonical);
		Assert.assertEquals(expectedCabal, brandEntity);
	}
	
	@Test
	public void testCabalDebito() {
		final BrandCanonical brandCanonical = createBrandCanonicalCabalDebito();
		final BrandEntity brandEntity = brandEntityConverter.convert(brandCanonical);
		Assert.assertEquals(expectedCabalDebito, brandEntity);
	}
			
	@Test
	public void testCalcard() {
		final BrandCanonical brandCanonical = createBrandCanonicalCalcard();
		final BrandEntity brandEntity = brandEntityConverter.convert(brandCanonical);
		Assert.assertEquals(expectedCalcard, brandEntity);
	}
	
	@Test
	public void testCoopercard() {
		final BrandCanonical brandCanonical = createBrandCanonicalCoopercard();
		final BrandEntity brandEntity = brandEntityConverter.convert(brandCanonical);
		Assert.assertEquals(expectedCoopercard, brandEntity);
	}
	
	@Test
	public void testCredsystem() {
		final BrandCanonical brandCanonical = createBrandCanonicalCredsystem();
		final BrandEntity brandEntity = brandEntityConverter.convert(brandCanonical);
		Assert.assertEquals(expectedCredsystem, brandEntity);
	}
	
	@Test
	public void testCredz() {
		final BrandCanonical brandCanonical = createBrandCanonicalCredz();
		final BrandEntity brandEntity = brandEntityConverter.convert(brandCanonical);
		Assert.assertEquals(expectedCredz, brandEntity);
	}
	
	@Test
	public void testCup() {
		final BrandCanonical brandCanonical = createBrandCanonicalCup();
		final BrandEntity brandEntity = brandEntityConverter.convert(brandCanonical);
		Assert.assertEquals(expectedCup, brandEntity);
	}	
	
	@Test
	public void testDinersClub() {
		final BrandCanonical brandCanonical = createBrandCanonicalDinersClub();
		final BrandEntity brandEntity = brandEntityConverter.convert(brandCanonical);
		Assert.assertEquals(expectedDinersClub, brandEntity);
	}
	
	@Test
	public void testDiscover() {
		final BrandCanonical brandCanonical = createBrandCanonicalDiscover();
		final BrandEntity brandEntity = brandEntityConverter.convert(brandCanonical);
		Assert.assertEquals(expectedDiscover, brandEntity);
	}
	
	@Test
	public void testElo() {
		final BrandCanonical brandCanonical = createBrandCanonicalElo();
		final BrandEntity brandEntity = brandEntityConverter.convert(brandCanonical);
		Assert.assertEquals(expectedElo, brandEntity);
	}
	
	@Test
	public void testEloDebito() {
		final BrandCanonical brandCanonical = createBrandCanonicalEloDebito();
		final BrandEntity brandEntity = brandEntityConverter.convert(brandCanonical);
		Assert.assertEquals(expectedEloDebito, brandEntity);
	}
	
	@Test
	public void testGoodcard() {
		final BrandCanonical brandCanonical = createBrandCanonicalGoodcard();
		final BrandEntity brandEntity = brandEntityConverter.convert(brandCanonical);
		Assert.assertEquals(expectedGoodcard, brandEntity);
	}
	
	@Test
	public void testGreencard() {
		final BrandCanonical brandCanonical = createBrandCanonicalGreencard();
		final BrandEntity brandEntity = brandEntityConverter.convert(brandCanonical);
		Assert.assertEquals(expectedGreencard, brandEntity);
	}	
	
	@Test
	public void testHipercard() {
		final BrandCanonical brandCanonical = createBrandCanonicalHipercard();
		final BrandEntity brandEntity = brandEntityConverter.convert(brandCanonical);
		Assert.assertEquals(expectedHipercard, brandEntity);
	}	
	
	@Test
	public void testHiperCredito() {
		final BrandCanonical brandCanonical = createBrandCanonicalHiperCredito();
		final BrandEntity brandEntity = brandEntityConverter.convert(brandCanonical);
		Assert.assertEquals(expectedHiperCredito, brandEntity);
	}
	
	@Test
	public void testHiperDebito() {
		final BrandCanonical brandCanonical = createBrandCanonicalHiperDebito();
		final BrandEntity brandEntity = brandEntityConverter.convert(brandCanonical);
		Assert.assertEquals(expectedHiperDebito, brandEntity);
	}
	
	@Test
	public void testJCB() {
		final BrandCanonical brandCanonical = createBrandCanonicalJCB();
		final BrandEntity brandEntity = brandEntityConverter.convert(brandCanonical);
		Assert.assertEquals(expectedJCB, brandEntity);
	}
	
	@Test
	public void testMaestro() {
		final BrandCanonical brandCanonical = createBrandCanonicalMaestro();
		final BrandEntity brandEntity = brandEntityConverter.convert(brandCanonical);
		Assert.assertEquals(expectedMaestro, brandEntity);
	}
	
	@Test
	public void testMastercard() {
		final BrandCanonical brandCanonical = createBrandCanonicalMastercard();
		final BrandEntity brandEntity = brandEntityConverter.convert(brandCanonical);
		Assert.assertEquals(expectedMastercard, brandEntity);
	}
	
	@Test
	public void testNutricash() {
		final BrandCanonical brandCanonical = createBrandCanonicalNutricash();
		final BrandEntity brandEntity = brandEntityConverter.convert(brandCanonical);
		Assert.assertEquals(expectedNutricash, brandEntity);
	}
	
	@Test
	public void testPolicard() {
		final BrandCanonical brandCanonical = createBrandCanonicalPolicard();
		final BrandEntity brandEntity = brandEntityConverter.convert(brandCanonical);
		Assert.assertEquals(expectedPolicard, brandEntity);
	}
	
	@Test
	public void testRedesplan() {
		final BrandCanonical brandCanonical = createBrandCanonicalRedesplan();
		final BrandEntity brandEntity = brandEntityConverter.convert(brandCanonical);
		Assert.assertEquals(expectedRedesplan, brandEntity);
	}
	
	@Test
	public void testSicred() {
		final BrandCanonical brandCanonical = createBrandCanonicalSicred();
		final BrandEntity brandEntity = brandEntityConverter.convert(brandCanonical);
		Assert.assertEquals(expectedSicred, brandEntity);
	}
	
	@Test
	public void testSicrediDebito() {
		final BrandCanonical brandCanonical = createBrandCanonicalSicrediDebito();
		final BrandEntity brandEntity = brandEntityConverter.convert(brandCanonical);
		Assert.assertEquals(expectedSicrediDebito, brandEntity);
	}
	
	@Test
	public void testSodexo() {
		final BrandCanonical brandCanonical = createBrandCanonicalSodexo();
		final BrandEntity brandEntity = brandEntityConverter.convert(brandCanonical);
		Assert.assertEquals(expectedSodexo, brandEntity);
	}
	
	@Test
	public void testSorocred() {
		final BrandCanonical brandCanonical = createBrandCanonicalSorocred();
		final BrandEntity brandEntity = brandEntityConverter.convert(brandCanonical);
		Assert.assertEquals(expectedSorocred, brandEntity);
	}
	
	@Test
	public void testTicket() {
		final BrandCanonical brandCanonical = createBrandCanonicalTicket();
		final BrandEntity brandEntity = brandEntityConverter.convert(brandCanonical);
		Assert.assertEquals(expectedTicket, brandEntity);
	}
	
	@Test
	public void testValecard() {
		final BrandCanonical brandCanonical = createBrandCanonicalValecard();
		final BrandEntity brandEntity = brandEntityConverter.convert(brandCanonical);
		Assert.assertEquals(expectedValecard, brandEntity);
	}
	
	@Test
	public void testVerdecard() {
		final BrandCanonical brandCanonical = createBrandCanonicalVerdecard();
		final BrandEntity brandEntity = brandEntityConverter.convert(brandCanonical);
		Assert.assertEquals(expectedVerdecard, brandEntity);
	}
		
	@Test
	public void testVerocheque() {
		final BrandCanonical brandCanonical = createBrandCanonicalVerocheque();
		final BrandEntity brandEntity = brandEntityConverter.convert(brandCanonical);
		Assert.assertEquals(expectedVerocheque, brandEntity);
	}
	
	@Test
	public void testVisa() {
		final BrandCanonical brandCanonical = createBrandCanonicalVisa();
		final BrandEntity brandEntity = brandEntityConverter.convert(brandCanonical);
		Assert.assertEquals(expectedVisa, brandEntity);
	}
	
	@Test
	public void testVisaElectron() {
		final BrandCanonical brandCanonical = createBrandCanonicalVisaElectron();
		final BrandEntity brandEntity = brandEntityConverter.convert(brandCanonical);
		Assert.assertEquals(expectedVisaElectron, brandEntity);
	}
	
	@Test
	public void testVR() {
		final BrandCanonical brandCanonical = createBrandCanonicalVR();
		final BrandEntity brandEntity = brandEntityConverter.convert(brandCanonical);
		Assert.assertEquals(expectedVR, brandEntity);
	}
	
	private BrandCanonical createBrandCanonicalAgiplan() {
		return BrandCanonical.Agiplan;
	}
	
	private BrandCanonical createBrandCanonicalAlelo() {
		return BrandCanonical.Alelo;
	}
	
	private BrandCanonical createBrandCanonicalAmericanExpress() {
		return BrandCanonical.AmericanExpress;
	}
	
	private BrandCanonical createBrandCanonicalAura() {
		return BrandCanonical.Aura;
	}
	
	private BrandCanonical createBrandCanonicalAvista() {
		return BrandCanonical.Avista;
	}
	
	private BrandCanonical createBrandCanonicalBanescard() {
		return BrandCanonical.Banescard;
	}
	
	private BrandCanonical createBrandCanonicalBanricard() {
		return BrandCanonical.Banricard;
	}
	
	private BrandCanonical createBrandCanonicalCabal() {
		return BrandCanonical.Cabal;
	}
	
	private BrandCanonical createBrandCanonicalCabalDebito() {
		return BrandCanonical.CabalDebito;
	}
	
	private BrandCanonical createBrandCanonicalCalcard() {
		return BrandCanonical.Calcard;
	}
	
	private BrandCanonical createBrandCanonicalCoopercard() {
		return BrandCanonical.Coopercard;
	}
	
	private BrandCanonical createBrandCanonicalCredsystem() {
		return BrandCanonical.Credsystem;
	}
		
	private BrandCanonical createBrandCanonicalCredz() {
		return BrandCanonical.Credz;
	}
	
	private BrandCanonical createBrandCanonicalCup() {
		return BrandCanonical.Cup;
	}
	
	private BrandCanonical createBrandCanonicalDinersClub() {
		return BrandCanonical.DinersClub;
	}
	
	private BrandCanonical createBrandCanonicalDiscover() {
		return BrandCanonical.Discover;
	}
	
	private BrandCanonical createBrandCanonicalElo() {
		return BrandCanonical.Elo;
	}
	
	private BrandCanonical createBrandCanonicalEloDebito() {
		return BrandCanonical.EloDebito;
	}
	
	private BrandCanonical createBrandCanonicalGoodcard() {
		return BrandCanonical.Goodcard;
	}
	
	private BrandCanonical createBrandCanonicalGreencard() {
		return BrandCanonical.Greencard;
	}
	
	private BrandCanonical createBrandCanonicalHipercard() {
		return BrandCanonical.Hipercard;
	}
	
	private BrandCanonical createBrandCanonicalHiperCredito() {
		return BrandCanonical.HiperCredito;
	}
	
	private BrandCanonical createBrandCanonicalHiperDebito() {
		return BrandCanonical.HiperDebito;
	}
	
	private BrandCanonical createBrandCanonicalJCB() {
		return BrandCanonical.JCB;
	}
	
	private BrandCanonical createBrandCanonicalMaestro() {
		return BrandCanonical.Maestro;
	}
	
	private BrandCanonical createBrandCanonicalMastercard() {
		return BrandCanonical.Mastercard;
	}
	
	private BrandCanonical createBrandCanonicalNutricash() {
		return BrandCanonical.Nutricash;
	}
	
	private BrandCanonical createBrandCanonicalPolicard() {
		return BrandCanonical.Policard;
	}
	
	private BrandCanonical createBrandCanonicalRedesplan() {
		return BrandCanonical.Redesplan;
	}
	
	private BrandCanonical createBrandCanonicalSicred() {
		return BrandCanonical.Sicred;
	}
	
	private BrandCanonical createBrandCanonicalSicrediDebito() {
		return BrandCanonical.SicrediDebito;
	}
	
	private BrandCanonical createBrandCanonicalSodexo() {
		return BrandCanonical.Sodexo;
	}
	
	private BrandCanonical createBrandCanonicalSorocred() {
		return BrandCanonical.Sorocred;
	}
	
	private BrandCanonical createBrandCanonicalTicket() {
		return BrandCanonical.Ticket;
	}
	
	private BrandCanonical createBrandCanonicalValecard() {
		return BrandCanonical.Valecard;
	}
	
	private BrandCanonical createBrandCanonicalVerdecard() {
		return BrandCanonical.Verdecard;
	}
	
	private BrandCanonical createBrandCanonicalVerocheque() {
		return BrandCanonical.Verocheque;
	}
	
	private BrandCanonical createBrandCanonicalVisa() {
		return BrandCanonical.Visa;
	}
	
	private BrandCanonical createBrandCanonicalVisaElectron() {
		return BrandCanonical.VisaElectron;
	}
	
	private BrandCanonical createBrandCanonicalVR() {
		return BrandCanonical.VR;
	}
}
