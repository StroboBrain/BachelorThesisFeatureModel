package TaskObject;
import TaskCreation.*;

/**
 * TODO description
 */
public class Main {
	
	
	
	private int minRange = -1;
	private int maxRange = -1;
	
	public static void main(String[] args) {
		for (int i = 0;i<100;i++) {
		Main mainInstance = new Main();
		TaskCreation taskCreator = new TaskCreation(mainInstance.minRange, mainInstance.maxRange);
    	TaskObject taskO = new TaskObject(taskCreator.getTaskAsString(),taskCreator.getSolution());
    	String task = taskO.getTaskAsString();
        // Print a message to the console
        System.out.println(task);
        try { 
        // Introducing a 2-second delay 
        Thread.sleep(2000); } 
        catch (InterruptedException e) { e.printStackTrace(); }
        }
		
		
    }

}