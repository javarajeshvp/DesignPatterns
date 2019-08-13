package com.vp.patterns.structural.bridge;

public class Client {

	public static void main(String[] args) {
		Shape triange = new Triangle(new RedColor());
		triange.applyColor();
		Shape square = new Square(new GreenColor());
		square.applyColor();
	}

}
