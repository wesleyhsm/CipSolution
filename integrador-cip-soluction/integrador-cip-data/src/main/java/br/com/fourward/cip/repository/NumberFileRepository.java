package br.com.fourward.cip.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.fourward.cip.entity.NumberFileEntity;

public interface NumberFileRepository extends JpaRepository<NumberFileEntity, Long>{
	
	@Query( "SELECT " +
			"	n " +
			"FROM " +
			"	NumberFileEntity n " +
			"WHERE " +
			" n.numberFileId = (SELECT MAX(n2.numberFileId) FROM NumberFileEntity n2)")
    public NumberFileEntity findByMaxNumberFileGeneration();
}
