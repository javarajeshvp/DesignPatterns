package com.vp.patterns.structural.flyweight;

import com.vp.patterns.structural.composite.IShape;

public class Client {

	public static void main(String[] args) {

		IShape shape = ShapeFactory.getShape(ShapeType.CIRCLE_FILL);
		shape.draw("Red");
		shape.draw("green");
		shape = ShapeFactory.getShape(ShapeType.SQUARE_NOFILL);
		shape.draw("Red");
		shape = ShapeFactory.getShape(ShapeType.TRIANGLE);
		shape.draw("Red");
	}

}
