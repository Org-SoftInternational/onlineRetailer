package cn.github.onlineRetailer.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import cn.github.onlineRetailer.dao.CategoryDao;
import cn.github.onlineRetailer.entity.Category;
import cn.github.onlineRetailer.service.CategoryService;

@Service
@com.alibaba.dubbo.config.annotation.Service
public class CategoryServiceImpl implements CategoryService{

	@Resource
	private CategoryDao categoryDao;
	
	private final static Logger logger = LoggerFactory.getLogger(CategoryServiceImpl.class);

	@Override
	public List<Category> categoryList() {
		return categoryDao.categoryList();
	}

	@Override
	public void addCategory(Category category) {
		categoryDao.insertCategory(category);		
	}

	@Override
	public void deleteCategoryById(Integer categoryId) {
		categoryDao.deleteCategoryById(categoryId);
	}

	@Override
	public void deleteCategoryBySelected(Integer[] categoryId) {
		categoryDao.deleteCatagoryBySelected(categoryId);
	}

	@Override
	public void updateCategoryById(Category category) {
		categoryDao.updateCategoryById(category);
	}
	    
}
