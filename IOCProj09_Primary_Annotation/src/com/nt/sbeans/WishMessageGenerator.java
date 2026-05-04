package com.nt.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("wmg")
public class WishMessageGenerator {
    @Autowired
	private LocalDate date;
    
    public String getWishMessage(String user) {
    	int wno = date.getDayOfWeek().getValue();
    	String message = "";
    	if(wno>=1||wno<=5) {
    		message +="Working Day "+user;
    	}
    	else {
    		message+="Week Day "+user;
    	}
    	return message;
    }
    
    
    
}
