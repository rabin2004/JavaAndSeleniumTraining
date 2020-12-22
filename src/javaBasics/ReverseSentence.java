package javaBasics;

public class ReverseSentence {

	
	public static String reverseSentence(String a) {
		String[] arrayA = a.split(" ");
		StringBuilder sb = new StringBuilder();
		for(int i=arrayA.length-1;i>=0;i--) {
			sb.append(arrayA[i]);
			sb.append(" ");
		}
		
		return sb.toString().trim();
	}
	
	public static void main(String[] args) {
		String reversedString = reverseSentence("I want to work for FRBNY");
		if(reversedString.equals("FRBNY for work to want I")) {
			System.out.println("String reversed: "+reversedString);
		}
		else {
			System.out.println("String not reversed");
		}
	}
}
