package com.vp.patterns.creational.factory;

public class ComputerFactory {
	public static Computer getComputer(String type, String ram, String hdd){
		if("Laptop".equals(type)){
			return  new Laptop(ram, hdd);
		}else if("Desktop".equals(type)){
			return  new Desktop(ram, hdd);
		}else{
			return null;
		}
	}
}
