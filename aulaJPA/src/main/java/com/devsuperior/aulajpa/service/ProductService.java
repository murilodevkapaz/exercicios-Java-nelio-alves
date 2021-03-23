package com.devsuperior.aulajpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.aulajpa.entities.Product;
import com.devsuperior.aulajpa.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired//cria uma instancia do ProductRepository
	private ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();//esse findAll faz uma consulta no banco converte e retorna a lista
	}
}
