package com.springboot.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.ProductRepository;
import com.springboot.model.Product;
import com.springboot.request.Products;

import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProductService {
    
	@Autowired
	ProductRepository productRepository;


    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(int id) {
        return productRepository.findById(id);
    }
    
    public Product createProduct(Products products) {
    	
    	Product product = new Product();
    	product.setName(products.getName());
    	product.setDescription(products.getDescription());
    	
        return productRepository.save(product);
    }

    public Product updateProduct(int id, Product updatedProduct) {
        Optional<Product> productOptional = productRepository.findById(id);
        if (productOptional.isPresent()) {
            Product product = productOptional.get();
            // Update the fields of the existing product with the values from updatedProduct
            product.setName(updatedProduct.getName());
            product.setDescription(updatedProduct.getDescription());
            // Update more fields as needed
            return productRepository.save(product);
        } else {
            throw new IllegalArgumentException("Product not found with ID: " + id);
        }
    }

    public void deleteProduct(int id) {
        productRepository.deleteById(id);
    }
}
