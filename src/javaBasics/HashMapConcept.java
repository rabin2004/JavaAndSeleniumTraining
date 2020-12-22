package javaBasics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {
		// HashMap - keeps data in key & value pair
		// one null key and multiple null value allowed
		// duplicate values are also allowed
		
		HashMap<String, String> majorCity = new HashMap<String, String>();
		majorCity.put("New York", "NYC");
		majorCity.put("Texas", "Huston");
		majorCity.put("Florida", "Miami");
		majorCity.put("California", "LA");
		majorCity.put(null, "SFO");
		majorCity.put(null, "Orlando");
		majorCity.put("NewHempshire", null);
		majorCity.put("Connecticut", null);
		
		// get value using key
		System.out.println(majorCity.get("Florida"));
		// get keySet
		System.out.println(majorCity.keySet());
		// get all values
		System.out.println(majorCity.values());
		// get all key & value pair
		System.out.println(majorCity.entrySet());
		
		System.out.println("***********************************************");
		
		// Get all the values using iterator at keySet
		Iterator<String> it = majorCity.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			String value = majorCity.get(key);
			System.out.println("Key = "+key+" and Value = "+value);
		}
		
		System.out.println("***********************************************");
		
		// Get all values using iterator at entrySet
		Iterator<Entry<String, String>> it1 = majorCity.entrySet().iterator();
		while(it1.hasNext()) {
			Entry<String, String> entry = it1.next();
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("Key = "+key+" and Value = "+value);
		}
		
		System.out.println("***********************************************");
		
		// Get all values using iterator, for each & with lamda expression
		majorCity.forEach((k,v) -> System.out.println("Key = "+k+" and Value = "+v));

	}

}
