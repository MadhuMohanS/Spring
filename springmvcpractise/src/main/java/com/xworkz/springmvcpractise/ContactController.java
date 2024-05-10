package com.xworkz.springmvcpractise;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.springmvcpractise.model.User;

@Controller
public class ContactController {
	@RequestMapping("/contact")
	public String showForm() {
		System.out.println("this is contact");
		return "contact";
	}
	
//	@RequestMapping("/processform")
//	public String handleForm(@ModelAttribute User user) {
//		
//		return "success";
//	}
	
//	@RequestMapping("/processform")
//	public String handleForm(HttpServletRequest request,Model model) {
//		String name=request.getParameter("userName");
//		String email=request.getParameter("email");
//		String password=request.getParameter("password");
//		
//		model.addAttribute("nm",name);
//		model.addAttribute("em",email);
//		model.addAttribute("pass",password);
//		return "successServlet";
//	}
	
	@RequestMapping("/processform")
	public String handleForm(@RequestParam("userName") String name,@RequestParam("email") String email,@RequestParam("password") String pass,Model m) {
		User user=new User();
		user.setUserName(name);
		user.setEmail(email);
		user.setPassword(pass);
		m.addAttribute(user);
		return "success";
	}
}
