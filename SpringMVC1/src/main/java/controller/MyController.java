package controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.HttpSessionRequiredException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import beans.Student;

@Controller
public class MyController {
	
	@RequestMapping("/firstPage")
	public String openFirstPage() {
		return "firstPage";
	}
	
	@RequestMapping("/secondPage")
	public String openSecondPage() {
		return "secondPage";
	}
	
	@GetMapping("getData1")
	public String getDataOne(Model m) {
		m.addAttribute("myName", "Prasad");
		m.addAttribute("myId", 123);
		
		List<String> friends = new ArrayList<String>();
		friends.add("Pravin");
		friends.add("Akash");
		m.addAttribute("myFriends", friends);
		
		return "displayData";
	}
	
	@GetMapping("getData2")
	public ModelAndView getDataTwo() {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("myName", "Ritesh");
		mv.addObject("myId", 123);
		
		List<String> friends = new ArrayList<>();
		friends.add("Arjun");
		friends.add("Karan");
		
		mv.addObject("myFriends", friends);
		mv.setViewName("displayData2");
		
		return mv;
	}
	
	
	@GetMapping("getEntryForm")
	public String getEntryForm() {
		return "StudentEntryForm";
	}
	
	
//Method 1
	
//	@PostMapping("submitStudentData")
//	public String submitStudentData(HttpServletRequest request , Model m) {
//		
//		String studentName = request.getParameter("studentName");
//		String studentCity = request.getParameter("studentCity");
//		String studentEmail = request.getParameter("studentEmail");
//		
//		m.addAttribute("studentName", studentName);
//		m.addAttribute("studentCity", studentCity);
//		m.addAttribute("studentEmail", studentEmail);
//		
//	
//		return "showFormData";
//		
//		
//	}
	

//   METHOD 2
	
//	@PostMapping("submitStudentData")
//	public String submitStudentData(
//			@RequestParam("studentName") String studentName,
//			@RequestParam("studentCity") String studentCity,
//			@RequestParam("studentEmail") String studentEmail,
//			Model m) {
//		
//		m.addAttribute("studentName", studentName);
//		m.addAttribute("studentCity", studentCity);
//		m.addAttribute("studentEmail", studentEmail);
//		
//	
//		return "showFormData";
//	
//	}
	
//	@PostMapping("submitStudentData")
//	public String submitStudentData(
//			@RequestParam("studentName") String studentName,
//			@RequestParam("studentCity") String studentCity,
//			@RequestParam("studentEmail") String studentEmail,
//			Model m) {
//		
//		Student s1 = new Student(studentName, studentCity, studentEmail);
//		
//		System.out.println(s1);
//		
//		m.addAttribute("student", s1);
//		
//		return "showFormData";
//	
//	}
	
	@PostMapping("submitStudentData")
	public String submitStudentData(@ModelAttribute Student student) {
		return "showFormData";
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
