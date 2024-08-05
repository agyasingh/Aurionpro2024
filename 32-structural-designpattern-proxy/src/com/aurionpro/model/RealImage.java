package com.aurionpro.model;

public class RealImage implements Image {
	private String filename;
	
	

	public RealImage(String filename) {
		super();
		this.filename = filename;
		loadImageFromDisk();
	}



	private void loadImageFromDisk() {
		// TODO Auto-generated method stub
		System.out.println("Loading image from disk " + filename);
	}



	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Displaying image " + filename);
	}

}
