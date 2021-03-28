package amazonCodingPractise;

import java.util.Scanner;

public class FactorialOfNmbr {

	public static void main(String[] args) {
		
		Scanner in  = new Scanner(System.in);
		System.out.print("Find factorial of Number: ");
		int inputNmbr = in.nextInt();
		int factorialSum =1;
		
		for(int i = inputNmbr;i>=1;i--) {
			factorialSum = factorialSum*i;
		}
		
		System.out.print("Factorial of Number :" +factorialSum);

	}

}
