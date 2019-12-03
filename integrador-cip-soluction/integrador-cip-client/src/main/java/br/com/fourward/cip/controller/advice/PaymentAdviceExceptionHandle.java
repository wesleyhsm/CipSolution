package br.com.fourward.cip.controller.advice;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import br.com.fourward.cip.dto.CertificateResponseDto;
import br.com.fourward.cip.dto.MessageResponseDto;
import br.com.fourward.cip.dto.PaymentResponseDto;
import br.com.fourward.cip.dto.factory.MessageResponseDtoFactory;
import br.com.fourward.ispbtranslate.exception.DataNotFoundException;

@ControllerAdvice
public class PaymentAdviceExceptionHandle {

	@Autowired
	private MessageResponseDtoFactory messageResponseDtoFactory;

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(DataIntegrityViolationException.class)
	@ResponseBody
	public PaymentResponseDto handleException(final DataIntegrityViolationException ex) {
		return PaymentResponseDto.create(99, ex.getMessage());
	}

	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(Exception.class)
	@ResponseBody
	public MessageResponseDto handleException(final Exception ex) {
		return messageResponseDtoFactory.createMessageResponseDto(98, ex);
	}

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseBody
	public MessageResponseDto methodArgumentNotValidException(final MethodArgumentNotValidException ex) {
		return messageResponseDtoFactory.createMessageResponseDto(97, ex);
	}

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(NumberFormatException.class)
	@ResponseBody
	public MessageResponseDto handleException(final NumberFormatException ex) {
		return messageResponseDtoFactory.createMessageResponseDto(96, ex);
	}

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(NoSuchAlgorithmException.class)
	@ResponseBody
	public CertificateResponseDto noSuchAlgorithmException(final NoSuchAlgorithmException ex) {
		return CertificateResponseDto.create(95, ex.getMessage());
	}

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(HttpMessageNotReadableException.class)
	@ResponseBody
	public MessageResponseDto handleException(final HttpMessageNotReadableException ex) {
		return messageResponseDtoFactory.createMessageResponseDto(94, ex);
	}

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(FileNotFoundException.class)
	@ResponseBody
	public CertificateResponseDto fileNotFoundException(final FileNotFoundException ex) {
		return CertificateResponseDto.create(93, ex.getMessage());
	}

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(IOException.class)
	@ResponseBody
	public CertificateResponseDto iOException(final IOException ex) {
		return CertificateResponseDto.create(92, ex.getMessage());
	}

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(CertificateException.class)
	@ResponseBody
	public CertificateResponseDto certificateException(final CertificateException ex) {
		return CertificateResponseDto.create(91, ex.getMessage());
	}
	
	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ExceptionHandler(DataNotFoundException.class)
	@ResponseBody
	public MessageResponseDto handleException(final DataNotFoundException ex) {
		return messageResponseDtoFactory.createMessageResponseDto(90, ex);
	}
}