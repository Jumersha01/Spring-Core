package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.cnf.AppConfig;
import com.nt.sbeans.WishMessageGenerator;

public class WishMessageTester {

	public static void main(String[] args) {
		  try(AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class)){
			  WishMessageGenerator wishMessage = ctx.getBean("wmg",WishMessageGenerator.class);
			 String msg =  wishMessage.getMessage("Junaid");
			 IO.println(msg);
		  }
		  catch(Exception e) {
			  e.printStackTrace();
		  }

	}

}
