package TaskCreation; 

/**
 * Tests the methods from MultiplicativeOperations PrimeUtility
 */


import org.junit.jupiter.api.Test;  
import static org.junit.jupiter.api.Assertions.*; 
import java.util.*;
import TaskObject.*;

public  class  TestMultipleOfTenTaskCreation {
		
	@Test
	void multipleOfTen() {
		TaskObject testObject = new TaskObject("2+3=",5);
		TaskCreation taskCreator = new TaskCreation(0,100);
		TaskObject compare = taskCreator.multipleOfTen(testObject, 1);
		assert compare.getSolution()==50: compare.getTaskAsString();
		
		}

	



}
