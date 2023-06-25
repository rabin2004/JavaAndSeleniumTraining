package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Practice {
	
	public static void anagram(String a, String b) {
		char[] arrayA = a.toCharArray();
		char[] arrayB = b.toCharArray();
		
		Arrays.sort(arrayA);
		Arrays.sort(arrayB);
		
		boolean result = Arrays.equals(arrayA, arrayB);
		
		if(result==true) {
			System.out.println("Is anagram");
		}
		else {
			System.out.println("Not anagram");
		}
	}
	
	public static void insertingSpaceInString(String a, String b) {
		StringBuilder sb = new StringBuilder();
		if(a.length()>0) {
			sb.append(a.charAt(0));
			for(int i=1;i<a.length();i++) {
				sb.append(" ");
				sb.append(a.charAt(i));
			}
			if(b.length()>0) {
				for(int j=0;j<b.length();j++) {
					sb.append(" ");
					sb.append(b.charAt(j));
				}
				System.out.println(sb);
			}
		}
	}
	
	public static void reverseStringWithStringBuffer(String a) {
		StringBuffer sb = new StringBuffer(a);
		
		System.out.println(sb.reverse().toString());
	}
	
	public static void reverseStringWithLooping(String a) {
		char[] arrayA = a.toCharArray();
		
		String reversedString="";
		for(int i=arrayA.length-1;i>=0;i--) {
			reversedString = reversedString+arrayA[i];
		}
		System.out.println(reversedString);
	}
	
	public static void oddOrEvenNumber(int a) {
		if(a%2==0) {
			System.out.println(a+" is even number.");
			if(a<=10) {
				System.out.println(a+" is 10 or less");
			}
			else if (a>10 && a<=20) {
				System.out.println(a+" is between 10-20");
			}
			else {
				System.out.println(a+" is more than 20");
			}
		}
		else if(a%2!=0) {
			System.out.println(a+" is odd number");
			if(a<=10) {
				System.out.println(a+" is 10 or less");
			}
			else if (a>10 && a<=20) {
				System.out.println(a+" is between 10-20");
			}
			else {
				System.out.println(a+" is more than 20");
			}
		}
	}
	
	public static void removingGarbageFromString(String a) {
		String cleanString = a.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(cleanString);
	}
	
	public static void mixingStringsToCreateNewString(String a, String b) {
		StringBuilder mixedString = new StringBuilder();
		for(int i=0;i<a.length()||i<b.length();i++) {
			if(i<a.length()) {
				mixedString.append(a.charAt(i));
			}
			if(i<b.length()) {
				mixedString.append(b.charAt(i));
			}
		}
		System.out.println("New suggested password = "+mixedString.toString());
	}
	
	public static void option2GarbageRemovalString(String a) {
		StringBuilder sb = new StringBuilder(a.length());
		for(int i=0;i<a.length();i++) {
			char ch = a.charAt(i);
			if((ch>='A' && ch<='Z') ||
				(ch>='a' && ch<='z') ||
				(ch>='0' && ch<='9')){
					sb.append(ch);
				}
		}
		System.out.println(sb.toString());
	}
	
	public static void firstLetterOfStringUpperCase(String a) {
		String modifiedA = a.substring(0, 1).toUpperCase()+a.substring(1).toLowerCase();
		System.out.println(modifiedA);
	}
	
	public static void removeDuplicatesStringFromArray(String[] a) {
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(a));
		HashSet<String> hs = new HashSet<String>(al);
		ArrayList<String> al2 = new ArrayList<String>(hs);
		System.out.println(al2);
	}
	
	public static void removeDuplicatesNumberFromArray(Integer[] a) {
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(a));
		HashSet<Integer> hs = new HashSet<Integer>(al);
		ArrayList<Integer> al2 = new ArrayList<Integer>(hs);
		System.out.println(al2);
	}
	
	public static void countDuplicateValueInArray(Integer[] a) {
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(a));
		HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
		for(int i=0;i<al.size();i++) {
		int count = Collections.frequency(al, al.get(i));
		hm.put(al.get(i), count);
		}
		System.out.println(hm.entrySet());
	}
	
	public static void sortArrayManipulateOutput(Integer[] a) {
		StringBuilder sb = new StringBuilder();
		for(int val: a) {
			sb.append(String.valueOf(val)+" * ");	
		}
		sb.replace(sb.length()-2, sb.length()-1, "");
		System.out.println(sb);
	}
	
	public static void sortArrayEvenNumManipulateOutput(Integer[] a) {
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int val: a) {
			if(val%2==0) {
				hs.add(val);
			}
		}
		Iterator<Integer> it = hs.iterator();
		StringBuilder sb = new StringBuilder();
		while(it.hasNext()) {
			sb.append(it.next().toString()+" * ");	
		}
		sb.replace(sb.length()-2, sb.length()-1, "");
		System.out.println(sb);
	}
	
	public static void getNameIntials(String a) {
		String[] arrayA = a.split("[^A-Z]");
		List<String> listA = Arrays.asList(arrayA);
		StringBuilder sb = new StringBuilder();
		for(String c: listA) {
			sb.append(c);
		}
		System.out.println(sb);	
	}
	
	public static String customerIntialsWithSubString(String custName) { // firstName lastName
		String firstNameInit = custName.substring(0,1);
		int positionOfSpace = custName.indexOf(" ");
		String lastNameInit = custName.substring(positionOfSpace+1, positionOfSpace+2);
		String custInit = firstNameInit.concat(lastNameInit);
		return custInit;
	}
	
	public static String customerIntialsUsingSplit(String custName) {
		String[] nameSplit = custName.split(" ");
		String firstName = nameSplit[0];
		String lastName = nameSplit[1];
		String firstNameInit = firstName.substring(0,1);
		String lastNameInit = lastName.substring(0,1);
		String custInit = firstNameInit.concat(lastNameInit);
		return custInit;
	}
	
	public static void multiplicationTable(int num) {
		for(int i=1; i<=10; i++){
		    System.out.println(num+"*"+i+"="+(num*i));
		}
	}
	
	public static void pictorialRepresentationJava() {
		System.out.println("   J    a   v     v  a ");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");
	}
	
	public static void pictorialRepresentationUSflag() {
		System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
	}
	
	public static void printFace() {
		System.out.println(" +\"\"\"\"\"+ ");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  | ");
        System.out.println(" | '-' | ");
        System.out.println(" +-----+ ");
	}

	public static void main(String[] args) {
		anagram("nepal", "nelap");
		anagram("rabin", "rubin");
		insertingSpaceInString("Hello", "Everybody");
		reverseStringWithStringBuffer("United States of America");
		reverseStringWithLooping("USA");
		oddOrEvenNumber(10);
		oddOrEvenNumber(11);
		removingGarbageFromString("@*$@*$CoronaVirus@&*&*$");
		option2GarbageRemovalString("213213@&^%$Days*&^%()12338");
		firstLetterOfStringUpperCase("nepal");
		mixingStringsToCreateNewString("first", "second");
		removeDuplicatesStringFromArray(new String[] {"Tom", "Dick", "Harry", "Tom"});
		removeDuplicatesNumberFromArray(new Integer[] {1,2,3,4,5,6,7,8,9,3,5,7,8});
		countDuplicateValueInArray(new Integer[] {1,2,3,4,5,6,7,8,9,3,5,7,8});
		sortArrayManipulateOutput(new Integer[] { 4, 6, 2, 3, 1, 5, 6, 7, 8, 9, 10 });
		sortArrayEvenNumManipulateOutput(new Integer[] { 4, 6, 2, 3, 1, 5, 6, 7, 8, 9, 10 });
		getNameIntials("Maria Jules Junior");
		multiplicationTable(9);
		pictorialRepresentationJava();
		pictorialRepresentationUSflag();
		printFace();
	}

}
