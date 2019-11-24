package day2.classroom.str;

public class CharacterOccurance {


	public static void main(String[] args) {

		// Here is the input
		String test = "I am getting better with Java";
		char[] array = test.toCharArray();
		char ch = 't';
		int totalCount = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i]== ch) {
				totalCount= totalCount+1;
			}
			else {
				System.out.println("not available");
			}
			break;		
		}
		System.out.println("Total count of character("+ch+"): " + totalCount);

	}

	// Here is what the count you need to find

	// Build the logic to find the count of each
	/* Pseudo Code:
			a) Convert the String to character array
			b) Traverse through each character (using loop)
			c) If the given character matches the expected character (ch),
			   Then, increment totalCount
	 */










	// Print the count here

}


