package com.vp.patterns.structural.composite;

public class Square implements IShape {

	@Override
	public void draw(String lineColor) {
		
		System.out.println("Square.draw() " + lineColor);
	}

}
