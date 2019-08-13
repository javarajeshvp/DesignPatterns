package com.vp.patterns.structural.proxy;

public class CommandExecutorProxy implements ICommandExecutor {

	private boolean isAdmin;
	private ICommandExecutor executor;

	public CommandExecutorProxy(String user, String pwd) {
		if ("Rajesh".equals(user) && "password1".equals(pwd)) {
			isAdmin = true;
		}
		executor = new CommandExecutorImpl();
	}

	public void runCommand(String cmd) throws Exception {
		if(isAdmin){
			executor.runCommand(cmd);
		}else{
			if(cmd.trim().startsWith("rm")){
				throw new Exception("rm command is not allowed for non-admin users.");
			}else{
				executor.runCommand(cmd);
			}
		}
	}
 
}
