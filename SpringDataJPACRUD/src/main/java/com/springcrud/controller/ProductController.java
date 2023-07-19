package com.springcrud.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.springcrud.model.Product;
import com.springcrud.request.Products;
import com.springcrud.service.ProductService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
    ProductService productService;

    @GetMapping("/getAllData")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/getbyId/{id}")
    public Optional<Product> getProductById(@PathVariable int id) {
        return productService.getProductById(id);
    }

    @PostMapping("/save")
    public String createProduct(@RequestBody Products products) {
         productService.createProduct(products);
         return "Success";
    }

    @PutMapping("/update/{id}")
    public Product updateProduct(@PathVariable int id, @RequestBody Product updatedProduct) {
        return productService.updateProduct(id, updatedProduct);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteProduct(@PathVariable int id) {
        productService.deleteProduct(id);
    }
}
