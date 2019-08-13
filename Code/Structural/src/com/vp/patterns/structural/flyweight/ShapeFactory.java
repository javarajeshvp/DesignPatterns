package com.vp.patterns.structural.flyweight;


import java.util.HashMap;
import java.util.Map;

import com.vp.patterns.structural.composite.Circle;
import com.vp.patterns.structural.composite.IShape;
import com.vp.patterns.structural.composite.Square;
import com.vp.patterns.structural.composite.Triangle;

public class ShapeFactory {
	
	private static final  Map<ShapeType, IShape> shapes  = new HashMap<ShapeType, IShape>();
	
	public static IShape getShape(ShapeType type) {
		IShape shapeImpl = shapes.get(type);
		
		if(shapeImpl == null){
			if(type.equals(ShapeType.CIRCLE_FILL)){
				shapeImpl = new Circle();
			}else if(type.equals(ShapeType.SQUARE_NOFILL)){
				shapeImpl = new Square();
			}else if(type.equals(ShapeType.TRIANGLE)){
				shapeImpl = new Triangle();
			}
			shapes.put(type,shapeImpl );
		}
		return shapeImpl;
	}

}
