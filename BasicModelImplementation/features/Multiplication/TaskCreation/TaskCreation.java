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
	
	
	public boolean isPrime(int check) {
		return false;
	}
	
	public ArrayList<Integer> factors (int number){
    	ArrayList<Integer> factorList = new ArrayList<Integer>();
    	return factorList;
    	
    }
	
	
	private int chooseSolution(int rangeMin, int rangeMax) {
		//Incresing the minimun so that there is a possible solution
		int possibleSolution = rangeMin + random.nextInt((rangeMax - rangeMin) + 1);
		for (int i = possibleSolution;i<=rangeMax;i++) {
			if (!this.primeUtility.isPrime(i)) {
				return i;
			}
		}
		for (int i = possibleSolution;i<=possibleSolution-rangeMin;i++) {
			
			if (!this.primeUtility.isPrime(possibleSolution-i)) {
				return possibleSolution-i;
			}
		}
		//We should always find a solution
		assert false : "No possible Solution";
		return -666;
		
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