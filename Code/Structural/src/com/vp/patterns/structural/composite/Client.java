package com.vp.patterns.structural.composite;

public class Client {

	public static void main(String[] args) {
		Drawing drawing = new Drawing();
		
		IShape circle1 = new Circle();
		drawing.add(circle1);

		IShape circle2 = new Circle();
		drawing.add(circle2);

		IShape triangle = new Triangle();
		drawing.add(triangle);

		IShape square = new Square();
		drawing.add(square);
		
		System.out.println("Drqwing Yellow lines ");
		drawing.draw("Yellow");
		System.out.println("Drqwing Red lines ");
		drawing.draw("Red");
		
	}

}
