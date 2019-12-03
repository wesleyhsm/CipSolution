package br.com.fourward.cip.business;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.fourward.cip.canonical.PaymentReportCanonical;
import br.com.fourward.cip.canonical.PaymentSummaryCanonical;
import br.com.fourward.cip.entity.PaymentEntity;
import br.com.fourward.cip.entity.PointOfSaleEntity;
import br.com.fourward.cip.entity.SubAcquirerEntity;
import br.com.fourward.cip.entity.converter.PaymentEntityConverter;
import br.com.fourward.cip.entity.converter.PaymentReportCanonicalConverter;
import br.com.fourward.cip.repository.PaymentRepository;
import br.com.fourward.cip.repository.PointOfSaleRepository;
import br.com.fourward.cip.repository.SubAcquirerRepository;
@Service
public class PaymentBusiness implements Serializable {

	private static final long serialVersionUID = -88185194335655026L;

	@Autowired
	private PaymentRepository paymentRepository;

	@Autowired
	private PointOfSaleRepository pointOfSaleRepository;
	
	@Autowired
	private SubAcquirerRepository subAcquirerRepository;
	
	@Autowired
	private PaymentEntityConverter paymentEntityConverter;
	
	@Autowired
	private PaymentReportCanonicalConverter paymentReportCanonicalConverter;
		
	public Long save(final PaymentSummaryCanonical paymentSummaryCanonical) {
		final Long id = persistDataPayment(paymentSummaryCanonical);				
		return id;
	}

	@Transactional
	public Long persistDataPayment(final PaymentSummaryCanonical paymentSummaryCanonical) {
		
		final PaymentEntity paymentEntity = paymentEntityConverter.convert(paymentSummaryCanonical);
		
		persistDataPointOfSale(paymentEntity.getPointOfSaleEntity());
		persistDataSubAcquirer(paymentEntity.getSubAcquirerEntity());
		paymentRepository.save(paymentEntity);
		
		return paymentEntity.getPaymentId();
	}
	
	private void persistDataPointOfSale(final PointOfSaleEntity pointOfSaleEntity){
		pointOfSaleRepository.save(pointOfSaleEntity);
	}
	
	private void persistDataSubAcquirer(final SubAcquirerEntity subAcquirerEntity){
		subAcquirerRepository.save(subAcquirerEntity);
	}
	
	public PaymentReportCanonical searchPayment(final PaymentReportCanonical paymentReportCanonical) {
		
		final PaymentEntity paymentEntity = paymentSearchId(paymentReportCanonical.getId());		
		final PaymentReportCanonical paymentReportCanonicalResult = paymentReportCanonicalConverter.convert(paymentEntity);
		
		return paymentReportCanonicalResult;
	}
	
	public List<PaymentReportCanonical> searchPaymentList(final PaymentReportCanonical paymentReportCanonical) {
		
		final List<PaymentEntity> paymentEntitys = paymentSearchKeyList(paymentReportCanonical.getPaymentSummaryCanonical().getExternalId());				
		final List<PaymentReportCanonical> paymentReportCanonicalResults = new ArrayList<PaymentReportCanonical>();	
		
		paymentEntitys.forEach(paymentEntity -> {
			paymentReportCanonicalResults.add(paymentReportCanonicalConverter.convert(paymentEntity));
		});
		
		return paymentReportCanonicalResults;
	}
	
	private PaymentEntity paymentSearchId(final Long id){
		return paymentRepository.findId(id);
	}
	
	private List<PaymentEntity> paymentSearchKeyList(final String externalKey){
		return paymentRepository.findKey(externalKey);
	}
}