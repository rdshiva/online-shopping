package com.shiva.backend.dao;

import java.util.List;

import com.shiva.backend.dto.Product;

public interface ProductDAO {

	/*Product get(int productId);
	List<Product> list();
	boolean add(Product product);
	boolean update(Product product);
	boolean delete(Product product);*/
	
	List<Product> listActiveProducts();
	List<Product> listActiveProductsByCategory(int catergoryId);
	List<Product> getLatestActiveProducts(int count);
	
}
