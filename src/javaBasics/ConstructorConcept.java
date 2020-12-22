package javaBasics;

public class ConstructorConcept { // Constructor= unlike a function never returns value, used to initialize values to class variables
// class instance variables
	String name;
	int age;
	
	public ConstructorConcept() { // to create constructor, its a 0 parameter constructor
		System.out.println("Default constructor");	
	}
	
	// Duplicate Constructor with no parameter can't be created again
	/*public ConstructorConcept() { // to create constructor, its a 0 parameter constructor
		System.out.println("Default constructor");	
	} */
	
	// Constructor overloading -> with same constructor name but different number of parameters
	public ConstructorConcept(int i) { // 1 parameter constructor
		System.out.println("1 parameter constructor I");
		System.out.println(i);
	}
	
	public ConstructorConcept(int i, int j) { // 2 parameter constructor
		System.out.println("2 parameter constructor I & J");
		System.out.println(i+" "+j);
	}
	
	public ConstructorConcept(String name, int age) { // name & age here are local variables
		this.name = name; // this. classVariable = localVariable
		this.age = age;
		//name=name; --> not allowed in java, both name focuses on local variable name, but if the global variable and local variable has different name we can use = instead of this method
	}
	
	public static void main(String[] args) {
		
		ConstructorConcept obj=new ConstructorConcept(); // by creating object, it will call constructor
		ConstructorConcept obj1=new ConstructorConcept(10); // due to 1 value inside object, 1 parameter constructor will be called
		ConstructorConcept obj2=new ConstructorConcept(10,20); // due to 2 values, 2 parameter constructor will be called
		ConstructorConcept obj3=new ConstructorConcept("Tom",20);
		System.out.println(obj3.name);
		System.out.println(obj3.age);
	}

}
