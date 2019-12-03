package br.com.fourward.cip.entity.converter;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.fourward.cip.Application;
import br.com.fourward.cip.canonical.AcquirerCanonical;
import br.com.fourward.cip.entity.AcquirerEntity;
import br.com.fourward.cip.entity.converter.AcquirerEntityConverter;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=Application.class)
public class AcquirerEntityConverterTest {

	private AcquirerEntity expectedAdyen = AcquirerEntity.Adyen;
	private AcquirerEntity expectedElavon = AcquirerEntity.Elavon;
	private AcquirerEntity expectedFirstData = AcquirerEntity.FirstData;
	private AcquirerEntity expectedGetNet = AcquirerEntity.GetNet;
	private AcquirerEntity expectedGlobalPayments = AcquirerEntity.GlobalPayments;
	private AcquirerEntity expectedRede = AcquirerEntity.Rede;
	private AcquirerEntity expectedStone = AcquirerEntity.Stone;
	private AcquirerEntity expectedVero = AcquirerEntity.Vero;
	
	@Autowired
	private AcquirerEntityConverter acquirerEntityConverter;
	
	@Test(expected=IllegalArgumentException.class)
	public void testNull() {
		final AcquirerCanonical acquirerCanonical = null;
		final AcquirerEntity acquirerEntity = acquirerEntityConverter.convert(acquirerCanonical);
		Assert.assertEquals(expectedAdyen, acquirerEntity);
	}
	
	@Test
	public void testAdyen() {
		final AcquirerCanonical acquirerCanonical = createAcquirerCanonicalAdyen();
		final AcquirerEntity acquirerEntity = acquirerEntityConverter.convert(acquirerCanonical);
		Assert.assertEquals(expectedAdyen, acquirerEntity);
	}
	
	@Test
	public void testElavon() {
		final AcquirerCanonical acquirerCanonical = createAcquirerCanonicalElavon();
		final AcquirerEntity acquirerEntity = acquirerEntityConverter.convert(acquirerCanonical);
		Assert.assertEquals(expectedElavon, acquirerEntity);
	}
	
	@Test
	public void testFirstData() {
		final AcquirerCanonical acquirerCanonical = createAcquirerCanonicalFirstData();
		final AcquirerEntity acquirerEntity = acquirerEntityConverter.convert(acquirerCanonical);
		Assert.assertEquals(expectedFirstData, acquirerEntity);
	}
	
	@Test
	public void testGetNet() {
		final AcquirerCanonical acquirerCanonical = createAcquirerCanonicalGetNet();
		final AcquirerEntity acquirerEntity = acquirerEntityConverter.convert(acquirerCanonical);
		Assert.assertEquals(expectedGetNet, acquirerEntity);
	}
	
	@Test
	public void testGlobalPayments() {
		final AcquirerCanonical acquirerCanonical = createAcquirerCanonicalGlobalPayments();
		final AcquirerEntity acquirerEntity = acquirerEntityConverter.convert(acquirerCanonical);
		Assert.assertEquals(expectedGlobalPayments, acquirerEntity);
	}
	
	@Test
	public void testRede() {
		final AcquirerCanonical acquirerCanonical = createAcquirerCanonicalRede();
		final AcquirerEntity acquirerEntity = acquirerEntityConverter.convert(acquirerCanonical);
		Assert.assertEquals(expectedRede, acquirerEntity);
	}
	
	@Test
	public void testStone() {
		final AcquirerCanonical acquirerCanonical = createAcquirerCanonicalStone();
		final AcquirerEntity acquirerEntity = acquirerEntityConverter.convert(acquirerCanonical);
		Assert.assertEquals(expectedStone, acquirerEntity);
	}
	
	@Test
	public void testVero() {
		final AcquirerCanonical acquirerCanonical = createAcquirerCanonicalVero();
		final AcquirerEntity acquirerEntity = acquirerEntityConverter.convert(acquirerCanonical);
		Assert.assertEquals(expectedVero, acquirerEntity);
	}
	
	private AcquirerCanonical createAcquirerCanonicalAdyen() {
		return AcquirerCanonical.Adyen;
	}
	
	private AcquirerCanonical createAcquirerCanonicalElavon() {
		return AcquirerCanonical.Elavon;
	}
	
	private AcquirerCanonical createAcquirerCanonicalFirstData() {
		return AcquirerCanonical.FirstData;
	}
	
	private AcquirerCanonical createAcquirerCanonicalGetNet() {
		return AcquirerCanonical.GetNet;
	}
	
	private AcquirerCanonical createAcquirerCanonicalGlobalPayments() {
		return AcquirerCanonical.GlobalPayments;
	}
	
	private AcquirerCanonical createAcquirerCanonicalRede() {
		return AcquirerCanonical.Rede;
	}
	
	private AcquirerCanonical createAcquirerCanonicalStone() {
		return AcquirerCanonical.Stone;
	}
	
	private AcquirerCanonical createAcquirerCanonicalVero() {
		return AcquirerCanonical.Vero;
	}
}
