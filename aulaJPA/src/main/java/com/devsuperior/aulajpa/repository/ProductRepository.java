package com.devsuperior.aulajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.aulajpa.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
