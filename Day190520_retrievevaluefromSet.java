package java90days;


import java.util.LinkedHashSet;
import java.util.Set;

//How to retrieve a value from a Set?
//Set = "1,2,3,4,5,6,7,8,9"
//retrieve and print only the value - 7

public class Day190520_retrievevaluefromSet {
	public static void main(String[] args) {
		String input = "1,2,3,4,5,6,7,8,9";
		
		Set<String> hashset = new LinkedHashSet<String>();

		hashset.add("1");
		hashset.add("2");
		hashset.add("3");
		hashset.add("4");
		hashset.add("5");
		hashset.add("6");
		hashset.add("7");
		hashset.add("8");
		hashset.add("9");
		
		for (String number : hashset) {
			if (number.equals("7")) {
				System.out.println(number);	
			}
			
		}
		
}
}
	
