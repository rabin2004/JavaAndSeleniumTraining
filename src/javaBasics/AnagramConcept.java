package javaBasics;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramConcept {
	
	// Anagram - silent vs lisent (same letters in same count but arranged differently)
	public static boolean isAnagram(String a, String b) {
		char[] arrayA = a.toCharArray();
		char[] arrayB = b.toCharArray();
		
		Arrays.sort(arrayA);
		Arrays.sort(arrayB);
		
		return Arrays.equals(arrayA, arrayB);
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		
		boolean returns = isAnagram(a, b);
		
		if(returns==true) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not an Anagram");
		}
		
		// instead of if-else to print message
	//	System.out.println((returns) ? "Anagram": "Not an Anagram");
	

	}

}
