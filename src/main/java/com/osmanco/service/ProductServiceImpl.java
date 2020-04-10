package com.osmanco.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.osmanco.model.Product;
import com.osmanco.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductRepository productRepository;
	@Override
	public String addProduct(Product product) {
		return productRepository.save(product).getId();
	}

	@Override
	public List<Product> findAll() {
		return productRepository.findAll();
	}

}
