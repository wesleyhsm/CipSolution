package br.com.fourward.cip.canonical;

import java.io.Serializable;
import java.util.Date;

public class StatusCanonical implements Serializable {

	private static final long serialVersionUID = -2528255732963932440L;

	private StatusTypeCanonical statusTypeCanonical;
	
	private Date date;
	
	public StatusCanonical(){
		
	}
	
	public StatusCanonical(StatusTypeCanonical statusTypeCanonical, Date date) {
		super();
		this.statusTypeCanonical = statusTypeCanonical;
		this.date = date;
	}
			
	public StatusTypeCanonical getStatusTypeCanonical() {
		return statusTypeCanonical;
	}

	public void setStatusTypeCanonical(StatusTypeCanonical statusTypeCanonical) {
		this.statusTypeCanonical = statusTypeCanonical;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((statusTypeCanonical == null) ? 0 : statusTypeCanonical.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StatusCanonical other = (StatusCanonical) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (statusTypeCanonical != other.statusTypeCanonical)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "StatusCanonical [statusTypeCanonical=" + statusTypeCanonical + ", date=" + date + "]";
	}	
}
