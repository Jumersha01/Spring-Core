package com.nt.config;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages="com.nt.sbeans")
public class AppConfig {

//@Primary
@Bean("date")
public LocalDate getDate() {
	return LocalDate.now();
	}
@Bean("ldate1")
public LocalDate getDate1() {
	return LocalDate.of(2020,10,10);
}
}
