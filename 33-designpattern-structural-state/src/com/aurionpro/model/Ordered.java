package com.aurionpro.model;

public class Ordered implements IPacketState {

	@Override
	public void next(Packet packet) {
		packet.setState(new Delivered());
	}

	@Override
	public void current() {
		// TODO Auto-generated method stub
		System.out.println("It is in the ordered state");
	}

	@Override
	public void previous(Packet packet) {
		// TODO Auto-generated method stub
		System.out.println("It has gone to previous state");
	}

}
