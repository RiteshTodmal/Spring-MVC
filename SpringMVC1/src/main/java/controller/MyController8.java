package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MyController8 {
	
	@RequestMapping("testInterceptor")
	public String showPage() {
		
		return "homePage";
	}
	
	@RequestMapping("sendRequest")
	public String showPage2(
				@RequestParam("name") String name,
				Model m
			) {
		
		System.out.println("I am in Handler Method");
		m.addAttribute("name", name);
		return "welcomePage";
		
	}
	
	

}
