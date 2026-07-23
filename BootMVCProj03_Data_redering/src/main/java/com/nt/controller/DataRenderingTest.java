package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DataRenderingTest {
  
	@GetMapping("/")
	public String dataRenderd(Map<String,Object> map) {
		map.put("name", "Junaid");
		map.put("age", 23);
		return "forward:report";
	}
	@RequestMapping("/report")
	public String report(Map<String,Object> map) {
		map.put("rep", "report is generated");
	   return "report";
	}
	
}
