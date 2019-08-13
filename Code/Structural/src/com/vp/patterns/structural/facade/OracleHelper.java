package com.vp.patterns.structural.facade;

import java.sql.Connection;

public class OracleHelper {
	public static Connection getConnection(){
		System.out.println("OracleHelper.getConnection");
		return null;
	}
	public static String generateReport(){
		System.out.println("OracleHelper.generateReport");
		return null;
	}
		
	
}
