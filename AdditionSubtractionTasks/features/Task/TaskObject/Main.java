package TaskObject;

/**
 * TODO description
 */
public class Main {
	public static void main(String[] args) {
    	TaskObject taskO = new TaskObject("5+3=",8);
    	String task = taskO.getTaskAsString();
        // Print a message to the console
        System.out.println(task);
    }

}