package cn.github.onlineRetailer.service;

import java.util.List;

import cn.github.onlineRetailer.entity.Product;

public interface ProductService {
	
	Product getProductById(Integer productId);
	
	List<Product> productList(Integer categoryId);
	
	void addProduct(Product product);
	
	void deleteProductById(Integer productId);
	
	void deleteProductByCategory(Integer categoryId);
	
	void updateProductById(Product product);

}
