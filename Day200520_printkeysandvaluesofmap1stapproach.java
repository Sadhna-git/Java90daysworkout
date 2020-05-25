package java90days;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Write a Java program to print the keys and values from the Map
//map = {A=1, B=2, C=3 , D=4,E=5}
//(Min 3 ways)

public class Day200520_printkeysandvaluesofmap1stapproach {
	public static void main(String[] args) {
		// 1.create a map
		
		Map <String , Integer> keyvaluemap = new HashMap<>();
		keyvaluemap.put("A", 1);
		keyvaluemap.put("B", 2);
		keyvaluemap.put("C", 3);
		keyvaluemap.put("D", 4);
		keyvaluemap.put("E", 5);
	
		//1. Retrieve value for D from hashmap
//		int valueofD = keyvaluemap.get("D");
//		System.out.println(valueofD);
				
		// 2. get all keys from hashmap
		Set<String> keys = keyvaluemap.keySet();

		// 3.iterate all the keys (for loop)
		for (String key : keys) {
			System.out.println(key);
			}
		
		//4. get value for each key in iteration step #3
		Collection<Integer> values = keyvaluemap.values();
		for (Integer value : values) {
			System.out.println(value);
		}
		



		

		
		
		
		
		
		
		
		}
		
}
	
