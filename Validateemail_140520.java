package java90days;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validateemail_140520 {

	public static void main(String[] args) {
		String input = "balaji.chandrasekaran@testleaf.com";
		String regexpattern = "[a-zA-Z0-9._]+@[a-zA-Z0-9]+.[a-z]{2,}";
		Pattern compile = Pattern.compile(regexpattern);
		Matcher matcher = compile.matcher(input);
		System.out.println(matcher.matches());

}
}
