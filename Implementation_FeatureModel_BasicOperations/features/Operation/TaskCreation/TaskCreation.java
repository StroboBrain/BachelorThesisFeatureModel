package TaskCreation;

/**
 * This is similar to an abstract class. Holds the the methodes that will be overwritten
 * 
 */


import java.util.Random;

public class TaskCreation {
	private int solution;
	private String taskAsString;
	private Random random;
	
	private int chooseSolution(int rangeMin, int rangeMax){
		return 10101; // Specific number for debugging
	}
	private String createTask(int rangeMin, int rangeMax, int solution){
		return "101+101="; //Specific String for debugging
	}
	// creates the specific tasks
	public TaskCreation(int rangeMin, int rangeMax) {
		this.solution = this.chooseSolution(rangeMin,rangeMax);
		this.taskAsString = this.createTask(rangeMin, rangeMax, this.solution);	
	}
	// Getter and Setters
	public String getTaskAsString() {
		return this.taskAsString;
	}
	public int getSolution() {
		return this.solution;
	}
}