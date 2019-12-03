package br.com.fourward.cip.entity.converter;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.fourward.cip.Application;
import br.com.fourward.cip.canonical.OperationTypeCanonical;
import br.com.fourward.cip.entity.OperationTypeEntity;
import br.com.fourward.cip.entity.converter.OperationTypeEntityConverter;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=Application.class)
public class OperationTypeEntityConverterTest {

	
	private OperationTypeEntity expectedAdjustment = OperationTypeEntity.Adjustment;
	private OperationTypeEntity expectedCard = OperationTypeEntity.Card;
		
	@Autowired
	private OperationTypeEntityConverter operationTypeEntityConverter;
	
	@Test(expected=IllegalArgumentException.class)
	public void testNull() {
		final OperationTypeCanonical operationTypeCanonical = null;
		final OperationTypeEntity operationTypeEntity = operationTypeEntityConverter.convert(operationTypeCanonical);
		Assert.assertEquals(expectedAdjustment, operationTypeEntity);
	}
	
	@Test
	public void testAdjustment() {
		final OperationTypeCanonical operationTypeCanonical = createOperationTypeCanonicalAdjustment();
		final OperationTypeEntity operationTypeEntity = operationTypeEntityConverter.convert(operationTypeCanonical);
		Assert.assertEquals(expectedAdjustment, operationTypeEntity);
	}
	
	@Test
	public void testCard() {
		final OperationTypeCanonical operationTypeCanonical = createOperationTypeCanonicalCard();
		final OperationTypeEntity operationTypeEntity = operationTypeEntityConverter.convert(operationTypeCanonical);
		Assert.assertEquals(expectedCard, operationTypeEntity);
	}
	
	private OperationTypeCanonical createOperationTypeCanonicalAdjustment() {
		return OperationTypeCanonical.Adjustment;
	}
	
	private OperationTypeCanonical createOperationTypeCanonicalCard() {
		return OperationTypeCanonical.Card;
	}
}
