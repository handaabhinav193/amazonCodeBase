package amazonCodingPractise;

import java.util.Scanner;

/**
 *@Program = To show to ways to check Pallindrome of a String 
 */

public class PallindromeCodeString {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Check Pallindrome Condition for String: ");
		String inputString = in.nextLine();
		
		String resultantRevStr;
		
		StringBuffer sb = new StringBuffer(inputString);
		resultantRevStr = sb.reverse().toString();	
		
		if(resultantRevStr.equals(inputString)) {
			System.out.println("Pallindrome Condition Success");
		}else {
			System.out.println("Pallindrome condition Failure");
		}
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter String to check its Pallindrome: ");
		String inputStr = input.nextLine();
		
		String reverStr="";
		
		char [] a;
		a = inputStr.toCharArray();
		
		for(int i=a.length-1; i>=0;i--) {
			reverStr = reverStr + Character.toString(a[i]);
		}
		if(reverStr.equals(inputStr)) {
			System.out.println("Pallindrome Condition Success");
		}else {
			System.out.println("Pallindrome condition Failure");
		}

	}

}
