package TaskObject;
import TaskCreation.*;

/**
 * The Main class creates the different task and uses the standart methodes, that all different features use
 */
public class Main {
	
	
	
	private int minRange = -1;
	private int maxRange = -1;
	
	public static void main(String[] args) {
		//Loop to generate different tasks
		for (int i = 0;i<10;i++) {
		Main mainInstance = new Main();
		TaskCreation taskCreator = new TaskCreation(mainInstance.minRange, mainInstance.maxRange);
    	TaskObject taskO = new TaskObject(taskCreator.getTaskAsString(),taskCreator.getSolution());
    	String task = taskO.getTaskAsString();
    	
        // Print a task in the console
        System.out.println(task);
        try { 
        // Introducing a 2-second delay 
        Thread.sleep(1600); } 
        catch (InterruptedException e) { e.printStackTrace(); }
        }
		
		
    }

}