package javaBasics;

public class NullConcept {

	static Object obj;
	static String str;
	static NullConcept nc;
	
	public static void main(String[] args) {

		//1. case sensitive:
		//Object obj = null; --> not allowed Object obj=NULL; -- as it is a keyword
		
		//2. default value of any object or class reference value is Null
		System.out.println(obj); 
		System.out.println(str);
		System.out.println(nc);
		
		//3. will give NullPointerException
		//Integer i =null;
		//int j = i; // primitive data type is pointed towards null value
		
		//4. instanceof - 
		Integer i = null;
		Integer j = 10;
		System.out.println(j instanceof Integer);
		System.out.println(i instanceof Integer); // return false as i's value is null means nothing
		
		//5. static vs non static
		NullConcept obj = null;
		//obj.send(); // will throw NullPointerException
		obj.sum();
		
		//6. == and !=
		System.out.println(null == null); // == equal to --> can be compared
		System.out.println(null != null); // != not equal to --> can be compared
		
		//7. 
		String str = null;
		Integer i1 = null;
		Double d1 = null;
		
		String s1 = (String)null; // can be time casted into String
		System.out.println(s1 +"123");
		// System.out.println(s1.length()); --> any action can't be performed will throw NullPointerException
		
		Integer i2 = (Integer) null;
		Double d2 = (Double) null;
		System.out.println(i2);
		System.out.println(d2);
	}
	
	public static void sum() { // static --> will be stored in common location, doesn't need any object creation 
		System.out.println("sum....");
	}
	
	public void send() { // non-static --> needs to have method specified to prevent NullPointerException
		System.out.println("send.....");
	}

}
