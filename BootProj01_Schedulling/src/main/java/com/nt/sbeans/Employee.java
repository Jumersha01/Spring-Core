package com.nt.sbeans;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component("emp")
public class Employee {

//	@Scheduled(initialDelay=5000)
@Scheduled(fixedRate=5000)
//	@Scheduled(fixedDelay=5000)
	public void execute() {
		System.out.println("Task Executed: ");
	}
}
