package net.shiva.onlineshopping.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.shiva.backend.dao.CategoryDAO;
import com.shiva.backend.dao.ProductDAO;
import com.shiva.backend.dto.Category;
import com.shiva.backend.dto.Product;

@Controller
@RequestMapping("/manage")
public class ManagementController {
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@Autowired
	private ProductDAO productDAO;
	
	private static final Logger logger = LoggerFactory.getLogger(ManagementController.class);

	@RequestMapping(value="/products", method=RequestMethod.GET )	
	public ModelAndView showManageProducts(@RequestParam(name="operation", required=false) String operation) {
		ModelAndView mv = new ModelAndView("page");
		
		mv.addObject("userClickMangeProducts", true);
		mv.addObject("title", "Manage Products");
		
		Product nProduct = new Product();
		
		nProduct.setSupplierId(1);
		nProduct.setActive(true);
		
		logger.info("XXXXXXXXXXXXXXXXXproductXXXXXXXXXXXXXXXXXXXXXx", nProduct.toString());
		mv.addObject("product", nProduct);
		
		if(operation!=null) {
			if(operation.equals("product")) {
				mv.addObject("message", "Product Submitted Succesffuly");
			}
		}
		
		return mv;
	}
	
	//handling product submission
	
	@RequestMapping(value="/products", method=RequestMethod.POST )	
	public String submitProducts(@ModelAttribute("product") Product mProduct) {
		
		productDAO.add(mProduct);
		
	return "redirect:/manage/products?operation=product";
	}
	
	
	
	@ModelAttribute("categories")
	public List<Category> getCategories(){
		return categoryDAO.list();
		
	}
	
	
}
