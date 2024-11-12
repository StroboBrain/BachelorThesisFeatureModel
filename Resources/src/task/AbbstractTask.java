package playground;

import java.util.ArrayList;

/*
 * The Task object holds the information of a task, some information is redundant on purpose,
 * to make the handling easier.
 * 
 * 
 * 
 * 
 * Design by contract
 */


public abstract class AbbstractTask implements TaskInterface {
		//Field for the task as String
		private String taskAsString;
		
		// Field for the task as ArrayList
		private ArrayList<String> taskAsList = new ArrayList<>();
		
		// Keep a separate list ArrayList of the used operations
		private ArrayList<String> operations = new ArrayList<>();
		
		private float solution;
		
		
	
	
    

    
    // Constructor
    public AbbstractTask(String task, float solution, ArrayList<String> operations ) {
    	this.operations = operations;
        this.taskAsString = task;
        this.solution = solution;
        
    }
    
    // Method to display the equation in console
    public void displayTask() {
        System.out.println("Equation: " + this.taskAsString);
    }
    
    
    // Getter and Setters

    // Getter method for task
    public String getTaskAsString() {
        return this.taskAsString;
    }

    // Setter method for task
    public void setTask(String task) {
        this.taskAsString = task;
    }
    
 // Getter method for solution
    public float getSolution() {
        return this.solution;
    }

    // Setter method for solution
    public void setSolution(float solution) {
        this.solution = solution;
    }
}
