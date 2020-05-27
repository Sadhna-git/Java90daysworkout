package java90days;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


//Write a java programs to print the duplicate items in the array int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2}; 
//What is the difference between int and Integer and for other datatypes also.

public class Day270520_printtheduplicatesofarray {
	public static void main(String[] args) {
		int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2};
		
		for (int i = 0; i < my_array.length-1; i++) {
			for (int j = i+1; j < my_array.length; j++) {
				if ( my_array[i] == my_array[j]) {
				System.out.println(my_array[i]);
				}
				
			}
			
		}
		



		

		
		
		
		
		
		
		
		}
		
}
	
