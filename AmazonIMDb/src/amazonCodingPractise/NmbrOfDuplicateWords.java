package amazonCodingPractise;

import java.util.Scanner;

public class NmbrOfDuplicateWords {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.print("Find duplicate words in the User Input String: ");
		String inputStr = in.nextLine();
		
		String inputStrArr []=  inputStr.split("\\s");
		int count;
		System.out.println("Duplicate words & their count:");
		
		
		for(int i=0;i<inputStrArr.length;i++) {
			count =1;
			
			if(inputStrArr[i].equals("0")) {
				continue;
			}else {
				for(int j = i+1; j<inputStrArr.length;j++) {
					if(inputStrArr[i].equals(inputStrArr[j])) {
						count++;
						inputStrArr[j]="0";
					}
				}
			}
			if(count>1) {
				System.out.print(inputStrArr[i]+"= "+count+ "  ");
			}
		}
		
	}
}