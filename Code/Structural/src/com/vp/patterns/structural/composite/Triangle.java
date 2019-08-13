package com.vp.patterns.structural.composite;

public class Triangle implements IShape {

	@Override
	public void draw(String lineColor) {
		
		System.out.println("Triangle.draw() " + lineColor);
	}

}
