package br.com.fourward.cip.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fourward.cip.entity.StatusEntity;

public interface StatusRepository extends JpaRepository<StatusEntity, Long> {

}