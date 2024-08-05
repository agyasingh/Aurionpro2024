package com.aurionpro.model;

public class Delivered implements IPacketState {

	@Override
	public void next(Packet packet) {
		// TODO Auto-generated method stub
		packet.setState(new Received());
	}

	@Override
	public void current() {
		// TODO Auto-generated method stub
		System.out.println("it is in delivered state");

	}

	
	@Override
	public void previous(Packet packet) {
		// TODO Auto-generated method stub
		packet.setState(new Ordered());

	}

}
