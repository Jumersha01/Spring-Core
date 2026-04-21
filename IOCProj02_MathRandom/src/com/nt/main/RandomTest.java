package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.RandomTableGenerator;

public class RandomTest {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		
  Object obj = context.getBean("rtable");
    RandomTableGenerator table = (RandomTableGenerator ) obj;
    table.randomTable();
  
	}

}
