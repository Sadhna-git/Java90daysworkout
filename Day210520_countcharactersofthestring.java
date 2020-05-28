package java90days;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Write a java program to find the count the characters in the given string
//String str = "Karma is powerful than God"
//{K=1, a=3, r=2, m=1,  =4, i=1, s=1, p=1, o=2, w=1, e=1, f=1, u=1, l=1, t=1, h=1, n=1, G=1, d=1} 
//Note: Use Map to bring the result

public class Day210520_countcharactersofthestring {
	public static void main(String[] args) {
		String str = "Karma is powerful than God";
		char[] input = str.toCharArray();
		
		Map<Character,Integer> lettersmap = new HashMap<>();
		for (char ch : input) {
			if (lettersmap.containsKey(ch)) {
				int oldCount = lettersmap.get(ch);
				int latestCount = oldCount + 1;
				lettersmap.put(ch, latestCount);
				
			}
			else {
				lettersmap.put(ch, 1);
				
		}
				
		}
		System.out.println(lettersmap);
	
		
		



		

		
		
		
		
		
		
		
		}
		
}
	
