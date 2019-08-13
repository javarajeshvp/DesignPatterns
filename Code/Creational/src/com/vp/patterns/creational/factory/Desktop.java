package com.vp.patterns.creational.factory;

public class Desktop extends Computer{
	private String ram;
	private String hdd;
	
	public Desktop(String ram, String hdd){
		this.ram=ram;
		this.hdd=hdd;
	}
	
	@Override
	public String getRAM() {
		
		return "Desktop RAM : " + ram;
	}

	@Override
	public String getHDD() {
	
		return "Desktop HDD :" + hdd;
	}

}
