package net.shiva.onlineshopping.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalException {

	@ExceptionHandler(NoHandlerFoundException.class)
	public ModelAndView handle404Exception(){
		
		ModelAndView mv = new ModelAndView("error");
		
		mv.addObject("errorTitle","404 exception");
		
		mv.addObject("errorDescription","Check the URL again!!");
		
		mv.addObject("title","Genaral Exception");
		
		return mv;
	}
	
	@ExceptionHandler(GeneralException.class)
	public ModelAndView handleGeneralException(){
		
		ModelAndView mv = new ModelAndView("error");
		
		mv.addObject("errorTitle","Error - Not Found");
		
		mv.addObject("errorDescription","Cotanct Admin");
		
		mv.addObject("title","Genaral Exception");
		
		return mv;
	}
	
}
