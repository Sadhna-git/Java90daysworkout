package java90days;


import java.util.HashMap;
import java.util.Map;


//Write a Java program to print the keys and values from the Map
//map = {A=1, B=2, C=3 , D=4,E=5}
//(Min 3 ways)

public class Day200520_printkeysandvaluesofmap2ndapproach {
	public static void main(String[] args) {
		// 1.create a map
		
		Map <String , Integer> keyvaluemap = new HashMap<>();
		keyvaluemap.put("A", 1);
		keyvaluemap.put("B", 2);
		keyvaluemap.put("C", 3);
		keyvaluemap.put("D", 4);
		keyvaluemap.put("E", 5);

		for (Map.Entry<String, Integer> entry : keyvaluemap.entrySet()) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("Key : " + key + ", Value : " + value);
			
		}


		

		
		
		
		
		
		
		
		}
		
}
	
