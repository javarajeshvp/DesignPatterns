package com.vp.patterns.structural.decorator;

public class SportsCar extends CarDecorator  {

	public SportsCar(ICar car) {
		super(car);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void assemble(){
		super.assemble();
		System.out.print("SportsCar.assemble()");
	}
}
