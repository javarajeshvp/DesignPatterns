package com.vp.patterns.creational.abstractfactory;

import com.vp.patterns.creational.factory.Computer;

public class ComputerFactory {
	public static Computer getComputer(AbstractFactory factory){
		return factory.createComputer();
	}
}
    