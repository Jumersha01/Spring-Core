package com.nt.sbeans;

import java.time.LocalTime;

public class WishMessageGenerator {
 private LocalTime time;
 
 public WishMessageGenerator() {
	 IO.println("Wish Message Generated SuccesFully");
 }
 public void setTime(LocalTime time) {
	 this.time=time;
 }
 
public String generateWishMessage(String user) {
	String message = null;
	int hour = time.getHour();
	if(hour<12) {
		message = "Good Morning "+user;
	}
	else if(hour<16) {
		message = "Good AfterNooon "+user;
	}
	else if(hour<20) {
		message = "Good Evening "+ user;
	}
	else {
	 message = "Good Night "+user;
	}
	return message;
	
}
}
