package javaBasics;

public class ReverseString {

	public static void main(String[] args) {
		
		// How to reverse String?
		
		String a = "Goodmorning NYC";
	
		//1. Using for loop
		int l = a.length();
		String reverse = "";
		
		for (int  i=l-1; i>=0; i--) {
			
			reverse = reverse+a.charAt(i);	
		}
		System.out.println(reverse);
		
		
		//2. Using String Buffer
		
		StringBuffer sb = new StringBuffer(a);
		
		System.out.println(sb.reverse());

	}

}
