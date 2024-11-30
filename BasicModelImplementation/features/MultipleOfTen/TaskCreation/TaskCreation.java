/**
 * Creates a multiple of ten version of the task
 */

package TaskCreation;

import java.util.ArrayList;
import TaskObject.*;
import net.objecthunter.exp4j.*;


public class TaskCreation {
	
	// Helper methodes to decide if a string is numeric
	private boolean isNumeric(String str) { 
		  try {  
		    Double.parseDouble(str);  
		    return true;
		  } catch(NumberFormatException e){  
		    return false;  
		  }  
		}
	
	//Returns a Task with the desired multiple of tens.
	public TaskObject multipleOfTen(TaskObject taskObject, int addZero) {
		ArrayList<String> taskAsList = taskObject.getTaskAsList();
		assert taskAsList.get(taskAsList.size()-1).equals("="): taskAsList.toString() + taskAsList.get(taskAsList.size()-1);
		String newTask = "";
		//-1 because we do not want the "="
		for (int i = 0; i<taskAsList.size()-1;i++) {
			String temp = taskAsList.get(i);
			if (this.isNumeric(temp)) {
				for (int k=0; k<addZero;k++) {
					temp += "0";
				}
			
			}
			newTask += temp;
		}
	
		Expression exp = new ExpressionBuilder(newTask).build();
		int solution = (int) exp.evaluate();
		
		return new TaskObject(newTask,solution);
		}
	
}