package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController7 {
	
	@RequestMapping("testException")
	public String showPage() {
		
		String str = null;
		System.out.println(str.length());
		return "goodPage";
	}
	
	
//	@ExceptionHandler(value = NullPointerException.class)
//	public String showexception1(Model m) {
//		m.addAttribute("msg", "Null Pointer Exception");
//		return "errorPage";
//	}
//	
//	@ExceptionHandler(value = NumberFormatException.class)
//	public String showexception2(Model m) {
//		m.addAttribute("msg", "Number Format Exception");
//		return "errorPage";
//	}
//	
//	@ExceptionHandler(value = Exception.class)
//	public String showexception3(Model m) {
//		m.addAttribute("msg", "Some Other Exception Exception");
//		return "errorPage";
//	}
}
