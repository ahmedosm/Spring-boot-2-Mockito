package com.osmanco.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import com.osmanco.model.Product;
import com.osmanco.repository.ProductRepository;

@ExtendWith(MockitoExtension.class)
public class TestProductService {
	
	
	 @Mock
	 ProductRepository productRepository;
	 @InjectMocks
	 ProductServiceImpl productService;
	 
	   @Test
	    public void givenCountMethodMocked_WhenCountInvoked_ThenMockValueReturned() {
	    	Product product=new Product();
	    	product.setId("777");
	    	product.setName("rrrr");
	    	product.setStock(88l);
	        Mockito.when(productRepository.save(product)).thenReturn(product);
	       String id= productService.addProduct(product);
	       assertEquals(product.getId(), id);
	     
	      //  Mockito.verify(mockRepository).count();
	    }    
}
