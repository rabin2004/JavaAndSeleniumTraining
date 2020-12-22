package javaBasics;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPracticalEg {
	String name;
	int age;
	String dept;
	
	ArrayListPracticalEg(String name, int age, String dept){
		this.name=name;
		this.age=age;
		this.dept=dept;
	}

	public static void main(String[] args) {
		ArrayListPracticalEg emp1 = new ArrayListPracticalEg("Tom",25,"QA");
		ArrayListPracticalEg emp2 = new ArrayListPracticalEg("Dick",30,"Dev");
		ArrayListPracticalEg emp3 = new ArrayListPracticalEg("Harry",35, "Admin");
		
		ArrayList<ArrayListPracticalEg> al = new ArrayList<ArrayListPracticalEg>();
		al.add(emp1);
		al.add(emp2);
		al.add(emp3);
		
		//System.out.println(al.get(0)); // can't get value as it is returning emp1 object
		
		// iterator - to traverse through arrayList to get access to objects stored
		Iterator<ArrayListPracticalEg> it = al.iterator();
//		System.out.println(it.next(); // can't get value as it is also pointing towards emp1 object
	
		while(it.hasNext()) {
			ArrayListPracticalEg alp =  it.next();
			System.out.println(alp.name);
			System.out.println(alp.age);
			System.out.println(alp.dept);
		}
	

	}

}
