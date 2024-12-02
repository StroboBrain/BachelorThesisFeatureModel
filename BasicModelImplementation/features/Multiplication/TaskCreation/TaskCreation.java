package TaskCreation;

import java.util.ArrayList;
import java.util.Random;
import PrimeUtility.*;


/**
 * Creates Multiplication Solutions
 */


public class TaskCreation {
	
	private Random random = new Random();
	private PrimeUtility primeUtility = new PrimeUtility();
	

	private int chooseSolution(int rangeMin, int rangeMax) {
		//Incresing the minimun so that there is a possible solution
		int range = rangeMax-rangeMin;
		int possibleSolution = rangeMin + this.random.nextInt(range);
		// Change possibleSolution if too small or too big
		if (possibleSolution<rangeMin+ range / 10){
			possibleSolution += range / 10;
		}
		else if (possibleSolution> rangeMax - range / 10) {
			possibleSolution -= range / 10;
		}
		
		for (int i = possibleSolution; i<=rangeMax;i++) {
			if (!this.primeUtility.isPrime(i)) {
				return i;
			}
		}
		for (int i = possibleSolution;i>=rangeMin;i--) {
			if (!this.primeUtility.isPrime(possibleSolution-i)) {
				return possibleSolution-i;
			}
		}
		assert false : "A solution should always be found";
		return -10101;
	}
	
 
	 public String createTask(int rangeMin, int rangeMax, int solution) {
		 ArrayList<Integer> factorList = this.primeUtility.factors(solution);
		 int index = random.nextInt(factorList.size());
		 assert index>=0 : "Not working index" + index;
		 int firstFactor = factorList.get(index);
		 int secondeFactor = (int) solution/firstFactor;
		 assert firstFactor * secondeFactor == solution;
		 return firstFactor + "*" + secondeFactor + "=";
	       
	    }
	

}