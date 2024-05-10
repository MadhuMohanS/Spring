package com.xworkz.springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.format.datetime.joda.LocalDateTimeParser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
    public String home(Model model) {
        System.out.println("this is home url");
        model.addAttribute("name", "Madhu Mohan");
        model.addAttribute("id", 1234);
        
        List<String> friends=new ArrayList<String>();
        friends.add("vandhana");
        friends.add("vinay");
        friends.add("faraz");
        
        model.addAttribute("f",friends);
        return "index";
    }

    @RequestMapping("/about")
    public String about(Model model) {
        System.out.println("this is about url");
        System.out.println("this page is coming from about");
        
        model.addAttribute("name","Subramanya");
        model.addAttribute("id",1235);
        Map<String, Integer> courseFeeMap=new HashMap<String, Integer>();
        courseFeeMap.put("java", 5000);
        courseFeeMap.put("python", 1000);
        courseFeeMap.put("web", 2000);
        model.addAttribute("cf",courseFeeMap);
        
        model.addAttribute("address","vasantha talkies road");
        model.addAttribute("mob","9880315061");
        model.addAttribute("mail","madhu@gmail.com");
        List<String> friends=new ArrayList<String>();
        friends.add("vandhana");
        friends.add("vinay");
        friends.add("faraz");
        
        model.addAttribute("f",friends);
        
        return "about";
    }
    
    @RequestMapping("/help")
    public ModelAndView help() {
    	System.out.println("hi this is help page");
    	ModelAndView modelAndView=new ModelAndView();
    	modelAndView.addObject("name","Krishna Kumar");
    	modelAndView.addObject("rollNo",100);
    	LocalDateTime time=LocalDateTime.now();
    	modelAndView.addObject("time",time);
    	modelAndView.setViewName("help");
    	
    	List<Integer> list=new ArrayList<Integer>();
    	list.add(12);
    	list.add(13);
    	list.add(14);
    	list.add(15);
    	list.add(16);
    	
    	modelAndView.addObject("nos",list);
    	return modelAndView;
    }
}
