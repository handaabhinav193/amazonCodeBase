package amazonCodingPractise;

import java.util.Scanner;
/**
 *@Program = To check Pallindrome of a Number 
 */

public class PallindromeCodeNmbr {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Check Pallindrome Condition for Number: ");
		int inputNmbrToCheck = in.nextInt();
		
		int tempNo, sum =0, nmbrextracted;
		tempNo = inputNmbrToCheck;
		
		
		if(inputNmbrToCheck>10) {
			while(tempNo>0) {
				nmbrextracted = tempNo%10;
				sum = (sum*10)+nmbrextracted; 	
				tempNo = tempNo/10;		
			}
			
			if(sum == inputNmbrToCheck) {
				System.out.println("Number is Pallindrome");
			}else {
				System.out.println("Nmbr is NOT Pallindrome ");
			}
		}else {
			System.out.println("Enter atleast 2 Digit Number");
		}

	}

}
