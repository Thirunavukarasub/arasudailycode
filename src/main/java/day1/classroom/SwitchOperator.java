package day1.classroom;

public class SwitchOperator {

	/*
	 * Goal: Perform calculation based on the user input operations
	 * 
	 * inputs: 2,3 and "add"
	 * output: added value: 5
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a Switch case: type 'switch', followed by: ctrl + space + down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)
	 * 2)
	 * 3) 
	 * 
	 */	

	public static void main(String[] args) {
		int i=2, j=5;
		String text="sub";
		int result = 0; 
		switch (text) {
		case "add":
			System.out.println(i+j);
			result = i+j;
			break;
		case "sub":
			System.out.println(i-j);
			result = i-j;
			break;
		case "mul":
			System.out.println(i*j);
			result=i*j;
			break;
		case "div":
			System.out.println(i/j);
			result=i/j;
			break;
		
		default:
			System.out.println("not valid");
			break;
		}


		// Declare 2 integer numbers


		// Declare a String variable with input as operations (Tip:


		// Initiate switch case for operations


		// Within switch, include as case for add operation


		// Within switch, include as case for sub operation


		// Within switch, include as case for mul operation


		// Within switch, include as case for div operation


		// Within switch, include 'default' to handle other operations


		//end of switch case

	}

}
