package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.Student;

public class StudentTest {
public static void main(String[] args ) {
	FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
	Object obj = context.getBean("std");
	Student student = (Student) obj;
	
	student.penDetails();
}
}
