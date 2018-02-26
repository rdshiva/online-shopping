package com.shiva.backend.test;

import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.shiva.backend.dao.CategoryDAO;
import com.shiva.backend.dto.Category;

public class CategoryTestCase {

	private static AnnotationConfigApplicationContext context;
	
	private static CategoryDAO categoryDao;
	
	private Category category;
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.shiva.backend");
		context.refresh();
		
		categoryDao = (CategoryDAO) context.getBean("categoryDao");
	}
	
	@Test
	public void testAddCategory() {
		category = new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("Contains list of Laptop");
		category.setImgURL("HP.jpg");
		category.setActive(true);
		
		assertEquals ("Success",true,categoryDao.add(category));

	}
	
/*	@Test
	public void testGetCategory() {
		
		category = categoryDao.get(3);
		
		assertEquals ("Success fetch single category","OLD CRT",category.getName());
		
	}*/
	
	/*@Test
	public void testUpdateCategory() {
		
		category = categoryDao.get(3);
		
		category.setName("TV");
		
		assertEquals ("Success updated single category",true,categoryDao.update(category));
		
	}*/
	
	
/*	@Test
	public void testDeleteCategory() {
		
		category = categoryDao.get(2);
		
		
		assertEquals ("Success deleted single category",true,categoryDao.delete(category));
		
	}
	*/
	
/*	@Test
	public void testListCategory() {
		
		
		assertEquals ("Success fetched list category",2,categoryDao.list().size());
		
	}*/
	
}
