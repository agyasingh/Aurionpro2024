package com.aurionpro.model;

public class Received implements IPacketState {

	@Override
	public void next(Packet packet) {
		// TODO Auto-generated method stub
		System.out.println("");

	}

	@Override
	public void current() {
		// TODO Auto-generated method stub
		System.out.println("It is in received state");

	}

	@Override
	public void previous(Packet packet) {
		// TODO Auto-generated method stub
        packet.setState(new Delivered());
	}

	

}
