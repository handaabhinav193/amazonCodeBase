package amazonCodingPractise;

import java.util.Enumeration;
import java.util.Vector;

public class DataStructure1_Enumeration {

	public static void main(String[] args) {
		
		//Defining a vector
		Vector days = new Vector();
		
		// adding elements to the Vector days
		days.add("Sunday");
		days.add("Monday");
		days.add("Tuesday");
		days.add("Wednesday");
		days.add("Thursday");
		days.add("Friday");
		days.add("Saturday");
		
		//Defining Enumeration name which can be used with only Vector & Properties Data Structure
		Enumeration nameofDays; 
		
		// elements() Fxn adds all values of days to enumeration nameofDays
		nameofDays = days.elements(); 
		
		
		//hasMoreElements() checks if enumeration has more elements
		while(nameofDays.hasMoreElements()) { 
			
			//nextElement( it iterates over the elements of the enumeration until the next element is none.
			System.out.println(nameofDays.nextElement()); 
		}
		

	}

}
