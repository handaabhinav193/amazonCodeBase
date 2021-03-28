package amazonCodingPractise;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class DataStructure6_HashTable {

	public static void main(String[] args) {
		
		
		Hashtable nameAge = new Hashtable();
		Enumeration famDetails;
		
		nameAge.put("Abhinav Handa", 29);
		nameAge.put("Neetish Handa", 33);
		nameAge.put("Vijay Kumar Handa", 65);
		nameAge.put("Meera Handa", 63);
		
		famDetails = nameAge.keys();
		
		while(famDetails.hasMoreElements()) {
			String str = famDetails.nextElement().toString();
			System.out.println(str+" : " +nameAge.get(str));
		}
		
		
	}

}
