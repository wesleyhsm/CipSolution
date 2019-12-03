package br.com.fourward.cip.entity.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import br.com.fourward.cip.canonical.DocumentCanonical;
import br.com.fourward.cip.entity.DocumentEntity;
import br.com.fourward.cip.entity.builder.DocumentBuilder;

@Component
public class DocumentEntityConverter {

	@Autowired
	private DocumentTypeEntityConverter documentTypeEntityConverter;
	
	public DocumentEntity convert(final DocumentCanonical documentCanonical) {
		
		Assert.notNull(documentCanonical, "documentCanonical is null");
		Assert.notNull(documentCanonical.getType(), "documentCanonical.Type is null");
		return DocumentBuilder 
				.create() 
				.setType(documentTypeEntityConverter.convert(documentCanonical.getType())) 
				.setValue(documentCanonical.getValue()) 
				.build();
	}
}
