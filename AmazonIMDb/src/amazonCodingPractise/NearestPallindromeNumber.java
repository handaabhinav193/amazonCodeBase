package amazonCodingPractise;

import java.util.Scanner;

public class NearestPallindromeNumber {

	public static void main(String[] args) {
		
		Scanner in  = new Scanner(System.in);
		System.out.print("Find nearest greater pallindrome: ");
		int inputNo = in.nextInt();
		int extN, sum=0;
		int toCheckFrom = inputNo+1;
		int counter =0;
		int nearestHigherPal = 0;
		
		while(counter == 0) {
			while(toCheckFrom>0) {
				extN = toCheckFrom%10;
				sum = (sum*10)+extN;
				toCheckFrom = toCheckFrom/10;
				}
			
			if(toCheckFrom==sum) {
				counter++;
				nearestHigherPal = sum;
				break;
			}else {
				++toCheckFrom;
				continue;
			}
		}
		System.out.println(nearestHigherPal);
	}
}