package com.xworkz.springmvcpractise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("executing home page");
		model.addAttribute("nm","Madhu Mohan S");
		model.addAttribute("id",1234);
		
		List<String> friends=new ArrayList<String>();
		friends.add("madhu");
		friends.add("mohan");
		friends.add("anil");
		
		model.addAttribute("f",friends);
		
		Map<String, Integer> courseFee=new HashMap();
		courseFee.put("java", 1000);
		courseFee.put("python", 2000);
		courseFee.put("web technology", 3000);
		
		model.addAttribute("cf",courseFee);
		return "index";
	}

}
