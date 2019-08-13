package com.vp.patterns.structural.proxy;

public class Client {
	public static void main(String[] args){
		ICommandExecutor executer =  new CommandExecutorProxy("Rajesh","password1");
		
		try {
			executer.runCommand("dir");
			executer.runCommand("rm");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
