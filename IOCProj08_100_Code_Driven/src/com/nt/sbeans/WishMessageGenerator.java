package com.nt.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
  private LocalDate localDate;

  @Autowired
  public void setLocalDate(LocalDate localDate) {
	this.localDate = localDate;
  }
  
  public String getMessage(String user) {
	  String message = "";
	  int no = localDate.getDayOfWeek().getValue();
	  if(no>=1||no<=5) {
		 message +="Working day "+user;
	  }
	  else {
		  message+="Weekend day "+user;
	  }
	  return message;
	  
  }
  
}
