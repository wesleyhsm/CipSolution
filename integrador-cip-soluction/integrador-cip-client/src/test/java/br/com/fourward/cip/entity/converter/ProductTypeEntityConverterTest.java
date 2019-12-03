package br.com.fourward.cip.entity.converter;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.fourward.cip.Application;
import br.com.fourward.cip.canonical.ProductTypeCanonical;
import br.com.fourward.cip.entity.ProductTypeEntity;
import br.com.fourward.cip.entity.converter.ProductTypeEntityConverter;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=Application.class)
public class ProductTypeEntityConverterTest {

	private ProductTypeEntity expectedAntecipation = ProductTypeEntity.Antecipation;
	private ProductTypeEntity expectedCredit = ProductTypeEntity.Credit;
	private ProductTypeEntity expectedDebit = ProductTypeEntity.Debit;
	
	@Autowired
	private ProductTypeEntityConverter productTypeEntityConverter;
	
	@Test(expected=IllegalArgumentException.class)
	public void testNull() {
		final ProductTypeCanonical productTypeCanonical = null;
		final ProductTypeEntity productTypeEntity = productTypeEntityConverter.convert(productTypeCanonical);
		Assert.assertEquals(expectedAntecipation, productTypeEntity);
	}
	
	@Test
	public void testAntecipation() {
		final ProductTypeCanonical productTypeCanonical = createProductTypeCanonicalAntecipation();
		final ProductTypeEntity productTypeEntity = productTypeEntityConverter.convert(productTypeCanonical);
		Assert.assertEquals(expectedAntecipation, productTypeEntity);
	}
	
	@Test
	public void testCredit() {
		final ProductTypeCanonical productTypeCanonical = createProductTypeCanonicalCredit();
		final ProductTypeEntity productTypeEntity = productTypeEntityConverter.convert(productTypeCanonical);
		Assert.assertEquals(expectedCredit, productTypeEntity);
	}
	
	@Test
	public void testDebit() {
		final ProductTypeCanonical productTypeCanonical = createProductTypeCanonicalDebit();
		final ProductTypeEntity productTypeEntity = productTypeEntityConverter.convert(productTypeCanonical);
		Assert.assertEquals(expectedDebit, productTypeEntity);
	}
	
	private ProductTypeCanonical createProductTypeCanonicalAntecipation() {
		return ProductTypeCanonical.Antecipation;
	}
	
	private ProductTypeCanonical createProductTypeCanonicalCredit() {
		return ProductTypeCanonical.Credit;
	}
	
	private ProductTypeCanonical createProductTypeCanonicalDebit() {
		return ProductTypeCanonical.Debit;
	}
}
