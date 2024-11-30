package PrimeUtility;

/**
 * Tests the methods from MultiplicativeOperations PrimeUtility
 */


import org.junit.jupiter.api.Test; 
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class TestPrimeUtility {	
	@Test
	public void testPrimenumber() {
		PrimeUtility testUtil = new PrimeUtility();
		assert(testUtil.isPrime(7));
		assertFalse(testUtil.isPrime(8));
		}
	
	@Test
	public void testFactors() {
		PrimeUtility testUtil = new PrimeUtility();
		ArrayList<Integer> checkList = new ArrayList<Integer>(Arrays.asList(2, 4));
		assert testUtil.factors(8).equals(checkList) : testUtil.factors(8);
		checkList = new ArrayList<Integer>(Arrays.asList(2,7));
		assert testUtil.factors(14).equals(checkList) : testUtil.factors(14);
		}
	
}