package javaBasics;

import java.util.Scanner;

public class ReverseString2Ways {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		String a = scan.next();
		
		StringBuffer sb = new StringBuffer(a);
		
		String b = sb.reverse().toString();
		
		System.out.println(b);
		
		if (a.equalsIgnoreCase(b)) {
			System.out.println("It's a palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
		
		
		// without Stringbuffer
	/*	int l = a.length();
		String b ="";
		for(int i=l-1; i>=0; i--) {
			String c = String.valueOf(a.charAt(i));
			b=b+c;
		}
		System.out.println(b);
		*/
	}

}
