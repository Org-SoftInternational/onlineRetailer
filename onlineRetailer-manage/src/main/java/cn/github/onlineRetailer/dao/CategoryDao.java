package cn.github.onlineRetailer.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.github.onlineRetailer.entity.Category;

@Repository
public interface CategoryDao {

	List<Category> categoryList();
	
	int insertCategory(Category category);
	
	int deleteCategoryById(Integer categoryId);
	
	int deleteCatagoryBySelected(Integer[] categoryId);
	
	int updateCategoryById(Category category);
}
