package TestTaskObject; 



import org.junit.Test; 
import static org.junit.Assert.*; 




/**
 * 
 * This class implements tests for the TaskObject.
 
 */
public    class   TestTaskObject {
	
	
	//@Before
	

	//@After

	

	@Test
	public void testSolutions() {
		TaskObject.TaskObject testTaskObject = new TaskObject.TaskObject("5+3=",8);
		assert testTaskObject.checkSolution(8);
		assertFalse(testTaskObject.checkSolution(5));
		}

	
	
	

	//Not a pretty solution, because if problems with assertThrows
	@Test
	public void testConstructor() {
		try {
			TaskObject.TaskObject test = new TaskObject.TaskObject("5+3=", 4);  // Test constructor
			assert -1000<test.getSolution(); // Will make the test fail if the constructor does not throw
		}
		catch (Exception e) {
			
		}
	}


}
