package java90days;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

//How to remove duplicates from a list? 
//List = "A,B,C,D,A,D,E,F"

public class Day190520_removetheduplicates {
	public static void main(String[] args) {
		String input = "A,B,C,D,A,D,E,F";
		
		List<String> letters = new ArrayList<String>();

		letters.add("A");
		letters.add("B");
		letters.add("C");
		letters.add("D");
		letters.add("A");
		letters.add("D");
		letters.add("E");
		letters.add("F");
		
		LinkedHashSet<String> hashset= new LinkedHashSet<>(letters);
		List<String> removedduplicates = new ArrayList<String>(hashset);
		System.out.println(removedduplicates);
		
		}
		
}
	
