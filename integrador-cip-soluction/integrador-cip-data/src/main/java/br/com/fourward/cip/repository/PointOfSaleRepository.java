package br.com.fourward.cip.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fourward.cip.entity.PointOfSaleEntity;

public interface PointOfSaleRepository extends JpaRepository<PointOfSaleEntity, Long> {

}
