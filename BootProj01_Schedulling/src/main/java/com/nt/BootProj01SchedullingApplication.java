package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.nt.sbeans.Employee;

@SpringBootApplication
@EnableScheduling
public class BootProj01SchedullingApplication {

	public static void main(String[] args) {
	
		ConfigurableApplicationContext ctx = SpringApplication.run(BootProj01SchedullingApplication.class, args);
        Employee emp =ctx.getBean("emp",Employee.class);
       
	}

}
