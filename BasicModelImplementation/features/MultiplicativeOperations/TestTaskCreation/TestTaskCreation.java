package TestTaskCreation;

/**
 * Tests the methods from MultiplicativeOperations TaskCreation
 */


import org.junit.jupiter.api.Test; 
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class TestTaskCreation {	
	@Test
	public void testPrimenumber() {
		TaskCreation.TaskCreation testCreation = new TaskCreation.TaskCreation(0,0);
		assert(testCreation.isPrime(7));
		assertFalse(testCreation.isPrime(8));
		}
	
	@Test
	public void testFactors() {
		TaskCreation.TaskCreation testCreation = new TaskCreation.TaskCreation(0, 0);
		ArrayList<Integer> checkList = new ArrayList<Integer>(Arrays.asList(2, 4));
		assert testCreation.factors(8).equals(checkList);
		checkList = new ArrayList<Integer>(Arrays.asList(2,7));
		assert testCreation.factors(14).equals(checkList);
		}
	
	
	
	
}
