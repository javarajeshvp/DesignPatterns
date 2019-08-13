package com.vp.patterns.creational.abstractfactory;

import com.vp.patterns.creational.factory.Computer;
import com.vp.patterns.creational.factory.Desktop;

public class DesktopFactory implements AbstractFactory{
	private String ram;
	private String hdd;

	
	public DesktopFactory(String ram, String hdd){
		this.ram=ram;
		this.hdd=hdd;
	}
	
	@Override
	public Computer createComputer() {
		return new Desktop(ram,hdd);  
	}

}
