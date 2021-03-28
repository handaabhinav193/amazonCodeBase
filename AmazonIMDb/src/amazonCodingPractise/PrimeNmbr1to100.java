/**
 * 
 */
package amazonCodingPractise;

import java.util.ArrayList;
import java.util.List;

/**
 * @author handa
 *
 */
public class PrimeNmbr1to100 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Integer> primeNmbr = new ArrayList();
		for(int i = 1; i<=100;i++) {
			int counter=0;
			for(int j=i;j>=1;j--) {
				if(i%j==0) {
					counter++;
				}
			}
			if(counter==2) {
				primeNmbr.add(i);
			}
		}
		System.out.println("Total Numbers of Prime Numbers 1 to 100 :" +primeNmbr.size());
		System.out.println("Prime Numbers are: " +primeNmbr);
	}
}
