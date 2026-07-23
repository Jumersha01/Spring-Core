package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.entity.Student;
import com.nt.service.IStudentService;

@Controller
public class StdController {
	@Autowired
	private IStudentService service;
	@GetMapping("/")
	public String getHome() {
		return "home";
	}
	
	@GetMapping("/register")
	public String getRegister(Map<String,Student> map) {
		
		map.put("add",new Student());
		return "register_form";
	}
	
	@PostMapping("/save")
	public String saveStudent(Map<String,Student> map,Student s) {
	    map.put("s1", s);
	    service.addStudent(s);
		return "show";
	}
	
   @GetMapping("/save")
	public String getStudentInfo(@RequestParam("name") String name,Map<String,String> map) {
		map.put("s1", name);
		return "show";
	}
  
    @GetMapping("/edit")
    public String editStudent(Map<String ,Student> map,@RequestParam(defaultValue="101") Integer id) {
    	System.out.println("Edit method executed");
    	Student std = service.getStudent(id);
    	map.put("s", std);
      
    	return "edit_form";
    }
    @PostMapping("edit")
    public String modifiedStudent(Student std) {
    	String message  = service.addStudent(std);
    	System.out.println("Updated Name: "+std.getName());
    	
    	
    	return "edited";
    }
    
    
	
}
