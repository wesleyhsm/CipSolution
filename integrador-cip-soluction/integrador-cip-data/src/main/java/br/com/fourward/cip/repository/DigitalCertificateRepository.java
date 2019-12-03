package br.com.fourward.cip.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.fourward.cip.entity.DigitalCertificateEntity;

public interface DigitalCertificateRepository extends JpaRepository<DigitalCertificateEntity, Long>{

	@Query( "SELECT " +
			"	d " +
			"FROM " +
			"	DigitalCertificateEntity d " +
			"WHERE " +
			" d.id= (SELECT MAX(d2.id) FROM DigitalCertificateEntity d2)")
    public DigitalCertificateEntity findByMaxDigitalCertificate();
}
