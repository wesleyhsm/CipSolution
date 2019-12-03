package br.com.fourward.ispbtranslate.dto.factory;

import org.springframework.stereotype.Component;

import br.com.fourward.ispbtranslate.dto.MessageResponseDto;

@Component
public class MessageResponseDtoFactory {

	public MessageResponseDto createMessageResponseDto(final Integer code, final Exception exception) {
		return MessageResponseDto.createMessageResponseDto(code, exception.getMessage());
	}
}