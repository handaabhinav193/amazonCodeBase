package amazonCodingPractise;

import java.util.Scanner;

public class EncodingDecoding {

	public static void main(String[] args) {
		
		StringBuffer encode = new StringBuffer();
		
		Scanner in  = new Scanner(System.in);
		System.out.print("Enter data for Encoding: ");
		String dataIN = in.nextLine();
	
		int counter=1;
		String result="";
		
		char [] inCharArray = dataIN.toCharArray();
		
		for(int i=0;i<inCharArray.length;i++) {
			for(int j=i+1;j<inCharArray.length;j++) {
				if(inCharArray[i] == inCharArray[j]) {
					counter++;
				}else {
					result = encode.append(counter).append(inCharArray[i]).toString();
					counter=1;
				}
			}
			System.out.println(result);
		}
		
	}
}