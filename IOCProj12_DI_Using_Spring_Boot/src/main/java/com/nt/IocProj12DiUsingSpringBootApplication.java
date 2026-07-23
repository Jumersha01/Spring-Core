package com.nt;

import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.sbeans.WishMessageGenerator;

@SpringBootApplication
public class IocProj12DiUsingSpringBootApplication {
	@Bean("ldate")
	   public LocalTime getTime() {
			return LocalTime.now();
		}
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =SpringApplication.run(IocProj12DiUsingSpringBootApplication.class, args);
		WishMessageGenerator gen = ctx.getBean(WishMessageGenerator.class);
		gen.getMessage();
		
	}
}
