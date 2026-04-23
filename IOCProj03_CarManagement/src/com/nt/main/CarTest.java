package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.Car;

public class CarTest {
public static void main(String[] args) {
	FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
	Object obj = context.getBean("car");
	Car car = (Car) obj;
	IO.println(car.carDetails());
	}
}
