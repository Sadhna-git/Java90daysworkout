package java90days;

import java.util.ArrayList;
import java.util.List;


public class Day180520_printthelist {
	public static void main(String[] args) {

		List<String> letters = new ArrayList<String>();
		letters.add("B");
		letters.add("u");
		letters.add("g");
		letters.add("a");
		letters.add("t");
		letters.add("t");
		letters.add("i");
		letters.add("c");
		letters.add("h");
		letters.add("i");
		letters.add("r");
		letters.add("o");
		letters.add("n");
		for (int i = 0; i < letters.size(); i++) {
			System.out.println(letters.get(i));
		}
		for (String eachletter : letters) {
			System.out.println(eachletter);
			
		}	
		}
		
	}
