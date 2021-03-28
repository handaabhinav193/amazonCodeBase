package amazonCodingPractise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		//0,1,1,2,3,5,8,13,21
		
		Scanner in = new Scanner(System.in);
		System.out.print("Find Fibonacci Series of maximum ");
		int inputMaxNo = in.nextInt();
		
		List<Integer> fiboSeries = new ArrayList();
		
		int firstNmbr = 0;
		int secondNmbr = 1;
		fiboSeries.add(firstNmbr);
		fiboSeries.add(secondNmbr);
	
		int sum = 0;
		
		for(int i =1;i<=inputMaxNo;i++) {
			sum = firstNmbr + secondNmbr;
			fiboSeries.add(sum);
			firstNmbr = secondNmbr;
			secondNmbr = sum;
		}
		System.out.println("Fibonacci Series for max " +inputMaxNo+ " number is: " +fiboSeries);
		
		
	}

}
