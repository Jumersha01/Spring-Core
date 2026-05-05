package com.nt.test;

import com.nt.commons.Bike;
import com.nt.factory.BikeFactory;

public class BikeTest {
	void main() {

		Bike b = BikeFactory.getBike("average");
		b.run();
		IO.println("=======================");

		b = BikeFactory.getBike("sports");
		b.run();
		IO.println("=======================");

		b = BikeFactory.getBike("Standard");
		b.run();
	}
}
