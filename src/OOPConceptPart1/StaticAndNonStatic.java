package OOPConceptPart1;

public class StaticAndNonStatic {

	String name="Tom"; // non-static global variable
	static int age=25; // static global variable
	
	public static void main(String[] args) {
		
// how to call static methods & variables
	//1. direct calling:
		sum();
	//2. calling by class name:	
		StaticAndNonStatic.sum();
		
		System.out.println(age);
		System.out.println(StaticAndNonStatic.age);
		
// how to call non-static methods & variables
	//	by creating object = copy of non-static variable and non-static method is given to object, obj
	// non-static variable and non-static method is not given to object but can be accessed directly
		StaticAndNonStatic obj=new StaticAndNonStatic();
		obj.sendMail();
		System.out.println(obj.age);
		
// can i access static methods by using object reference?	- Yes
		obj.sum(); // warning will be given saying can be accessed by static way
	}

	public void sendMail() { // non-static method
		System.out.println("send mail method");
	}
	
	public static void sum() { // static method
		System.out.println("Sum method");
	}
}
