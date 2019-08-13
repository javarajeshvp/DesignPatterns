package com.vp.patterns.creational.singleton;

public class Singleton {

	private static Singleton instance ; 
	private Singleton(){
		
	}
	
	public Singleton getInstance(){
		if(instance == null){
			instance = new Singleton();
		}
		return instance;
	}
	
}
