package com.vp.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements IShape {
	List<IShape> shapeList = new ArrayList<IShape>();

	public void draw(String lineColor) {

		for (IShape shape : shapeList) {
			shape.draw(lineColor);
		}
	}
	
	public void add(IShape shape){
		this.shapeList.add(shape);
	}
	
	public void remove(IShape shape){
		this. shapeList.remove(shape);
	}
}

