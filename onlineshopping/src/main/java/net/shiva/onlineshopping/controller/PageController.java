package net.shiva.onlineshopping.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.shiva.backend.dao.CategoryDAO;
import com.shiva.backend.dto.Category;

@Controller
public class PageController {
	
	@Autowired
	CategoryDAO categoryDao;

	@RequestMapping(value = {"/home"})
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Home");
		
		mv.addObject("categories",categoryDao.list());
		mv.addObject("userClickHome", true);
		return mv;
	}
	
	@RequestMapping(value = {"/about"})
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "About");
		mv.addObject("userClickAbout", true);
		return mv;
	}
	
	@RequestMapping(value = {"/contact"})
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Contact");
		mv.addObject("userClickContact", true);
		return mv;
	}
	
	/*
	 * method load all the products
	 * 
	 * */
	
	@RequestMapping(value = {"/show/all/products"})
	public ModelAndView showAllProducts() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "All Products");
		
		mv.addObject("categories",categoryDao.list());
		mv.addObject("userClickAllProducts", true);
		return mv;
	}
	
	/*
	 * fetch a single category
	 * */
	
	@RequestMapping(value = "/show/category/{id}/products")
	public ModelAndView showCategoryProducts(@PathVariable ("id") int id) {
		ModelAndView mv = new ModelAndView("page");
		
		Category category = null;
		
		category = categoryDao.get(id);
		
		mv.addObject("title", category.getName());
		
		mv.addObject("categories",categoryDao.list());
		mv.addObject("category",category);
		mv.addObject("userClickCategoryProducts", true);
		return mv;
	}
	
	/*@RequestMapping(value="/test")
	public ModelAndView test(@RequestParam(value="greeting",required=false) String greeting) {
		if(greeting == null) {
			greeting = "blank greeting";
		}
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", greeting);
		return mv;
	}*/
	
	/*@RequestMapping(value="/test/{greeting}")
	public ModelAndView test(@PathVariable(value="greeting") String greeting) {
		if(greeting == null) {
			greeting = "blank greeting";
		}
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", greeting);
		return mv;
	}
*/}
