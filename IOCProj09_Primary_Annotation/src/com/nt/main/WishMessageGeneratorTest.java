package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.WishMessageGenerator;

public class WishMessageGeneratorTest {
void main() {
	try(AnnotationConfigApplicationContext ctx =new AnnotationConfigApplicationContext(AppConfig.class)){
		WishMessageGenerator wishMessage = ctx.getBean("wmg",WishMessageGenerator.class);
		IO.println(wishMessage.getWishMessage("Junaid"));
	}
}
}
