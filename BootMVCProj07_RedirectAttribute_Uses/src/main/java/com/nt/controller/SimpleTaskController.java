package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class SimpleTaskController {
	
   @GetMapping("/")
	public String getHome() {
		return "home";
	}
	
  @PostMapping("/add")
  public String addTask(RedirectAttributes attr) {
	  
	  attr.addFlashAttribute("msg", "Task Is Added: ");
	  
	  return "redirect:task";
  }
  
  @GetMapping("/task")
  public String getTask() {
	  
	 return "home"; 
  }
}
