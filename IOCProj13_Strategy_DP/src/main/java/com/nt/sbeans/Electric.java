package com.nt.sbeans;

import com.nt.comp.Engine;

public class Electric implements Engine {

	@Override
	public void start() {
		System.out.println("Electric  Engine Started");

	}

	@Override
	public void stop() {
		System.out.println("Electric  Engine Ended");
	}

}
