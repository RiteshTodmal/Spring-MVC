package controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class MyController3 {
	
//	@RequestMapping("redirectPageOne")
//	public void pageOneMethod(HttpServletResponse res) throws IOException {
//		
//		System.out.println("I Am in Page One");
//		res.sendRedirect("redirectPageTwo");
//		
//	}
//	
//	
//	@RequestMapping("redirectPageTwo")
//	public String pageTwoMethod() {
//		System.out.println("I Am in Page Two");
//		return "";
//	}
	
// METHOD RedirectPrefix
	
	
//	@RequestMapping("source")
//	public String mySourcePage() {
//		System.out.println("This is Source Page");
//		
//		
////		return "redirect:/destination";
//		
//		return "redirect:https://www.google.com";
//	}
//	
//	
//	@RequestMapping("destination")
//	public String myDestinationPage() {
//		System.out.println("This is DEstination Page");
//		
//		return "";
//	}
	
	
//Method RedirectView
	
	
	@RequestMapping("source")
	public RedirectView mySourcePage() {
		System.out.println(" I Am In The Source Page");
		RedirectView rv = new RedirectView();
		rv.setUrl("destination");
		return rv;
		
	}
	
	
	@RequestMapping("destination")
	public String myDestinationPage() {
		
		System.out.println(" I Am In destination Page");
		return "";
	}
	
	
	
	
	

}
