package amazonCodingPractise;

public class FindNmbrOfSiblings {

	public static void main(String[] args) {
		
		String [] family = {"a|b,c,d,e", "f|g,h,i", "j|k,l,m,n,o,p"};
		
		for(int i = 0;i<family.length;i++) {
			char[] a = family[i].toCharArray();
			int counter=0;
			for(int j=0;j<a.length;j++) {
				if(a[j] == ',') {
					counter++;
				}
			}
			int total_sibling = counter+1;
			System.out.println("Total_sibling of: " +family[i]+ " is: " +total_sibling);
			
		}

	}

}
