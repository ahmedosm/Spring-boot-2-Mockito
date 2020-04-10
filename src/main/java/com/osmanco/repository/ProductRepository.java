package com.osmanco.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.osmanco.model.Product;

//@Repository
public interface ProductRepository extends MongoRepository<Product, String>  {

}
