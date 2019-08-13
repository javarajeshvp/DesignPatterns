package com.vp.patterns.structural.composite;

public class Circle implements IShape {

	@Override
	public void draw(String lineColor) {
		
		System.out.println("Circle.draw() " + lineColor);
	}

}
