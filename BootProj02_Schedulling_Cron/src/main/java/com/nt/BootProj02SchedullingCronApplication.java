package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.nt.sbeans.Product;

@SpringBootApplication
@EnableScheduling
public class BootProj02SchedullingCronApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(BootProj02SchedullingCronApplication.class, args);
	        
		Product p= ctx.getBean("pr",Product.class);
	}

}
