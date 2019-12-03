package br.com.fourward.cip.entity.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.fourward.cip.canonical.BankAccountCanonical;
import br.com.fourward.cip.canonical.DocumentCanonical;
import br.com.fourward.cip.canonical.PaymentSummaryCanonical;
import br.com.fourward.cip.canonical.PointOfSaleCanonical;
import br.com.fourward.cip.entity.BankEntity;
import br.com.fourward.cip.entity.DocumentEntity;
import br.com.fourward.cip.entity.PointOfSaleEntity;

@Component
public class PointOfSaleEntityConverter {

	@Autowired
	private DocumentEntityConverter documentEntityConverter;

	@Autowired
	private BankEntityConverter bankEntityConverter;

	public PointOfSaleEntity converter(final PaymentSummaryCanonical paymentSummaryCanonical) {

		final PointOfSaleCanonical pointOfSaleCanonical = paymentSummaryCanonical.getPointOfSale();
		final PointOfSaleEntity pointOfSaleEntity = new PointOfSaleEntity();		
		final DocumentCanonical documentCanonical = pointOfSaleCanonical.getDocument();
		final DocumentEntity documentEntity = documentEntityConverter.convert(documentCanonical);
		final BankAccountCanonical bankAccountCanonical = pointOfSaleCanonical.getBankAccount();
		final BankEntity bankEntity = bankEntityConverter.convert(bankAccountCanonical);
		
		bankEntity.setCompany(pointOfSaleEntity);
		documentEntity.setCompany(pointOfSaleEntity);
		pointOfSaleEntity.setName(pointOfSaleCanonical.getName());
		pointOfSaleEntity.setDocumentEntity(documentEntity);
		pointOfSaleEntity.setBankEntity(bankEntity);
				
		return pointOfSaleEntity;
	}
}