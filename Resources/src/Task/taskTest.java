package Task;

import static org.junit.Assert.assertThrows;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class taskTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSolution() {
		Task testTask = new Task("2 + 5 =",7);
		assert(testTask.getSolution()==7);
	}
	
	@Test
    public void testInvalidSolutingThrowsException() {
        // Use assertThrows to check if IllegalArgumentException is thrown
        assertThrows(IllegalArgumentException.class, () -> {
            new Task("2 + 5 =",3);; // This should throw an IllegalArgumentException
        });
	}



}
