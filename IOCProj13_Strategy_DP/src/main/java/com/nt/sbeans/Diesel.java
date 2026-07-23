package com.nt.sbeans;

import org.springframework.stereotype.Component;

import com.nt.comp.Engine;

@Component("D")
public class Diesel implements Engine {

	@Override
	public void start() {
		System.out.println("Diesel Engine Started");

	}

	@Override
	public void stop() {
		System.out.println("Diesel Engine Stopped");
	}

}
