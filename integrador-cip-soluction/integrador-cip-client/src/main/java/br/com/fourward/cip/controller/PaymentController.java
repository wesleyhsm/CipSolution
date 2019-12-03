package br.com.fourward.cip.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.fourward.cip.business.PaymentBusiness;
import br.com.fourward.cip.canonical.PaymentReportCanonical;
import br.com.fourward.cip.canonical.builder.PaymentReportCanonicalBuilder;
import br.com.fourward.cip.dto.PaymentRequestDto;
import br.com.fourward.cip.dto.PaymentResponseDto;
import br.com.fourward.cip.dto.converter.PaymentSummaryConverter;
import br.com.fourward.cip.entity.converter.PaymentReportCanonicalConverter;
import br.com.fourward.logger.Logger;

@RestController
@RequestMapping("/payment")
@Logger
public class PaymentController {

	@Autowired
	private PaymentBusiness paymentBusiness;

	@Autowired
	private PaymentSummaryConverter paymentSummaryConverter;
	
	@Autowired
	private PaymentReportCanonicalConverter paymentReportCanonicalConverter;
				
	@CrossOrigin
	@RequestMapping(method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_VALUE }, consumes = {
			MediaType.APPLICATION_JSON_VALUE })
	public @ResponseBody PaymentResponseDto save(@Valid @RequestBody final PaymentRequestDto paymentRequestDto) {
	
		final List<PaymentReportCanonical> paymentReportsCanonicals = paymentRequestDto.getPaymentSummaryDtos()
				.parallelStream().map(mapper -> paymentSummaryConverter.convert(mapper)).map(mapper -> {
					final Long id = paymentBusiness.save(mapper);
					return PaymentReportCanonicalBuilder 
							.create() 
								.setPaymentSummaryCanonical(mapper) 
								.setId(id) 					
							.build(); 
				}).collect(Collectors.toList());

		return PaymentResponseDto.create(0, "OK", paymentReportsCanonicals);
	}
	
	@CrossOrigin
	@RequestMapping(value = "/id/{id}", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE })
	public PaymentResponseDto searchId(@Valid @PathVariable("id") final Long id) {

		final PaymentReportCanonical paymentReportCanonicalParameter = paymentReportCanonicalConverter.convertId(id);
		final PaymentReportCanonical paymentReportCanonicalResult = paymentBusiness.searchPayment(paymentReportCanonicalParameter);
				
		return PaymentResponseDto.create(0, "OK", Arrays.asList(paymentReportCanonicalResult));
	}	
	
	@CrossOrigin
	@RequestMapping(value = "/key/{key}", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE })
	public PaymentResponseDto searchKey(@Valid @PathVariable("key") final String key) {
		
		final PaymentReportCanonical paymentReportCanonicalParameter = paymentReportCanonicalConverter.convertKey(key);
		final List<PaymentReportCanonical> paymentReportCanonicalResults = paymentBusiness.searchPaymentList(paymentReportCanonicalParameter);
		
		return PaymentResponseDto.create(0, "OK", paymentReportCanonicalResults);
	}
}