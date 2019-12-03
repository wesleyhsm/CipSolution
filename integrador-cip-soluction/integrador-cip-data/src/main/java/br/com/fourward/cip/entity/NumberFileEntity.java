package br.com.fourward.cip.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "number_file")
public class NumberFileEntity implements Serializable{

	private static final long serialVersionUID = -8345224923203462082L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "number_file_id")
	private Long numberFileId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date")
	private Date date;
	
	@Column(name = "number_file_generation")
	private Long numberFileGeneration;

	public NumberFileEntity(){
		
	}
	
	public NumberFileEntity(Long numberFileId, Date date, Long numberFileGeneration) {
		super();
		this.numberFileId = numberFileId;
		this.date = date;
		this.numberFileGeneration = numberFileGeneration;
	}

	public Long getNumberFileId() {
		return numberFileId;
	}

	public void setNumberFileId(Long numberFileId) {
		this.numberFileId = numberFileId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Long getNumberFileGeneration() {
		return numberFileGeneration;
	}

	public void setNumberFileGeneration(Long numberFileGeneration) {
		this.numberFileGeneration = numberFileGeneration;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numberFileId == null) ? 0 : numberFileId.hashCode());
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
		NumberFileEntity other = (NumberFileEntity) obj;
		if (numberFileId == null) {
			if (other.numberFileId != null)
				return false;
		} else if (!numberFileId.equals(other.numberFileId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "NumberFileEntity [numberFileId=" + numberFileId + ", date=" + date + ", numberFileGeneration="
				+ numberFileGeneration + "]";
	}	
}
