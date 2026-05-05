package com.nt.factory;

import com.nt.commons.Average;
import com.nt.commons.Bike;
import com.nt.commons.SportsBike;
import com.nt.commons.StandardBike;

public class BikeFactory {
 
public static Bike getBike(String type) {
	Bike bike = null;
	
	if(type.equalsIgnoreCase("Standard"))
	{
		bike = new StandardBike();
	}
	else if(type.equalsIgnoreCase("Sports")){
		bike = new SportsBike();
	}
	else {
		bike = new Average();
	}
	
	return bike;
	
}
}
