package br.com.fourward.cip.entity.converter;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import br.com.fourward.cip.canonical.DocumentTypeCanonical;
import br.com.fourward.cip.entity.DocumentTypeEntity;
import br.com.fourward.cip.entity.builder.DocumentTypeBuilder;

@Component
public class DocumentTypeEntityConverter {

	public DocumentTypeEntity convert(final DocumentTypeCanonical documentTypeCanonical) {
		
		Assert.notNull(documentTypeCanonical, "documentTypeCanonical is null.");
		Assert.notNull(documentTypeCanonical.getValue(), "documentTypeCanonical.Value is null");
		return DocumentTypeBuilder 
				.create() 
				.setValue(documentTypeCanonical.getValue()) 
				.build();
	}
}
