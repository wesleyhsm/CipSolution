package br.com.fourward.cip.entity.converter;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.fourward.cip.Application;
import br.com.fourward.cip.canonical.DocumentTypeCanonical;
import br.com.fourward.cip.entity.DocumentTypeEntity;
import br.com.fourward.cip.entity.converter.DocumentTypeEntityConverter;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=Application.class)
public class DocumentTypeEntityConverterTest {

	private DocumentTypeEntity expectedCNPJ = DocumentTypeEntity.CNPJ;
	private DocumentTypeEntity expectedCPF = DocumentTypeEntity.CPF;
	
	@Autowired
	private DocumentTypeEntityConverter documentTypeEntityConverter;
	
	@Test(expected=IllegalArgumentException.class)
	public void testNull() {
		final DocumentTypeCanonical documentTypeCanonical = null;
		final DocumentTypeEntity documentTypeEntity = documentTypeEntityConverter.convert(documentTypeCanonical);
		Assert.assertEquals(expectedCNPJ, documentTypeEntity);
	}
	
	@Test
	public void testCNPJ() {
		final DocumentTypeCanonical documentTypeCanonical = createDocumentTypeCanonicalCNPJ();
		final DocumentTypeEntity documentTypeEntity = documentTypeEntityConverter.convert(documentTypeCanonical);
		Assert.assertEquals(expectedCNPJ, documentTypeEntity);
	}
	
	@Test
	public void testCPF() {
		final DocumentTypeCanonical documentTypeCanonical = createDocumentTypeCanonicalCPF();
		final DocumentTypeEntity documentTypeEntity = documentTypeEntityConverter.convert(documentTypeCanonical);
		Assert.assertEquals(expectedCPF, documentTypeEntity);
	}
	
	private DocumentTypeCanonical createDocumentTypeCanonicalCNPJ() {
		return DocumentTypeCanonical.CNPJ;
	}
	
	private DocumentTypeCanonical createDocumentTypeCanonicalCPF() {
		return DocumentTypeCanonical.CPF;
	}
	
}
