package com.osmanco.service;

import java.util.List;

import com.osmanco.model.Product;

public interface ProductService {

	/**
	 * 
	 * @param productBean
	 * @return
	 * @throws ProductException
	 */
	String addProduct(Product product);

	List<Product> findAll();

}
