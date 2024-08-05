package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class TaskList implements Task{
	

	private String title;
	List<Task> tasklist;
		
	public TaskList(String title) {
		super();
		this.title = title;
		this.tasklist = new ArrayList<>();
	}

	public void addtasksToList(Task task) {
		tasklist.add(task);
	}
	
	public void removetasksFromList(Task task){
		tasklist.remove(task);
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setTitle() {
		// TODO Auto-generated method stub
		this.title=title;
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Task list: " + title);
		for(Task task:tasklist){
			task.display();
		}
	}

}
