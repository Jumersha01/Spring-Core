package com.nt.sbeans;

public class Car {
private Engine engine;

public void setEngine(Engine engine) {
	this.engine = engine;
}

public String carDetails() {
	return "Engine Type:-" +engine.ingineType+" Engine HP:- "+engine.ingineHourPower+"Engin Company"+ engine.engineCompany;
}

}
