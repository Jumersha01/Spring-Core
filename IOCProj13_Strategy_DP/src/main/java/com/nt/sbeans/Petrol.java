package com.nt.sbeans;

import org.springframework.stereotype.Component;

import com.nt.comp.Engine;

@Component("P")
public class Petrol implements Engine {

	@Override
	public void start() {
		System.out.println("Petrol Engine Started");
	}

	@Override
	public void stop() {
		System.out.println("Petrol Engine Stopped");

	}

}
