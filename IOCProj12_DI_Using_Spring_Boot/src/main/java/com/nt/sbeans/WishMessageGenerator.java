package com.nt.sbeans;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class WishMessageGenerator {
	
@Autowired

LocalTime time;


public void getMessage() {
	int hour = time.getHour();
	if(hour>=12&&hour<=4) {
		System.out.println("Good After Noon");
	}
	else {
		System.out.println("Good Evening");
	}
}



}

