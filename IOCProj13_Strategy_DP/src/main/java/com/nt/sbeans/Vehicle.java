package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.nt.comp.Engine;
@Component
public class Vehicle {
	
@Autowired
@Qualifier("P")
Engine engie;

public void journey() {
	engie.start();
	System.out.println("Jorney began");
	engie.stop();
	System.out.println("Jorney ended");
	
	
}
}
