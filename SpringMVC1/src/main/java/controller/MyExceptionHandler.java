package controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyExceptionHandler {
	
	
	@ExceptionHandler(value = NullPointerException.class)
	public String showexception1(Model m) {
		m.addAttribute("msg", "Null Pointer Exception");
		return "errorPage";
	}
	
	@ExceptionHandler(value = NumberFormatException.class)
	public String showexception2(Model m) {
		m.addAttribute("msg", "Number Format Exception");
		return "errorPage";
	}
	
	@ExceptionHandler(value = Exception.class)
	public String showexception3(Model m) {
		m.addAttribute("msg", "Some Other Exception Exception");
		return "errorPage";
	}

}
