package javaBasics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListValueExtractionWays {

	public static void main(String[] args) {
		
		ArrayList<String> movies = new ArrayList<String>();
		movies.add("Harry Porter");
		movies.add("Fast & Furious");
		movies.add("Mr. Bond");
		
		//1. Print using simple for loop with index
		System.out.println("******Print using simple for loop with index******");
		for(int i=0;i<movies.size();i++) {
			System.out.println(movies.get(i));
		}
		
		//2. Print using each for loop
		System.out.println("******Print using each for loop******");
		for(String movie:movies) {
			System.out.println(movie);
		}
		
		//3. Print using iterator
		System.out.println("******Print using iterator******");
		Iterator<String> it = movies.iterator();
		while(it.hasNext()) {
			String movie = it.next();
			System.out.println(movie);
		}
		
		//4. Print using listIterator and traverse both direction
		System.out.println("******Print using listIterator and traverse both direction******");
		ListIterator<String> lit = movies.listIterator(movies.size());
		//backward iteration
		System.out.println("-----backward iteration----");
		while(lit.hasPrevious()) {
			String movie = lit.previous();
			System.out.println(movie);
		}
		//forward iteration
		System.out.println("----forward iteration-----");
		while(lit.hasNext()) {
			String movie = lit.next();
			System.out.println(movie);
		}
		
		//5. Print using for each loop & lamda expression 
		System.out.println("******Print using for each loop & lamda expression******");
		movies.forEach(movie -> {
			System.out.println(movie);
		});
		
		//6. Print using iterator, lamda expression & forEachRemaining()
		System.out.println("******Print using iterator, lamda expression & forEachRemaining()******");
		Iterator<String> it1 = movies.iterator();
		it1.forEachRemaining(movie ->{
			System.out.println(movie);
		});
	}

}
