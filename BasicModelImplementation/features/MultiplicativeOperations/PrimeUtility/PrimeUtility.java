package PrimeUtility;

/**
 *  Helper Class for prime utility for multiplicative operations
 */

import java.math.BigInteger;
import java.util.ArrayList;

public class PrimeUtility {

	//Checks if the number is prime
    public boolean isPrime(int number) {
        BigInteger bigInt = BigInteger.valueOf(number);
        return bigInt.isProbablePrime(1);
    }
    
    
    // 
    /**
     * precondition:
     * This function will only be called if the number is not prime.
     * 
     * postcondition:
     * returns an ArrayList with all factors other then 1 and the number itself
     */
    public ArrayList<Integer> factors (int number){
    	ArrayList<Integer> factorList = new ArrayList<Integer>();
    	int limit = (int) (number/2 + 1) ;
    	
    	for (int i = 2; i<=limit;i++) {
    		if (number%i==0) {
    			factorList.add(i);
    		}
    	}
    	assert factorList.size()>0: "Number " + number + " limit " + limit;
    	return factorList;
    	
    	//performance could be improved if needed
    }
    
    
}
