package amazonCodingPractise;

import java.util.Scanner;

public class PrimeNmbrCheck {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Number to check if it is Prime: ");
		int inputNmbr = in.nextInt();
		
		int counter =0;
		for(int i = inputNmbr; i>=1;i--) {
			if(inputNmbr%i==0) {
				counter++;
			}
		}
		if(counter == 2) {
			System.out.println("Prime check Success: " +inputNmbr);
		}else {
			System.out.println("Prime check Failure: " +inputNmbr);
		}
				
	}

}
