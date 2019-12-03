package br.com.fourward.cip.canonical.builder;

import java.util.Date;

import br.com.fourward.cip.canonical.StatusCanonical;
import br.com.fourward.cip.canonical.StatusTypeCanonical;

public class StatusCanonicalBuilder {

	private StatusTypeCanonical statusTypeCanonical;
	private Date date;
	
	public static StatusCanonicalBuilder create(){
		return new StatusCanonicalBuilder();
	}

	private StatusCanonicalBuilder(){

	}
			
	public StatusCanonicalBuilder setStatusTypeCanonical(final StatusTypeCanonical statusTypeCanonical) {
		this.statusTypeCanonical = statusTypeCanonical;
		return this;
	}

	public StatusCanonicalBuilder setDate(final Date date) {
		this.date = date;
		return this;
	}
	
	public StatusCanonical build(){
		return new StatusCanonical(statusTypeCanonical, date);
	}
}
