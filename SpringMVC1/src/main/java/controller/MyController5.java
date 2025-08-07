package controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import beans.Student;
import entities.Student1;

@Controller
public class MyController5 {
	
	@RequestMapping("/user/{userId}/{userName}")
	public String testPathVariable(
		@PathVariable("userId") int userId,
		@PathVariable("userName") String userName
	)
	{
		System.out.println("I Reached To Controller which checks path variable");
		System.out.println("User id is: "+ userId);
		System.out.println("User Name is: "+ userName);
		return "";
	}
	
	
	@RequestMapping("studentEntry")
	public String StudentEntry() {
		return "showStudentEntryForm";
	}
	
	@RequestMapping("studentEntry1")
	public String showStudentEntryForm(
			@ModelAttribute("student1") Student1 student1,
			BindingResult result
			) {
			
		if(result.hasErrors()) {
			return "showStudentEntryForm";
		}
		
		return "showSuccess";
	}

}
