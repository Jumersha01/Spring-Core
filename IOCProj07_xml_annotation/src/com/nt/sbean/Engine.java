package com.nt.sbean;

import org.springframework.stereotype.Component;

@Component("eng")
public class Engine {
	
private String name ="v8";
private int horsePower = 40000;

public String getName() {
	return name;
}

public int getHorsePower() {
	return horsePower;
}

}
