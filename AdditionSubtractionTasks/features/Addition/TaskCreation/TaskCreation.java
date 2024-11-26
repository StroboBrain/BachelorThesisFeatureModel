/**
 * TODO description
 */

package TaskCreation;

import java.util.Random;

public class TaskCreation {
	
	private Random random = new Random();
	
	private int chooseSolution(int rangeMin, int rangeMax) {
		return rangeMin + random.nextInt((rangeMax - rangeMin) + 1); 
	}
	


	 public String createTask(int rangeMin, int rangeMax, int solution) {
	        int summand = rangeMin + random.nextInt((solution - rangeMin) + 1);
	        return summand + "+" + (solution - summand);
	    }
	

}