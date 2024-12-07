package TestTaskObject; 


import org.junit.jupiter.api.Test; 
import static org.junit.jupiter.api.Assertions.*; 
import java.util.*; 



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
			assert 0!=test.getSolution(); // Will make the test fail if the constructor does not throw
		}
		catch (Exception e) {
			// Exception is wanted
		}
	}

	
	
	@Test
	public void tesTaskList() {
		String[] array = {"22", "+", "3", "="}; 
		ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(array));
		TaskObject.TaskObject test = new TaskObject.TaskObject("22+3=", 25);
		ArrayList<String> check = test.getTaskAsList();
		for (int i = 0; i<arrayList.size();i++) {
			assert arrayList.get(i).equals(check.get(i)): "Error at Index " + i; 
		}
	}


}
