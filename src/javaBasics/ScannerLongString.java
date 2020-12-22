package javaBasics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ScannerLongString {

	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = scan.nextInt();
		Double c = scan.nextDouble();
		String b = br.readLine();
		
		
		System.out.println("Integer: "+a);
		System.out.println("String: "+b);
		System.out.println("Double: "+c);
		
		scan.close();

	}

}
