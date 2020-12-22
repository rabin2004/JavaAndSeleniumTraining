package javaBasics;

import java.util.Scanner;

public class MergeString {
	
	// mixing 2 strings together to create new different string
	public static String merge(String a, String b) {
	
		StringBuilder result = new StringBuilder();
		
		for (int i=0; i<a.length() || i< b.length();i++) {
			
			if(i<a.length()) 
				result.append(a.charAt(i));
			
			if(i<b.length())
				result.append(b.charAt(i));			
		}
		return result.toString();
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter First value:");
		String a = s.nextLine();
		
		System.out.println("Enter Second value:");
		String b = s.nextLine();
		
		System.out.println("New Password: "+merge(a,b));

	}

}
