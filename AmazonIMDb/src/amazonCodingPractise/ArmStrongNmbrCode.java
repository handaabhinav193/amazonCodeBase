package amazonCodingPractise;

import java.util.Scanner;

public class ArmStrongNmbrCode {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Is this ArmStrong Nmber: ");
		int inputNmbr= in.nextInt();
		
		int tempNo, sum = 0, noExtracted;
		tempNo = inputNmbr;
		if(tempNo>0){
			while(tempNo>0) {
				noExtracted = tempNo%10;
				sum = sum +(noExtracted*noExtracted*noExtracted);
				tempNo = tempNo/10;
			}
			
			if(sum == inputNmbr) {
				System.out.println("ArmStrong Number Success: " +inputNmbr);
			}else {
				System.out.println("ArmStrong Number Failure: " +inputNmbr);
			}
		}else {
			System.out.println("Enter number greater than 0");
		}

	}

}
