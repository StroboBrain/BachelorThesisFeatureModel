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
		int solution = this.random.nextInt(rangeMax-5);
		
		return solution; 
	}

	
	
	 public String createTask  (int rangeMin, int rangeMax, int solution) {
		// Generate a random number between rangeMin (inclusive) and rangeMax (inclusive)
		int summandBig = solution + random.nextInt(rangeMax-solution + 1);
		int summandSmall = summandBig - solution;
		
		return summandBig + "-" + summandSmall;
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
