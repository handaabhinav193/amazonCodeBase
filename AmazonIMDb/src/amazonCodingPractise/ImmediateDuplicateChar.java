package amazonCodingPractise;

import java.util.Scanner;

public class ImmediateDuplicateChar {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter String with immediate duplicate characters: ");
		String inputStr = in.nextLine();
		
		char inChArr [] = inputStr.toCharArray();
		
		int counter =1;
		
		for(int i=0; i<inChArr.length;i++) {
			
			char key = inChArr[i];
			
			for(int j=1;j<inChArr.length;j++) {
				if(key == inChArr[j]) {
					counter++;
				}else {
					break;
					}
			}
			System.out.println(counter);
		}	
		
		counter=0;
	}
}