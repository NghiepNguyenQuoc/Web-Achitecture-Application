package com.packt.webstore.domain.repository;

import java.util.List;
import java.util.Map;

import com.packt.webstore.domain.Product;

public interface ProductRepository {
	List<Product> getAllProducts();

	void updateStock(String productId, long noOfUnits);

	List<Product> getProductsByCategory(String category);

	List<Product> getProductsByFilter(Map<String, List<String>> filterParams);

	Product getProductById(String productID);

	List<Product> filterProducts(Map<String, Integer> filterParams, String category, String brand);
	
	void addProduct(Product product);


}