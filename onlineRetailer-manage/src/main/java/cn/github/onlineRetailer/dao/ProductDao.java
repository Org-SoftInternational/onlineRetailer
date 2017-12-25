package cn.github.onlineRetailer.dao;

import java.util.List;

import cn.github.onlineRetailer.entity.Product;

public interface ProductDao {

	Product getProductById(Integer productId);
	
	List<Product> getProductByCategory(Integer categoryId);
	
	int InsertProductByCategory(Product product);
	
	int deleteProductByCategory(Integer categoryId);
	
	int deleteProductById(Integer productId);
	
	int updateProductById(Product product);
}
