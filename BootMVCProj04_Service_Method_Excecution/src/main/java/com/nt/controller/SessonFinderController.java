package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.nt.service.SeasonFinder;

@Controller
public class SessonFinderController {
     
	 @Autowired
	 private SeasonFinder seasonFinder;
	 
	@GetMapping("/") 
	public String getSeason(Map<String,Object> map) {
		map.put("season", seasonFinder.getSeason());
		return "redirect:season";
	}
	
}
