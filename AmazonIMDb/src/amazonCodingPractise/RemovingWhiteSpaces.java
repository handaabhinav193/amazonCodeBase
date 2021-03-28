package amazonCodingPractise;

import java.util.Scanner;

public class RemovingWhiteSpaces {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Remove whitespaces from: ");
		String inputStr = in.nextLine();
		int counter=0;
		String opStr = "";
		
		for(int i=0;i<inputStr.length();i++) {
			if(inputStr.charAt(i)!= ' ') {
				opStr = opStr +inputStr.charAt(i);
			}else {
				counter++;
			}
		}
		System.out.println("User String without whiteSpaces: " +opStr);
		System.out.println("Total whitespaces in User String: " +counter);
	}

}
