package practice_Java;

import java.util.Scanner;

public class SplitString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		
		String[] aArray = a.split("[, _.@!?<>_]+"); //Regex - using regular expression to split string
		
		System.out.println(aArray.length);
		
		for(String b : aArray) {
			System.out.println(b);
		}
		scan.close();
	}

}
