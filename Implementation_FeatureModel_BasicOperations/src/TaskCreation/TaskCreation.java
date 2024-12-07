package TaskCreation; 
import java.util.Random; 

import java.util.ArrayList; 
import java.util.Collections; 
import PrimeUtility.*; 


/**
 * Creates Division solutions
 */


public   class  TaskCreation {
	
	
	int solution;

	
	String taskAsString;

	
	
	private Random random  = new Random();

	
	
	private int chooseSolution  (int rangeMin, int rangeMax) {
	    // Increasing the minimum so that there is a possible solution
	    int range = rangeMax - rangeMin;
	    int possibleSolution = rangeMin + this.random.nextInt(range);
	    // Change possibleSolution if too small or too big
	    if (possibleSolution < rangeMin + range / 10) {
	        possibleSolution += range / 10;
	    } else if (possibleSolution > rangeMax - range / 10) {
	        possibleSolution -= range / 10;
	    }
	    while (possibleSolution*2>rangeMax) {
	    	possibleSolution--;
	    }
	    return possibleSolution;
	}

	

 
	  public String createTask  (int rangeMin, int rangeMax, int solution) {
		 int maxMultiplier = (int) (rangeMax/solution);
		 int secondeFactor = this.random.nextInt(maxMultiplier)+1;
		 int firstFactor = secondeFactor * solution;
		 
		 return firstFactor + "/" + secondeFactor;
	       
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

	
	private PrimeUtility primeUtility = new PrimeUtility();


}
