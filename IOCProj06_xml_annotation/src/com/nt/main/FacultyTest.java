package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.Faculty;

public class FacultyTest {
void main() {
	FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
	Faculty fac = (Faculty)ctx.getBean("fac");
	fac.showDetails();
	
}
}
