package com.vp.patterns.structural.facade;

public class Client {

	public static void main(String[] args) {
		HelperFacade facade = new HelperFacade();
		facade.generateReport(DBType.ORACLE);
		facade.generateReport(DBType.MYSQL);
	}
	


}
