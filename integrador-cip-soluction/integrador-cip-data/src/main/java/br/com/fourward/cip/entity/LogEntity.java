package br.com.fourward.cip.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.PrePersist;

public class LogEntity implements Serializable{

	private static final long serialVersionUID = -2908655094882622917L;

	private Long logId;
	private Date date;
	private String message;
	private String orign;
	
	public LogEntity(){
		
	}
	
	public LogEntity(Long logId, Date date, String message, String orign) {
		super();
		this.logId = logId;
		this.date = date;
		this.message = message;
		this.orign = orign;
	}
	public Long getLogId() {
		return logId;
	}
	public void setLogId(Long logId) {
		this.logId = logId;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getOrign() {
		return orign;
	}
	public void setOrign(String orign) {
		this.orign = orign;
	}
	
	@PrePersist
	public void configuraDataCriacaoAlteracao(){		
		this.date = new Date();		
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((logId == null) ? 0 : logId.hashCode());
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		result = prime * result + ((orign == null) ? 0 : orign.hashCode());
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
		LogEntity other = (LogEntity) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (logId == null) {
			if (other.logId != null)
				return false;
		} else if (!logId.equals(other.logId))
			return false;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		if (orign == null) {
			if (other.orign != null)
				return false;
		} else if (!orign.equals(other.orign))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Log [logId=" + logId + ", date=" + date + ", message=" + message + ", orign=" + orign + "]";
	}	
}
