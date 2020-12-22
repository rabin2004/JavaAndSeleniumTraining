package javaBasics;

import java.util.Scanner;

public class OddOrEvenNumberConcept {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // creating scanner object take data input
		
		System.out.println("Enter a number: "); // providing location to input data
		
		int A = sc.nextInt(); //storing input data in A reference variable
		
		if (A%2==0) // 1st condition: if input is divided by 2 returns 0 => Even if not odd
			System.out.println("This even number: "+A);
		
		else if (A<=10) // 2nd condition: if input is odd and between 1 t0 10
			System.out.println("This is odd number between 1 to 10: "+A);
		
		else if (A<=20) // 3rd condition: if input is odd and between 11 to 20
			System.out.println("This is odd number between 11 to 20: "+A);
		
		else // last condition: if none of the above condition matches i.e odd number more than 20
			System.out.println("This is odd number above 20: "+A);

		sc.close();

	}

}
