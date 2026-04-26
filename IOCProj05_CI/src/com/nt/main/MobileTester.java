package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.Mobile;

public class MobileTester {
void main() {
	FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
	Object obj = context.getBean("mob");
	Mobile mobile= (Mobile) obj;
	
	IO.println("Mobile detail is as follows:\n"+mobile.mobileDetails());
}
}
