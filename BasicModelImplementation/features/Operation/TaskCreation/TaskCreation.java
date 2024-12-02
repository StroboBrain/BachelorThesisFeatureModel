package TaskCreation;

/**
 * This is similar to an abstract class. Holds the the methodes that will be overwritten
 * 
 */


import java.util.Random;

public class TaskCreation {
	
	int solution;
	String taskAsString;
	Random random = new Random();
	
	private int chooseSolution(int rangeMin, int rangeMax){
		return 10101; // Specific number is chosen to ease debugging
	}
	
	private String createTask(int rangeMin, int rangeMax, int solution){
		
		return "11+11="; // Specific number is chosen to ease debugging
	}
	
	
	// Will use the methodes to create the desired Task
	public TaskCreation(int rangeMin, int rangeMax) {
		this.solution = this.chooseSolution(rangeMin,rangeMax);
		this.taskAsString = this.createTask(rangeMin, rangeMax, this.solution);
		
	}
	
	
	public String getTaskAsString() {
		return this.taskAsString;
	}
	
	public int getSolution() {
		return this.solution;
	}
}