package com.nt.sbeans;

public class Laptop {
private Battary battary;

public Laptop(Battary battary) {
	this.battary=battary;
}
public String getMessage() {
	return "Laptop is powered by Battery\n"+"Battery Type: "+battary.getBatteryType()+"\nCapacity: "+battary.getCapacity()+"\nBrand: "+battary.getBrand();
}
}
