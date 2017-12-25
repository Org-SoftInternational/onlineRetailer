package cn.github.onlineRetailer.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.github.onlineRetailer.dao.ProductDao;
import cn.github.onlineRetailer.entity.Product;
import cn.github.onlineRetailer.service.ProductService;

@Service
@com.alibaba.dubbo.config.annotation.Service
public class ProductServiceImpl implements ProductService{
	
	@Resource
	private ProductDao productDao;
	
	@Override
	public Product getProductById(Integer productId) {
		return productDao.getProductById(productId);
	}

	@Override
	public List<Product> productList(Integer categoryId) {
		return productDao.getProductByCategory(categoryId);
	}

	@Override
	public void addProduct(Product product) {
		productDao.InsertProductByCategory(product);
	}

	@Override
	public void deleteProductById(Integer productId) {
		productDao.deleteProductById(productId);
	}

	@Override
	public void deleteProductByCategory(Integer categoryId) {
		productDao.deleteProductByCategory(categoryId);
	}

	@Override
	public void updateProductById(Product product) {
		productDao.updateProductById(product);
	}

}
