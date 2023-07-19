package com.rest.template.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import com.rest.template.model.Product;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping
	public String getProductList() {
		ResponseEntity<String> response = restTemplate.getForEntity("https://api.example.com/products", String.class);
		if (response.getStatusCode() == HttpStatus.OK) {
			return response.getBody();
		}
		return "Failed to retrieve product list.";
	}

	@PostMapping
	public String createProduct(@RequestBody Product product) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<Product> requestEntity = new HttpEntity<>(product, headers);
		ResponseEntity<String> response = restTemplate.postForEntity("https://api.example.com/products", requestEntity,
				String.class);
		if (response.getStatusCode() == HttpStatus.CREATED) {
			return "Product created successfully.";
		}
		return "Failed to create product.";
	}

	@PutMapping("/{id}")
	public String updateProduct(@PathVariable("id") String id, @RequestBody Product product) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<Product> requestEntity = new HttpEntity<>(product, headers);
		ResponseEntity<String> response = restTemplate.exchange("https://api.example.com/products/{id}", HttpMethod.PUT,
				requestEntity, String.class, id);
		if (response.getStatusCode() == HttpStatus.OK) {
			return "Product updated successfully.";
		}
		return "Failed to update product.";
	}

	@DeleteMapping("/{id}")
	public String deleteProduct(@PathVariable("id") String id) {
		ResponseEntity<String> response = restTemplate.exchange("https://api.example.com/products/{id}",
				HttpMethod.DELETE, null, String.class, id);
		if (response.getStatusCode() == HttpStatus.NO_CONTENT) {
			return "Product deleted successfully.";
		}
		return "Failed to delete product.";
	}
}
