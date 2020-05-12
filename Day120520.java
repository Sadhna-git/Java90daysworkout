package java90days;

public class Day120520 {

	public static void main(String[] args) {
		String input = "You have no choice other than following me!";
		int count = 0;
		char givencharacter = 'o';
		char[] givencharacters = input.toCharArray();
		for (int i = 0 ; i < givencharacters.length ; i++) {
			if (givencharacter == givencharacters[i]) {
				count++;
			}
		}
		System.out.println(count);
		
		isPalindrome("Malayalam");
	}
	public static boolean isPalindrome(String input) {
		StringBuffer inputToBeReversedStringBuffer = new StringBuffer(input);
		StringBuffer reversenewinput = inputToBeReversedStringBuffer.reverse();
		String reversedInput = reversenewinput.toString();
		if (input.equalsIgnoreCase(reversedInput)) {
			System.out.println("Yes it is a Palindrome");
			return true;
		} else {
			System.out.println("No it is not a Palindrome");
			return false;
		}
	}

}
