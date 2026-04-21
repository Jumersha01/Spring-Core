package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class DependacyManagementTest {
  
	public static void main(String[] args) {
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		
		Object obj = context.getBean("wmg");
		WishMessageGenerator generator  = (WishMessageGenerator)obj;
		
		String message = generator.generateWishMessage("Junaid");
		IO.println(message);
		
	}
}
