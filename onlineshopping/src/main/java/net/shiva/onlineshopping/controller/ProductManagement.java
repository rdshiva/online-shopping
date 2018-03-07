package net.shiva.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//@Controller
//@RequestMapping("/manage")
public class ProductManagement {
	@RequestMapping(value="/products",method=RequestMethod.GET)
	public ModelAndView showManageProduct() {
		
		ModelAndView mv = new ModelAndView("page");
		
		mv.addObject("userClickMangeProducts", true);
		mv.addObject("title", "Manage Products");
		
		return mv;
	}
}
