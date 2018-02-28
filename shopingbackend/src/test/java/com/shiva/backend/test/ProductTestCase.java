package com.shiva.backend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.shiva.backend.dao.ProductDAO;
import com.shiva.backend.dto.Product;


public class ProductTestCase {


	private static AnnotationConfigApplicationContext context;
	
	private static ProductDAO productDAO;
	
	private Product product;
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.shiva.backend");
		context.refresh();
		
		productDAO = (ProductDAO) context.getBean("productDAO");
	}
	
	@Test
	public void testListActiveProducts() {
		 assertEquals("wrong",6,productDAO.listActiveProducts().size());
		
		//product.setName("Oppo);

	}
	
	
	
/*	@Test
	public void testGetproduct() {
		
		product = productDao.get(3);
		
		assertEquals ("Success fetch single product","OLD CRT",product.getName());
		
	}*/
	
	/*@Test
	public void testUpdateproduct() {
		
		product = productDao.get(3);
		
		product.setName("TV");
		
		assertEquals ("Success updated single product",true,productDao.update(product));
		
	}*/
	
	
/*	@Test
	public void testDeleteproduct() {
		
		product = productDao.get(2);
		
		
		assertEquals ("Success deleted single product",true,productDao.delete(product));
		
	}
	*/
	
/*	@Test
	public void testListproduct() {
		
		
		assertEquals ("Success fetched list product",2,productDao.list().size());
		
	}*/
	

}
