package com.aurionpro.model;

public class DVDPlayer implements On {
	private int volume;
	

	public DVDPlayer(int volume) {
		super();
		this.volume = volume;
	}

	@Override
	public void On() {
		// TODO Auto-generated method stub
		System.out.println("Turning on DVD Player");
	}
	
	public void setVolume() {
		this.volume=volume;
	}
	
	public int getVolume() {
		return this.volume;
	}

}
