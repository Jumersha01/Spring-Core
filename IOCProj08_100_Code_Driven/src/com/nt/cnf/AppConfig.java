package com.nt.cnf;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.nt.sbeans")
public class AppConfig {

	@Bean("ldate")
	public LocalDate getLocalDate() {
		return LocalDate.now();
	}
	
}
