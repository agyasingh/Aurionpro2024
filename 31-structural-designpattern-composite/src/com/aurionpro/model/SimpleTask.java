package com.aurionpro.model;

public class SimpleTask implements Task {

	private String title;
	

	public SimpleTask(String title) {
		super();
		this.title = title;
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setTitle() {
		this.title=title;
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Simple task: " + title);
	}

}
