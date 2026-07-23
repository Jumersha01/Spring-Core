package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Vehicle;

@SpringBootApplication
public class IocProj13StrategyDpApplication {

	public static void main(String[] args) {
		try(ConfigurableApplicationContext ctx = SpringApplication.run(IocProj13StrategyDpApplication.class, args)){
			Vehicle vehicle = ctx.getBean(Vehicle.class);
			vehicle.journey();
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
	}

}
