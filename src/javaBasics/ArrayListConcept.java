package javaBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListConcept {

	public static void main(String[] args) { 
		
		ArrayList ar=new ArrayList(); // different type of data type can be inserted if not mentioned within <>
		
		ar.add(100); //0 index 
		ar.add(200); //1 index
 		ar.add(300); //2
		
		System.out.println(ar.size());
		
		ar.add(400); //3
		ar.add(500); //4
		
		System.out.println(ar.size());
		
		ar.add("Tom"); //5
		ar.add("hello"); //6
		ar.add(12.33); //7
		ar.add('M'); //8
		ar.add(600); //9
		
		System.out.println(ar.size());
		ar.remove(9);
		System.out.println(ar.size());
		
		System.out.println(ar.get(4));
		//System.out.println(ar.get(9));  -- gives IndexOutOfBoundsException error
		
		//to print all the values of ArrayList --> for loop
		
		for (int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
			
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		ar1.add(100);
		// ar1.add("Tom"); --> not allowed as it is restricted to Integer value
		
		ArrayList<String> ar2=new ArrayList<String>();
		ar2.add("Tom");
		// ar2.add(100); ---> not allowed as it is restricted to String value
		
		// addAll() - to add second array to first array
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("java");
		a1.add("selenium");
		ArrayList<String> a2=new ArrayList<String>();
		a2.add("Manual testing");
		a2.add("automation");
		
//		a1.addAll(a2);
//		for(int j=0; j<a1.size();j++) {
//			System.out.println(a1.get(j));
//		}
		
		//removeAll() - to remove second array from first array
//		a1.removeAll(a2);
//		for(int j=0; j<a1.size();j++) {
//			System.out.println(a1.get(j));
//		}
		
		//retainAll - to find common value between first & second array
		a1.add("test");
		a2.add("test");
		
		a1.retainAll(a2);
		for(int j=0; j<a1.size();j++) {
			System.out.println(a1.get(j));
		}
		
		//Creating ArrayList using arrayList
		ArrayList<String> fromListObject = new ArrayList<String>(Arrays.asList("Tom","Dick"
				,"Harry"));
		System.out.println(fromListObject);
		
		// using for each and lamda operation 
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,
				9,10));
//		numbers.removeIf(num -> num%2==0); // removes all the even number
//		System.out.println(numbers);
		numbers.removeIf(num -> num%2!=0);
		System.out.println(numbers); // removes all the odd numbers
		
		// Using retainAll method with singleton() to return values as many time is duplicated
		ArrayList<String> names = new ArrayList<String>(Arrays.asList("Tom","Dick"
				,"Harry", "Dick"));
		
//		names.retainAll(Collections.singleton("Dick"));
//		System.out.println(names);
		
		names.removeIf(nam -> nam.equals("Dick"));
		System.out.println(names);
		
		// Substring of ArrayList
		ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,
				9,10));
		
		ArrayList<Integer> newList = new ArrayList<Integer>(numList.subList(2, 7));
		System.out.println(newList);
		
		// ArrayList to array
		ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList("Tom","Dick"
				,"Harry", "Dick"));
		Object o[] = arrayList.toArray();
		System.out.println(Arrays.toString(o));
		for(Object nam : o) {
			System.out.println(nam);
		}
		
		// Adding value from ArrayList into HashSet - to remove duplicate values as HashSet store unique values
		HashSet<String> hs = new HashSet<String>();
		for(String name : arrayList) {
		hs.add(name);
		}
		System.out.println(hs.size());
		System.out.println(hs);
		//option 2
		ArrayList<Integer> markList = new ArrayList<Integer>(Arrays.asList(1,2,1,3,2,4,5,
				3,6,7,8,9,7,10));
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>(markList); //using LinkedHashSet - as it will only save unique values
		ArrayList<Integer> markListDistinct = new ArrayList<Integer>(lhs);
		System.out.println(markListDistinct);
		//option 3
		List<Integer> distinctMarkList = markList.stream().distinct().collect(Collectors.
				toList());
		System.out.println(distinctMarkList);
		
		//Various comparison between arrayList
		ArrayList<String> array1 = new ArrayList<String>(Arrays.asList("Java","Ruby","PHP","Python","JS"));
		ArrayList<String> array2 = new ArrayList<String>(Arrays.asList("Java","Ruby","Python","JS","Selenium"));
		Collections.sort(array1); // sort both arrayList first
		Collections.sort(array2);
		System.out.println(array1.equals(array2)); // comparing 2 arrays
//		array1.retainAll(array2); // keeps only the common element between 2 in array1
//		System.out.println(array1);
//		array1.removeAll(array2); // missing element from array2 will be left
//		System.out.println(array1);
		array2.removeAll(array1); // missing element from array1 will be left
		System.out.println(array2);
	
	}

}
