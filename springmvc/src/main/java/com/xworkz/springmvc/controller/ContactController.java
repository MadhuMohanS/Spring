package com.xworkz.springmvc.controller;





import java.net.http.HttpRequest;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.springmvc.model.User;

@Controller
public class ContactController {
	
	@ModelAttribute
	public void commonDataForAll(Model m) {
		m.addAttribute("Header","Learn code with Madhu");
		m.addAttribute("Desc","Learning platform");
	}

	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}
	
//	@RequestMapping(path="/processform",method=RequestMethod.POST)
//	public String handleForm(Model model,HttpServletRequest request) {
//		String email=request.getParameter("email");
//		String userName=request.getParameter("userName");
//		String password=request.getParameter("password");
//		model.addAttribute("email",email);
//		model.addAttribute("userName",userName);
//		model.addAttribute("password",password);
//		return "success";
//	}
	
//	@RequestMapping(path="/processform",method=RequestMethod.POST)
//	public String handleForm(@RequestParam("email") String email,@RequestParam("userName") String userName,@RequestParam("password") String password,Model model) {
//		model.addAttribute("email",email);
//		model.addAttribute("userName",userName);
//		model.addAttribute("password",password);
//		return "success";
//	}
	
	@RequestMapping(path="/handleForm",method=RequestMethod.POST)
	public String handleFormUsingModel(@ModelAttribute User user,Model model) {
//		model.addAttribute("user",user);
		return "successmodel";
	}
	
}
/*
@RequestMapping(path="/handleForm",method=RequestMethod.POST)
public String handleFormUsingModel(@RequestParam("email") String email,@RequestParam("userName") String userName,@RequestParam("password") String password,Model model) {
	
	
	User user=new User();
	user.setEmail(email);
	user.setUserName(userName);
	user.setPassword(password);
	model.addAttribute("user",user);
	return "successmodel";
}
*/
