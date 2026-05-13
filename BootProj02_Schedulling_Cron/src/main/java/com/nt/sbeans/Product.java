package com.nt.sbeans;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component("pr")
public class Product {
   
	@Scheduled(cron="*/5 * * * * *")
	public void testScheduling() {
		System.out.println("Testing schedulling...");
	}
	
}
