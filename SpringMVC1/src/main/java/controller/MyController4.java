package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class MyController4 {
			
	@RequestMapping("showImage")
	public String showImageOnPage(){
		return "showImagePage";
	}
	
	@RequestMapping("showFileUpload")
	public String showFileUploadPage() {
		return "fileUploadPage";
	}
	
	@PostMapping("/fileUpload")
	public String showUploadedFile(
			@RequestParam("inputFile") CommonsMultipartFile file,
			HttpServletRequest request,
			Model m
			
			) {
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getName());
		System.out.println(file.getContentType());
		System.out.println(file.getSize());
		
		byte[] data = file.getBytes();
		
		String path = request.getServletContext().getRealPath("/")+"WEB-INF"+ File.separator + "resources" + File.separator + "images"+File.separator+file.getOriginalFilename();
		System.out.println(path);
		
		try {
			FileOutputStream fos = new FileOutputStream(path);
			fos.write(data);
			fos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("File Uploaded Success");
		m.addAttribute("image", file.getOriginalFilename());
		
		
		return "fileUploadSuccess";
	}
	
	
	
}
