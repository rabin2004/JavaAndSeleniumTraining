package javaBasics;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
//	https://www.javatpoint.com/java-regex
	
	// Java Regular Expression: A Java regular expression, or Java regex, is a sequence of characters that specifies a pattern which can be searched for in a text. A regex defines a set of strings, usually united for a given purpose.

	// Pattern & Matcher
	
//	Java RegEx Character Classes
//	Character Class		Description:
//	[abc]				simple, matches a or b, or c
//	[\^abc]				negation, matches everything except a, b, or c
//	[a-c]				range, matches a or b, or c
//	[a-c[f-h]]			union, matches a, b, c, f, g, h
//	[a-c&&[b-c]]		intersection, matches b or c
//	[a-c&&[\^b-c]]		subtraction, matches only a
	
//	Predefined Java RegEx Character Classes
//	Character Class		Description
//	.					Any character
//	\d					A digit: [0-9]
//	\D					A non-digit: [\^0-9]
//	\s					A whitespace character: [ \t\n\x0B\f\r]
//	\S					A non-whitespace character: [\^\s]
//	\w					A word character: [a-zA-Z_0-9]
//	\W					A non-word character: [\^\w]
	

//Java RegEx Boundary Matchers
//Boundary Matcher		strong>Description
//^						The beginning of a line
//$						The end of a line
//\b					A word boundary
//\B					A non-word boundary
//\A					The beginning of the input
//\G					The end of the previous match
//\Z					The end of the input but for the final terminator, if any.
//\z					The end of the input
	
//	Java RegEx Quantifiers
//	Quantifier		Description
//	*				Matches zero or more occurrences.
//	+				Matches one or more occurrences.
//	?				Matches zero or one occurrence.
	
//	Java RegEx Groups and Backreferences
//	Groups and Back references	Description
//	(...)						Matches zero or more occurrences.
//	\N							Matches one or more occurrences.
//	(\d\d)						Matches zero or one occurrence.
//	(\d\d)/\1					Two digits repeated twice, \1 - refers to the matched group
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		scan.close();
//		String regex = "[abc]";
//		String regex = "[\\^abc]";
//		String regex = "[a-c]";
//		String regex = "[a-c[x-z]]";
//		String regex = "[a-c&&[a-b]]";
//		String regex = "[a-c&&[\\^a-b]]";
//		String regex = "\\d";
//		String regex = "\\D";
//		String regex = "\\s";
//		String regex = "\\S";
//		String regex = "\\w";
//		String regex = "\\W";
//		String regex = ".";
//		String regex = "^[a-z]";
//		String regex = "$[0-9]";
//		String regex = "[a|x|y]"; // | -> or
//		String regex = "[A-Z]*";
//		String regex = "[A-Z]+";
//		String regex = "[A-Z]?";
//		String regex = "[a-z(...)]";
//		String regex = "[A-Z]"+"[a-z]*";
		String regex = "[a-zA-Z0-9\\W]{8,15}";
		Pattern pattern = Pattern.compile(regex);
		Matcher match = pattern.matcher(name);
		System.out.println(match.matches());
		
//		boolean result = Pattern.compile("[a-j]+").matcher(name).matches();
//		System.out.println(result);
//		boolean result = Pattern.matches("[\\D]", name);
//		System.out.println(result);
	}

}
