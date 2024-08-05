package com.aurionpro.model;

public class PlayerApp {
	private int playerId;
	private String name;
	private int numberOfMatches;
	private int runs;
	private int numberOfWickets;
	private double average;
	
	public PlayerApp(int playerId, String name,int numberOfMatches,int runs,int numberOfWickets) {
		this.playerId=playerId;
		this.name=name;
		this.numberOfMatches=numberOfMatches;
		this.runs=runs;
		this.numberOfWickets=numberOfWickets;
	}
	
	public void setPlayerId(){
		this.playerId=playerId;
	}
	
	public void setName() {
		this.name=name;
	}
	
	public void setNumberOfMatches() {
		this.numberOfMatches=numberOfMatches;
	}
	
	public void setRuns() {
		this.runs=runs;
	}
	
	public void setNumberOfWickets() {
		this.numberOfWickets=numberOfWickets;
	}
	
	
	public int getPlayerId() {
		return this.playerId;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getNumberOfMatches() {
		return this.numberOfMatches;
	}
	
	public int getRuns() {
		return runs;
	}
	
	public int getNumberOfWickets() {
		return this.numberOfWickets;
	}
	
	public double calculateAverage() {
		average= this.runs /this.numberOfMatches;
		return this.average;
	}
	
	public void display() {
		System.out.println("The player id is" + " " +getPlayerId());
		System.out.println("The name of the player is" + " " + getName());
		System.out.println("The number of matches is" + " " + getNumberOfMatches());
		System.out.println("The runs are" + " " + getRuns());
		System.out.println("The number of wickets are" + getNumberOfWickets());
	}
	
	

}

