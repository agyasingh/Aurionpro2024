package com.auionpro.model;

//invoker-sender-hold command-trigger
public class RemoteControl {
	private Command command;
	
	public void setCommand(Command command) {
		this.command=command;
	}
	
	public void pressButton() {
		command.execute();
	}

}
