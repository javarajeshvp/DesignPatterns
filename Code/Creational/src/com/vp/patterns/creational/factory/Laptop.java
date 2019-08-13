package com.vp.patterns.creational.factory;

public class Laptop extends Computer{
	private String ram;
	private String hdd;
	
	public Laptop(String ram, String hdd){
		this.ram=ram;
		this.hdd=hdd;
	}
	
	
	@Override
	public String getRAM() {
		
		return "Laptop RAM : " + ram;
	}

	@Override
	public String getHDD() {
		// TODO Auto-generated method stub
		return "Laptop HDD : " + hdd;
	}

}
