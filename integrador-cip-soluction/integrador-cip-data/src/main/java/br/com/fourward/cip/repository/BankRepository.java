package br.com.fourward.cip.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fourward.cip.entity.BankEntity;

public interface BankRepository extends JpaRepository<BankEntity, Long> {

}
