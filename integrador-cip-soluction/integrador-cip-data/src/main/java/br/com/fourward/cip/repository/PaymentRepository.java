package br.com.fourward.cip.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.fourward.cip.entity.PaymentEntity;

public interface PaymentRepository extends JpaRepository<PaymentEntity, Long> {

	@Query( "SELECT " +
			"	p " +
			"FROM " +
			"	PaymentEntity p " +			
			"WHERE " +
			"	p.nameFile = :nameFile")
	public PaymentEntity findNameFile(@Param("nameFile") String nameFile);
	
	@Query( "SELECT " +
			"	p " +
			"FROM " +
			"	PaymentEntity p " + 
			"	join fetch p.statusEntitys s " +
			"	join fetch p.pointOfSaleEntity o " +
			"	join fetch o.bankEntity ba " + 
			"	join fetch o.documentEntity do " +
			"	join fetch p.subAcquirerEntity b " + 
			"	join fetch b.bankEntity bn " + 
			"	join fetch b.documentEntity dc " +
			"WHERE " +
			"	p.paymentId = :id")
    public PaymentEntity findId(@Param("id") Long id);
	
	@Query( "SELECT " +
			"	p " +
			"FROM " +
			"	PaymentEntity p " + 
			"	join fetch p.statusEntitys s " +
			"	join fetch p.pointOfSaleEntity o " +
			"	join fetch o.bankEntity ba " + 
			"	join fetch o.documentEntity do " +
			"	join fetch p.subAcquirerEntity b " + 
			"	join fetch b.bankEntity bn " + 
			"	join fetch b.documentEntity dc " +
			"WHERE " +
			"	p.externalKey = :externalKey")	
    public List<PaymentEntity> findKey(@Param("externalKey") String externalKey);

	@Query( "SELECT " +
			"	p " +
			"FROM " +
			"	PaymentEntity p " + 
			"	join p.statusEntitys s " +
			"	join p.pointOfSaleEntity o " +
			"	join o.bankEntity ba " + 
			"	join o.documentEntity do " +
			"	join p.subAcquirerEntity b " + 
			"	join b.bankEntity bn " + 
			"	join b.documentEntity dc " +
			"WHERE " +
			"	p.productType = 'Credit' " +
			"	and s.statusType = 'Received' " +
			"GROUP BY " +
			"	p.paymentId " +
			"HAVING " +
			"	(SELECT " +
			"		count(st) " +
			"	FROM " +
			"		PaymentEntity pa " +
			"		join pa.statusEntitys st " +
			"	WHERE " +
			"		pa.paymentId = p.paymentId) = 1 ")
	public Page<PaymentEntity> findCredit(final Pageable pageable);

	@Query( "SELECT " +
			"	p " +
			"FROM " +
			"	PaymentEntity p " + 
			"	join p.statusEntitys s " +
			"	join p.pointOfSaleEntity o " +
			"	join o.bankEntity ba " + 
			"	join o.documentEntity do " +
			"	join p.subAcquirerEntity b " + 
			"	join b.bankEntity bn " + 
			"	join b.documentEntity dc " +
			"WHERE " +
			"	p.productType = 'Debit' " +
			"	and s.statusType = 'Received' " +
			"GROUP BY " +
			"	p.paymentId " +
			"HAVING " +
			"	(SELECT " +
			"		count(st) " +
			"	FROM " +
			"		PaymentEntity pa " +
			"		join pa.statusEntitys st " +
			"	WHERE " +
			"		pa.paymentId = p.paymentId) = 1")
	public Page<PaymentEntity> findDebit(final Pageable pageable);

	@Query( "SELECT " +
			"	p " +
			"FROM " +
			"	PaymentEntity p " + 
			"	join p.statusEntitys s " +
			"	join p.pointOfSaleEntity o " +
			"	join o.bankEntity ba " + 
			"	join o.documentEntity do " +
			"	join p.subAcquirerEntity b " + 
			"	join b.bankEntity bn " + 
			"	join b.documentEntity dc " +
			"WHERE " +
			"	p.productType = 'Antecipation' " +
			"	and s.statusType = 'Received' " +
			"GROUP BY " +
			"	p.paymentId " +
			"HAVING " +
			"	(SELECT " +
			"		count(st) " +
			"	FROM " +
			"		PaymentEntity pa " +
			"		join pa.statusEntitys st " +
			"	WHERE " +
			"		pa.paymentId = p.paymentId) = 1")
	public Page<PaymentEntity> findAntecipation(final Pageable pageable);
}