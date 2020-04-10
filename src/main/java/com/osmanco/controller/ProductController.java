package com.osmanco.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.osmanco.model.Product;
import com.osmanco.service.ProductService;

@RestController
@RequestMapping("product")
public class ProductController {

	@Autowired
	private ProductService productService;

	@PutMapping("/add")
	public String addProduct(@RequestBody @Valid Product product){

		return productService.addProduct(product);
	}	
	
	@GetMapping("/")
	public List<Product> get(){

		return productService.findAll();
	}	
	
}
	

