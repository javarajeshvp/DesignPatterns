package com.vp.patterns.creational.abstractfactory;

import com.vp.patterns.creational.factory.Computer;

public class Client {

	public static void main(String[] args) {
		Computer computer = ComputerFactory.getComputer(new LaptopFactory("5000", "SDD"));
		System.out.println("computer : " + computer);

		computer = ComputerFactory.getComputer(new DesktopFactory("5000", "SDD"));
		System.out.println("computer : " + computer);
	}

}
