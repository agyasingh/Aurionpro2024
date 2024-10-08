package com.aurionpro.test;

import com.aurionpro.model.SimpleTask;
import com.aurionpro.model.Task;
import com.aurionpro.model.TaskList;

public class TaskManagementApp {
	public static void main(String[] args) {
		Task simpletask1=new SimpleTask("Coding");
		Task simpletask2=new SimpleTask("Documentation");
		
		TaskList projecttasks=new TaskList("Project tasks");
		projecttasks.addtasksToList(simpletask1);
		projecttasks.addtasksToList(simpletask2);
		
		TaskList phase1tasks=new TaskList("Phase 1 tasks");
		phase1tasks.addtasksToList(new SimpleTask("Design"));
		phase1tasks.addtasksToList(new SimpleTask("Implementation"));
		
		projecttasks.addtasksToList(phase1tasks);
		
		projecttasks.display();
	}
	

}
