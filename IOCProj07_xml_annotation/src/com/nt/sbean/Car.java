package com.nt.sbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("cr")
public class Car {
  private Engine eng;
  
   @Autowired
	public Car(Engine eng) {
		this.eng=eng;
	}
    
   public String showDetails() {
	   return "Car is manufactured with engine"+this.eng.getName()+" horser power: "+this.eng.getHorsePower();
   }
}
