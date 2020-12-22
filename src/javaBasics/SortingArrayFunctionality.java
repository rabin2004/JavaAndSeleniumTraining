package javaBasics;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayFunctionality {

	public static void main(String[] args) {

		ArrayList originalList = new ArrayList();
		
		originalList.add("John");
		originalList.add("Harry");
		originalList.add("Dick");
		originalList.add("Larry");
		originalList.add("Mary");
		
		System.out.println("*********Original List**************");
		
		for(int i=0; i<originalList.size(); i++) {
			System.out.println(originalList.get(i));
		}
		
		Collections.sort(originalList);
		
		System.out.println("*********Sorted in Ascending order********");
		for(int i=0; i<originalList.size(); i++) {
			System.out.println(originalList.get(i));
		}
		
		Collections.reverse(originalList);
		
		System.out.println("*********Sorted in Descending order********");
		for(int i=0; i<originalList.size(); i++) {
			System.out.println(originalList.get(i));
		}

	}

}
