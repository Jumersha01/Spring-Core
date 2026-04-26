package com.nt.sbeans;

public class Mobile {
String mobileName;
int mobileId;
Battery battery;

public Mobile(String mobileName,int mobileId,Battery battery) {
	this.mobileName=mobileName;
	this.mobileId=mobileId;
	this.battery=battery;
}
public String mobileDetails() {
	return " Mobile Name: "+this.mobileName+"\n Mobile Id: "+this.mobileId+"\n Battery name : "+this.battery.batteryName+"\n Battery capacity: "+this.battery.battarryCapacity;
}
}
