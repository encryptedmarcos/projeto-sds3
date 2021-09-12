package com.portifolio.springreactvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portifolio.springreactvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
	
	

}
