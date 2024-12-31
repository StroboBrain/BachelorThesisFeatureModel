/**
 * Implements the addition tasks
 */

package TaskCreation; 
import java.util.Random; 

public   class  TaskCreation {
	
	private int solution;

	
	private String taskAsString;

	
	private Random random  = new Random();

	
	
	private int chooseSolution  (int rangeMin, int rangeMax) {
		return rangeMin + random.nextInt((rangeMax - rangeMin) + 1); 
		}

	
	
	 public String createTask  (int rangeMin, int rangeMax, int solution) {
		int summand = rangeMin + random.nextInt((solution - rangeMin) + 1);
		return summand + "+" + (solution - summand);
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
