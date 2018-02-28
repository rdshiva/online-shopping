package com.shiva.backend.dao;

import java.util.List;
import com.shiva.backend.dto.Category;

public interface CategoryDAO {

		List<Category> list();
		boolean add(Category ccategory);
		boolean update(Category ccategory);
		boolean delete(Category ccategory);
	
		Category get(int id);
}
