package com.vp.patterns.structural.facade;

public class HelperFacade {

	public void generateReport(DBType dbType){
		switch(dbType){
		case ORACLE:
			OracleHelper.getConnection();
			OracleHelper.generateReport();
			break;
		case MYSQL:
			MSQLHelper.getConnection();
			MSQLHelper.generateReport();
			break;
		}
	}
}
