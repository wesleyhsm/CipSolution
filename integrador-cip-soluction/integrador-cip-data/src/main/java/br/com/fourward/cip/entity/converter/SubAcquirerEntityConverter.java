package br.com.fourward.cip.entity.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.fourward.cip.canonical.BankAccountCanonical;
import br.com.fourward.cip.canonical.DocumentCanonical;
import br.com.fourward.cip.canonical.PaymentSummaryCanonical;
import br.com.fourward.cip.canonical.SubAcquirerCanonical;
import br.com.fourward.cip.entity.BankEntity;
import br.com.fourward.cip.entity.DocumentEntity;
import br.com.fourward.cip.entity.SubAcquirerEntity;

@Component
public class SubAcquirerEntityConverter {

	@Autowired
	private DocumentEntityConverter documentEntityConverter;

	@Autowired
	private BankEntityConverter bankEntityConverter;

	public SubAcquirerEntity converter(final PaymentSummaryCanonical paymentSummaryCanonical) {

		final SubAcquirerCanonical subAcquirerCanonical = paymentSummaryCanonical.getSubacquirer();
		final SubAcquirerEntity subAcquirerEntity = new SubAcquirerEntity();
		final DocumentCanonical documentCanonical = subAcquirerCanonical.getDocument();
		final DocumentEntity documentEntity = documentEntityConverter.convert(documentCanonical);
		final BankAccountCanonical bankAccountCanonical = subAcquirerCanonical.getBankAccount();
		final BankEntity bankEntity = bankEntityConverter.convert(bankAccountCanonical);
		
		bankEntity.setCompany(subAcquirerEntity);		
		documentEntity.setCompany(subAcquirerEntity);
		subAcquirerEntity.setName(subAcquirerCanonical.getName());
		subAcquirerEntity.setDocumentEntity(documentEntity);
		subAcquirerEntity.setBankEntity(bankEntity);
		
		return subAcquirerEntity;
	}
}
