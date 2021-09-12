package com.portifolio.springreactvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portifolio.springreactvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
