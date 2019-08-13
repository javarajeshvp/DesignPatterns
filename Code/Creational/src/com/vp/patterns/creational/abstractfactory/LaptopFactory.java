package com.vp.patterns.creational.abstractfactory;

import com.vp.patterns.creational.factory.Computer;
import com.vp.patterns.creational.factory.Laptop;

public class LaptopFactory implements AbstractFactory{
	private String ram;
	private String hdd;

	
	public LaptopFactory(String ram, String hdd){
		this.ram=ram;
		this.hdd=hdd;
	}
	
	@Override
	public Computer createComputer() {
		return new Laptop(ram,hdd);
	}

}
