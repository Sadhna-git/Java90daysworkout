package java90days;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validateusername_140520 {

	public static void main(String[] args) {
		String input = "Testleaf$123";
		String regexpattern = "[a-z0-9._$@]{8,}";
		Pattern compile = Pattern.compile(regexpattern);
		Matcher matcher = compile.matcher(input);
		System.out.println(matcher.matches());
		

}
}
