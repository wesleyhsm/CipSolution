package br.com.fourward.ispbtranslate.entity.builder;

import br.com.fourward.ispbtranslate.entity.ParticipantEntity;

public class ParticipantBuilder {

	private Long participantId;
	private String name;
	private String ispb;
	private String bankCode;
	
	public static ParticipantBuilder create(){
		return new ParticipantBuilder();
	}

	private ParticipantBuilder(){

	}

	public ParticipantBuilder setParticipantId(final Long participantId){
		this.participantId = participantId;
		return this;
	}

	public ParticipantBuilder setName(final String name){
		this.name = name;
		return this;
	}

	public ParticipantBuilder setIspb(final String ispb){
		this.ispb = ispb;
		return this;
	}

	public ParticipantBuilder setBankCode(final String bankCode){
		this.bankCode = bankCode;
		return this;
	}
	
	public ParticipantEntity build(){
		return new ParticipantEntity(participantId, name, ispb, bankCode);
	}
}