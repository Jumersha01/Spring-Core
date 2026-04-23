package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.Laptop;

public class LaptopTest {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
    
		 Object obj = context.getBean("lap");
		 Laptop laptop = (Laptop) obj;
		 IO.println(laptop.getMessage());
	}

}
