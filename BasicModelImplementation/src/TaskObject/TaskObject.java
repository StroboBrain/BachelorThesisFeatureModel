package TaskObject; 



import java.util.*; 
// This library is used to evaluate mathematical expressions
import net.objecthunter.exp4j.*; 
import java.util.regex.Matcher; 
import java.util.regex.Pattern; 


/* This class holds the task information
 * 
 * 
 * Precondition:
 * The constructor is called with a valid task of the format.
 * Format: No spaces in tasks 
 * 
 * Postcondition:
 * Holds the task as string and list
 * 
 * Invariance:
 * A task is always valid
 * 
 */

public  class  TaskObject {
	
	
    private String taskAsString;

	
    private ArrayList<String> taskList;

	
    private int solution;

	 // Only works for basic tasks
    private ArrayList<String> operands;

	
    
    
    public ArrayList<String> getOperands() {
		return operands;
	}

	

	public void setOperands(ArrayList<String> operands) {
		this.operands = operands;
	}

	
	

	// Constructor
    public TaskObject(String task, int solution) {
        this.taskAsString = task;
        // Add "=" if not in task
        this.makeTasksUniform();
        this.solution = solution;
        this.taskList = generateTaskList(task);
        
        //Throws IllegalArgumentException if it is not a valid Task
        if (!validateTask()) {
        	 throw new IllegalArgumentException(task + solution + "is not valid");
        }
    }

	
    
    
    // Generates the list version of the string, some trouble With arraystings
    
    private ArrayList<String> generateTaskList (String task) {
    	ArrayList<String> taskAsList = new ArrayList<String>();
    	Pattern pattern = Pattern.compile("\\d+|\\+|\\-|\\*|\\/|\\=");
    	Matcher matcher = pattern.matcher(task);
    	while (matcher.find()) {
    		taskAsList .add(matcher.group());
    		}
            return taskAsList ;
    }

	

    
    // Adds an equal sign, if there is none in the task
    private void makeTasksUniform(){
    	if (!this.taskAsString.contains("=")) {
    		this.taskAsString += "=";
    	}
    }

	
    
    // Checks if the constructed task is a valid task
    private boolean validateTask() {
    	String check = this.taskAsString;
    	
    	if (!check.contains("=")) {
    		return false;
    	}
    	else 
    	check = getTaskWithoutEqual();
    	return evalString(check,this.solution);
    	
    }

	
    
    // Checks if the solution is corret
    
    public boolean checkSolution(int result) {
    	return result==this.solution;
    }

	
    
    // Evaluates a String expression
    private boolean evalString(String expression, int solution) {
    	Expression exp = new ExpressionBuilder(expression).build();
    	int result = (int) exp.evaluate();
    	
    	return result == solution;
    }

	

    
    
    // This function returns the task without the equal sign to be evaluated
    private String getTaskWithoutEqual() {
    	String check = this.taskAsString;
    	
    	//String should never be empty or null when this function is called
    	assert check != null && !check.isEmpty() : "String is null or empty"; 
    	// Assert that the last character is '=' 
    	assert check.charAt(check.length() - 1) == '=' : "The last character is not an equal sign";
    	
    	if (check.contains("=")) {
    		
    		return check.substring(0, check.length() - 1);	
    	}
    	//If there is no equal sing, return the this.taskAsString unchanged
    	return check;
    }

	
    
    
 

    public String getTaskAsString() {
        return this.taskAsString;
    }

	

    public int getSolution() {
        return this.solution;
    }

	
    
    public ArrayList<String> getTaskAsList(){
    	return this.taskList;
    }


}
