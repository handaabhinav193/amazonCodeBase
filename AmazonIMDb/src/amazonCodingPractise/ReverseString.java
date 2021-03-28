package amazonCodingPractise;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		/**
		 * @Function: Reversing each word of the String and NOT complete String
		 */

			Scanner inputString = new Scanner(System.in);
			System.out.print("Enter String required to be reversed: ");
			String inString = inputString.nextLine();
			
			String orginalStrArr [] = inString.split("\\s");
			
			String revStr = "";
			
			for(int i=0;i<orginalStrArr.length;i++) {			
				revStr = revStr + new StringBuffer(orginalStrArr[i]).reverse().toString() + " ";
				
			}
			System.out.println("Reversed String: " +revStr);
	}

}