/**
 * TODO description
 */

package TaskCreation;

import java.util.Random;

public class TaskCreation {
	
	private Random random = new Random();
	
	private int chooseSolution(int rangeMin, int rangeMax) {
		int solution = this.random.nextInt(rangeMax-5);
		
		return solution; 
	}
	
	public String createTask(int rangeMin, int rangeMax, int solution) {
		// Generate a random number between rangeMin (inclusive) and rangeMax (inclusive)
		int summandBig = solution + random.nextInt(rangeMax-solution + 1);
		int summandSmall = summandBig - solution;
		
		return summandBig + "-" + summandSmall;
	    }
	    
	    

	 
}