package com.xworkz.springcompany;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("name","Infosys");
		model.addAttribute("founder","Narayanurthy");
		model.addAttribute("wife","sudha");
		return "index";
	}
	
	@RequestMapping("/handleForm")
	public String company(Model model,@RequestParam("name") String name,@RequestParam("founder") String founder,@RequestParam("wife") String wife) {
		model.addAttribute("name",name);
		model.addAttribute("founder",founder);
		model.addAttribute("wife",wife);
		return "index";
	}
}
