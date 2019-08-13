package com.vp.patterns.structural.decorator;

public class LuxuryCar extends CarDecorator  {

	public LuxuryCar(ICar car) {
		super(car);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void assemble(){
		super.assemble();
		System.out.print("LuxuryCar.assemble()");
	}
}
