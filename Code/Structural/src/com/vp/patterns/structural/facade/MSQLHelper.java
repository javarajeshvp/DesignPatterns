package com.vp.patterns.structural.facade;

import java.sql.Connection;

public class MSQLHelper {
	public static Connection getConnection(){
		System.out.println("MSQLHelper.getConnection");
		return null;
	}
	
	public static String generateReport(){
		System.out.println("MSQLHelper.generateReport");
		return null;
	}
}
