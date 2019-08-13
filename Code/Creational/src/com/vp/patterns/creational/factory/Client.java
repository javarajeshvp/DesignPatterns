package com.vp.patterns.creational.factory;

public class Client {

	public static void main(String[] args) {
		Computer computer = ComputerFactory.getComputer("Laptop", "5000", "SDD");
		System.out.println("computer : " + computer);

		computer = ComputerFactory.getComputer("Desktop", "1000", "HDD");
		System.out.println("computer :  " + computer);
	}

}
