package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController2 {
	
	@RequestMapping("getDataWithJstl")
	public String getDataWithJstl(Model m) {
		
		String myName = "Ritesh";
		m.addAttribute("myName", myName);
		
		List<String> myFriends = new ArrayList<String>();
		myFriends.add("Ritesh");
		myFriends.add("Karan");
		myFriends.add("Akash");
		myFriends.add("Arjun");
		
		m.addAttribute("myFriends", myFriends);
		return "getDataWithJstl";
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
