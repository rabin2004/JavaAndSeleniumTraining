package javaBasics;

import java.util.HashSet;
import java.util.Iterator;

public class SortingIntManipulatingOutput {

	public static void main(String[] args) {
		Integer[] values = { 4, 6, 2, 3, 1, 5, 6, 7, 8, 9, 10 };
		
		//print all the numbers from array astrisk in between
		StringBuilder sb1 = new StringBuilder();
		for(int val: values) {
			sb1.append(String.valueOf(val)+" * ");
		}
		
		System.out.println(sb1); // 4 * 6 * 2 * 3 * 1 * 5 * 6 * 7 * 8 * 9 * 10 * 
		
		// to remove last astrisk
		sb1.replace(sb1.length()-2, sb1.length(), "");
		System.out.println(sb1); // 4 * 6 * 2 * 3 * 1 * 5 * 6 * 7 * 8 * 9 * 10

		// get distinct even numbers
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int v: values) {
			if(v%2==0) {
				hs.add(v);
			}
		}
		
		Iterator<Integer> it = hs.iterator();
		
		// insert * between the numbers
		StringBuilder sb = new StringBuilder();
		while(it.hasNext()) {
			sb.append(it.next()+" * ");
		}
		
		System.out.println(sb); //2 * 4 * 6 * 8 * 10 *
		
		// to remove last astrisk
		sb.replace(sb.toString().length()-2, sb.toString().length()-1, "");
		
		System.out.println(sb); // 2 * 4 * 6 * 8 * 10  

	}

}
