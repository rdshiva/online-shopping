package com.shiva.backend.dao;

import java.util.List;
import com.shiva.backend.dto.Category;

public interface CategoryDAO {

		boolean add(Category ccategory);
		boolean update(Category ccategory);
		boolean delete(Category ccategory);
	
		List<Category> list();

		Category get(int id);
}
