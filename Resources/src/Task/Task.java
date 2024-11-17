/**
 * This purpose of this class is to save the tasks. Some information is double stored
 * purpose to increase usability.
 * 
 */
package Task;

import java.util.ArrayList;
import java.util.Arrays;
// This library is used to evaluate mathematical expressions
import net.objecthunter.exp4j.*;


/* This class holds the task information
 * 
 * 
 * Precondition:
 * The constructor is called with a valid task of the format, that has a space between each number and operation.
 * Incorrect input is 
 * 
 * Postcondition:
 * Holds the task as string and list
 * 
 * Invariance:
 * A task is always valid
 * 
 */

public class Task {
    private String taskAsString;
    
    private ArrayList<String> taskList;
    private int solution; // Only works for basic tasks
    private ArrayList<String> operands;
    

    public ArrayList<String> getOperands() {
		return operands;
	}

	public void setOperands(ArrayList<String> operands) {
		this.operands = operands;
	}

	// Constructor
    public Task(String task, int i) {
        this.taskAsString = task;
        this.solution = i;
        this.taskList = generateTaskList(task);
        if (!validateTask()) {
        	 throw new IllegalArgumentException(task +" " + i + "are not valid");
        }
    }
    
    
    // Generates the list version of the string
    private ArrayList<String> generateTaskList (String task) {
    	        // Split the task string by spaces
    	        String[] parts = task.split(" ");
    	        
    	        // Create an ArrayList from the split parts
    	        ArrayList<String> taskList = new ArrayList<>(Arrays.asList(parts));
    	        
    	        return taskList;
    	    }
    
    // Checks if the constructed task is a valid task, public to make testing easier
    public boolean validateTask() {
    	String check = this.taskAsString;
    	if (check.length()<=6) {
    		return false;
    	}
    	else if (!check.contains("=")) {
    		return false;
    	}
    	check = getTaskWithoutEqual();
    	return evalString(check,this.solution);
    	
    }
    
    // Evaluates a String expression
    public boolean evalString(String check, int solution) {
    	try {
    		// Build the expression
    		Expression expression = new ExpressionBuilder(check).build();  
    		// Attempt to evaluate the expression (optional)
    	    if (expression.evaluate()==solution) {
    	    	return true;
    	    }
    	    else return false;
    	     } catch (Exception e) {
    	    	 // Catching exceptions that indicate an invalid expression
    	    	 System.out.println(e + "Error :" + check + " is an invalid expression");
    	    	 return false;
    	     }
    	
    	}
    
    
    // This function returns the task without the equal sign to be evaluated
    private String getTaskWithoutEqual() {
    	 return this.taskAsString.substring(0, this.taskAsString.length() - 1);
    }
 

    // Getter and Setter methods
    public String getTask() {
        return this.taskAsString;
    }

    public void setTask(String task) {
        this.taskAsString = task;
    }

    public ArrayList<String> getTaskList() {
        return this.taskList;
    }

    public void setTaskList(ArrayList<String> taskList) {
        this.taskList = taskList;
    }

    public int getSolution() {
        return this.solution;
    }

    public void setSolution(int solution) {
        this.solution = solution;
    }

    // Method to display task details
    public void displayTask() {
        System.out.println("Task: " + taskAsString);
        System.out.println("Task List: " + taskList);
        System.out.println("Solution: " + solution);
    }
}