package br.com.fourward.cip.entity.builder;

import java.util.Date;

import br.com.fourward.cip.entity.LogEntity;

public class LogBuilder {

	private Long logId;
	private Date date;
	private String message;
	private String orign;
	
	public static LogBuilder create(){
		return new LogBuilder();
	}

	private LogBuilder(){

	}

	public LogBuilder setLogId(final Long logId){
		this.logId = logId;
		return this;
	}

	public LogBuilder setDate(final Date date){
		this.date = date;
		return this;
	}

	public LogBuilder setMessage(final String message){
		this.message = message;
		return this;
	}

	public LogBuilder setOrign(final String orign){
		this.orign = orign;
		return this;
	}

	public LogEntity build(){
		return new LogEntity(logId, date, message, orign);
	}
}