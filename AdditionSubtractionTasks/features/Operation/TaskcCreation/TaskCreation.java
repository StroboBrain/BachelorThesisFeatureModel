package TaskcCreation;

/**
 * TODO description
 */


import java.util.Random;

public class TaskCreation {
	
	int solution;
	String task;
	
	private int chooseSolution(int rangeMin, int rangeMax){
		return 10101; // Specific number is chosen to ease debugging
	}
	
	private String createTask(int rangeMin, int rangeMax, int solution){
		
		return "11+11="; // Specific number is chosen to ease debugging
	}
	
	
	
	public TaskCreation(int rangeMin, int rangeMax) {
		this.solution = this.chooseSolution(rangeMin,rangeMax);
		this.task = this.createTask(rangeMin, rangeMax, this.solution);
		
	}
}