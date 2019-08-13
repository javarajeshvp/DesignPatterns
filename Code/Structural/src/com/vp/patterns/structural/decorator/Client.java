package com.vp.patterns.structural.decorator;

public class Client {

	public static void main(String[] args) {
		ICar sportsCar = new SportsCar(new BasicCar());
		sportsCar.assemble();
		System.out.println("*********************");
		
		ICar luxuryCar = new LuxuryCar(new BasicCar());
		luxuryCar.assemble();
	}

}
