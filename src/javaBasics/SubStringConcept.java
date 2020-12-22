package javaBasics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubStringConcept {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		String a = scan.next();
//		int start = scan.nextInt();
//		int end = scan.nextInt();
		
		// extracting specific seciton of from string
		//System.out.println(a.substring(start, end));
		
		String b = "MynameisRabinPradhananga";
		int c = 3;
		
		List<String> splitString = new ArrayList<>();
		
		for(int i=0; i<b.length(); i+=3) {
			splitString.add(b.substring(i,Math.min(b.length(), i+c)));
		}
		
		System.out.println(splitString);
		System.out.println(splitString.size());
		String k;
		for(int j=0; j<=splitString.size(); j++) {
			k = splitString.get(j);
			
			System.out.println(k);
		}
	}

}
