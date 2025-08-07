package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

	@RequestMapping("/searchPage")
	public String searchPage() {
		System.out.println("Inside The Home Page");
		return "home";
	}
	
	
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox") String query) {
		
		String url = "https://www.google.com/search?q=" + query;
		RedirectView rv = new RedirectView();
		rv.setUrl(url);
		return rv;
	}
	
}
