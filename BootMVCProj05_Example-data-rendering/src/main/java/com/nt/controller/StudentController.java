package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.nt.model.Student;

@Controller
public class StudentController {

	@GetMapping("/")
	public String getHomePage() {
		return "home";
	}
	
	@GetMapping("/info")
	public String getStudentInfo(Map<String, Student> s) {
		s.put("s1", new Student(101, "Junaid", "IMR", "Savda Maharashtra"));
		return "info";
	}
	

}
