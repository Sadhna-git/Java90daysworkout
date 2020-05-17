package java90days;

public class Day130520_1stapproach {

	public static void main(String[] args) {
		String input = "asdf1qwer9as8d7";
		
		char[] giveninput = input.toCharArray();
		int sumofdigits = 0;
		for (char eachchar : giveninput) {
			if (Character.isDigit(eachchar)) {
			
				int numbers = Character.getNumericValue(eachchar);
				sumofdigits = sumofdigits + numbers;
				
			}
		}
		System.out.println(sumofdigits);
	}
}
