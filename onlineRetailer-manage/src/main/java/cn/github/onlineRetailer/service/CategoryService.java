package cn.github.onlineRetailer.service;

import java.util.List;

import cn.github.onlineRetailer.entity.Category;

public interface CategoryService {

	List<Category> categoryList();
	
	void addCategory(Category category);
	
	void deleteCategoryById(Integer categoryId);
	
	void deleteCategoryBySelected(Integer[] categoryId);
	
	void updateCategoryById(Category category);
}
