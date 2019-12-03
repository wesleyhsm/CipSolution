package br.com.fourward.ispbtranslate.controller.advice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import br.com.fourward.ispbtranslate.dto.BankIspbTranslateResponseDto;
import br.com.fourward.ispbtranslate.dto.MessageResponseDto;
import br.com.fourward.ispbtranslate.dto.factory.MessageResponseDtoFactory;
import br.com.fourward.ispbtranslate.exception.DataNotFoundException;
import br.com.fourward.ispbtranslate.exception.ParticipantNotFoundException;
import br.com.fourward.logger.Logger;

@ControllerAdvice
@Logger
public class BankIspbTranslateAdviceExceptionHandle {
			
	@Autowired
	private MessageResponseDtoFactory messageResponseDtoFactory;
	
	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ExceptionHandler(ParticipantNotFoundException.class)
	@ResponseBody
	public BankIspbTranslateResponseDto handleException(final ParticipantNotFoundException ex) {
		return BankIspbTranslateResponseDto.create(99, ex.getMessage());
	}

	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(Exception.class)
	@ResponseBody
	public BankIspbTranslateResponseDto handleException(final Exception ex) {
		return BankIspbTranslateResponseDto.create(98, ex.getMessage());
	}

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseBody
	public BankIspbTranslateResponseDto handleException(final MethodArgumentNotValidException ex) {
		return BankIspbTranslateResponseDto.create(97, ex.getMessage());
	}

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(HttpMessageNotReadableException.class)
	@ResponseBody
	public BankIspbTranslateResponseDto handleException(final HttpMessageNotReadableException ex) {
		return BankIspbTranslateResponseDto.create(96, ex.getMessage());
	}
	
	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ExceptionHandler(DataNotFoundException.class)
	@ResponseBody
	public MessageResponseDto handleException(final DataNotFoundException ex) {
		return messageResponseDtoFactory.createMessageResponseDto(95, ex);
	}
}
