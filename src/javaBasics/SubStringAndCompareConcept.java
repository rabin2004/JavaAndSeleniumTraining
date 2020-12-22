package javaBasics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SubStringAndCompareConcept {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		
		String a = scan.next();
		String b = scan.next();
		
		System.out.println(a.length()+b.length());
		
		if(a.compareTo(b)>0) { // if b comes before a in dictionary = gives positive number = will print yes
			System.out.println("Yes");
			System.out.println(a.compareTo(b));
		}
		else if(a.compareTo(b)<=0) { // if a comes before b in dictionary = give negative number = will print negative number & if a and b is same string gives 0 = will print No
			System.out.println("No");
		}
		
		// subString concept = to convert first letter into upperCase and rest lowerCase
		String modifiedA = a.substring(0, 1).toUpperCase() + a.substring(1).toLowerCase();
		
		String modifiedB = b.substring(0, 1).toUpperCase() + b.substring(1).toLowerCase();
		
		System.out.println(modifiedA +" "+ modifiedB);
		
		
	}

}
