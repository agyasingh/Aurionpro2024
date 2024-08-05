package com.auionpro.model;
//concrete command
public class TurnOnCommand implements Command {
	private TV tv;
	
	

	public TurnOnCommand(TV tv) {
		super();
		this.tv = tv;
	}



	@Override
	public void execute() {
		// TODO Auto-generated method stub
		tv.turnOn();
		System.out.println("Turning on TV");
	}

}
