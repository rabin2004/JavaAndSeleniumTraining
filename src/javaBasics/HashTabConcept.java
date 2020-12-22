package javaBasics;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTabConcept {

	public static void main(String[] args) {
	
		Hashtable h=new Hashtable();
		
		h.put("A", "Test");
		h.put("B", "Hello");
		h.put("C", "World");
		
		System.out.println(h.size());
		
		h.put(1, 100);
		h.put(2, 200);
		
		System.out.println(h.size());
		
		System.out.println(h.get("B"));
		System.out.println(h.get(2));
		
		h.put(3, "Tom");
		
		System.out.println(h.size());
		
		
		Hashtable <Integer, Integer> h1=new Hashtable<Integer, Integer>();
		
		h1.put(1, 100);
		// h1.put("A", 200); --> will no be allowed as data type is defined as Integer
		
		Hashtable<Integer, String> h2=new Hashtable <Integer, String>();
		
		h2.put(1, "Tom");
		
		
		Hashtable ht = new Hashtable();
		ht.put(1, "hi"); // adding data into Hashtable in key value pair
		ht.put(3, "New");
		ht.put(5, "Old");
		
		System.out.println(ht.get(3)); // fetching data with key
		System.out.println(ht.entrySet()); // fetching all the key & value in the table
		System.out.println(ht.keySet()); // fetching only keys
		System.out.println(ht.values()); // fetching only values
		ht.replace(3, "New York"); // replacing data
		System.out.println(ht.get(3)); 
		System.out.println(ht.size()); // size of table
		System.out.println(ht.containsKey(5)); // checking if the table has specific key
		System.out.println(ht.contains("hi")); // checking if the table has specific value
		System.out.println(ht.containsValue("hello")); // checking value option 2
		ht.put(5, "New"); // takes data with same key again - but replaces the value if different
		System.out.println(ht.get(5));
		System.out.println(ht.containsValue("Old"));
		ht.put(5, "New");
		System.out.println(ht.entrySet());
//		ht.remove(1); // removes the key & value pair
		System.out.println(ht.entrySet());
		
		
		HashMap hm = new HashMap();
		
		hm.put(1, "hi");
		hm.put(2, "how");
		hm.put(3, "are");
		hm.put(4, "you");
		
//		hm.put(1, "hello"); // value replaced 
		
		System.out.println(hm.size());
		System.out.println(hm.get(1));
		
		hm.put(3, "how"); // duplicate value can be inserted into different key
		System.out.println(hm.get(2));
		System.out.println(hm.entrySet());
		System.out.println(hm.isEmpty());

		
//		Hashmap vs Hashtable
//		1. HashMap is non synchronized. It is not-thread safe and can’t be shared between many threads without proper synchronization code whereas Hashtable is synchronized. It is thread-safe and can be shared with many threads.
//		2. HashMap allows one null key and multiple null values whereas Hashtable doesn’t allow any null key or value.
//		3. HashMap is generally preferred over HashTable if thread synchronization is not needed
//
//		Why HashTable doesn’t allow null and HashMap does?
//		To successfully store and retrieve objects from a HashTable, the objects used as keys must implement the hashCode method and the equals method. Since null is not an object, it can’t implement these methods. HashMap is an advanced version and improvement on the Hashtable. HashMap was created later.

	}

}
