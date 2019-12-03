package br.com.fourward.cip.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="digital_certificate")
public class DigitalCertificateEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="path")
	private String path;
	
	@Column(name="password")
	private String password;
	
	@Column(name="expiration_date")	
	private Date expirationDate;
	
	@Column(name="activation_date")	
	private Date activationDate;
	
	@Column(name="active")
	private Boolean active;

	@Column(name="ispb")
	private String ispb;
	
	public DigitalCertificateEntity(){
		
	}

	public DigitalCertificateEntity(Long id, String path, String password, Date expirationDate, Date activationDate,
			Boolean active, String ispb) {
		super();
		this.id = id;
		this.path = path;
		this.password = password;
		this.expirationDate = expirationDate;
		this.activationDate = activationDate;
		this.active = active;
		this.ispb = ispb;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}
	
	public Date getActivationDate() {
		return activationDate;
	}

	public void setActivationDate(Date activationDate) {
		this.activationDate = activationDate;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public String getIspb() {
		return ispb;
	}

	public void setIspb(String ispb) {
		this.ispb = ispb;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		DigitalCertificateEntity other = (DigitalCertificateEntity) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DigitalCertificateEntity [id=" + id + ", path=" + path + ", password=" + password + ", expirationDate="
				+ expirationDate + ", activationDate=" + activationDate + ", active=" + active + ", ispb=" + ispb + "]";
	}	
}
