/**
 * TODO description
 */

package TaskCreation; 

import java.util.Random; 

public   class  TaskCreation {
	
	
	int solution;

	
	String taskAsString;

	
	
	private Random random  = new Random();

	
	
	private int chooseSolution  (int rangeMin, int rangeMax) {
		return rangeMin + random.nextInt((rangeMax - rangeMin) + 1); 
	}

	
	

	  public String createTask  (int rangeMin, int rangeMax, int solution) {
	        int summand = rangeMin + random.nextInt((solution - rangeMin) + 1);
	        return summand + "+" + (solution - summand);
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
