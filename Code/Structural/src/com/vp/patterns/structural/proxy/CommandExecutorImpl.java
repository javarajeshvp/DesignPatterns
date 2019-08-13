package com.vp.patterns.structural.proxy;

public class CommandExecutorImpl implements ICommandExecutor {

	@Override
	public void runCommand(String cmd) throws Exception {
		// some heavy implementation
		Runtime.getRuntime().exec(cmd);
		System.out.println("'" + cmd + "' command executed.");

	}

}
