/**
 * Creates a multiple of ten version of the task
 */

package TaskObject;

import java.util.ArrayList;
import net.objecthunter.exp4j.*;


public class TaskObject {
	
	private String taskAsString;
    private int solution; // Only works for basic tasks
    private ArrayList<String> taskList;
    
    
	
	// Helper methodes to decide if a string is numeric
	private boolean isNumeric(String str) { 
		  try {  
		    Double.parseDouble(str);  
		    return true;
		  } catch(NumberFormatException e){  
		    return false;  
		  }  
		}
	
	//Returns a Task with the desired multiple of tens. Hardcoded to 10 at the moment
	public void multipleOfTen() {
		//Hardcoded at the moment Could be multiple of 100 as well
		int addZero = 1;
		String newTask = "";
		//-1 because we do not want the "="
		for (int i = 0; i<this.taskList.size()-1;i++) {
			String temp = taskList.get(i);
			if (this.isNumeric(temp)){
				if ((Integer.parseInt(temp))!=0){
					for (int k=0; k<addZero;k++) {
					temp += "0";
					}
				}
				this.taskList.set(i,temp);
			}
			newTask += temp;
		}
		Expression exp = new ExpressionBuilder(newTask).build();
		this.solution = (int) exp.evaluate();
		this.taskAsString = newTask +"=";
		
	}
	
}