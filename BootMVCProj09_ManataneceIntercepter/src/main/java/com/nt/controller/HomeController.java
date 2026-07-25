package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;


@Controller
@Slf4j
public class HomeController {

	@GetMapping("/")
	public String homePage() {
		log.info("homePage() true condintion Executed");
		return "home";
	}
	
	@GetMapping("/dash")
	public String dashPage() {
		log.info("dashPage() true condintion Executed");
		return "dash";
	}
	
}
