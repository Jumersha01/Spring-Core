package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbean.Car;

public class CarTest {
void main() {
	FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
	
	Car car = ctx.getBean("cr",Car.class);
	IO.println(car.showDetails());
}
}
