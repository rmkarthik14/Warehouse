package com.rmk.webapp.dao;

import org.springframework.data.repository.CrudRepository;

import com.rmk.webapp.model.Products;

public interface ProdRepo extends CrudRepository<Products, Integer> {
	
}
