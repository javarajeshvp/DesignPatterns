package com.vp.patterns.structural.bridge;

public class Square extends Shape {

	public Square(Color color){
		super(color);
	}
	@Override
	public void applyColor() {
		System.out.println("Square.applyColor()");
		color.applyColor();
		
	}

	
}
