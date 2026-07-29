package com.nt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class IntercepotrExampleController {
//some change
	@GetMapping("/")
	public String home() {
		return "Welcome to home";
	}
	
	@GetMapping("/info")
	public String info() {
		return "User info is fetched";
	}
}
