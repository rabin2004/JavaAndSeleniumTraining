package OOPConceptPart1;

public class AccessModifierConcept {
	//Access Modifier - 4 Types - restricting access of a class
	//1. Default - Visible to the package, the default. No modifiers are needed. - can be accessed in same class/class in same package/but not in class of different package
	//2. private - Visible to the class only (private). - can only be accessed within the class
	//3. public - Visible to the world (public). - can be accessed in same class/class in same package/class in different
	//4. protected - Visible to the package and all subclasses (protected). - can be accessed in same class/class in same package/not in class of different package
	
	// default Vs protected - protected property can also be accessed in subClasses/ default can't accessed in subClasses
	
	public static String a = "hi";
	public String b = "hello";
	static String c = "Welcome"; // default access modifier
	private static String d = "Bye";
	protected static String e = "GoodNight";
	
	
	public static void testMethod() {
		System.out.println("Hello world");
	}
	
	public void testMethodTwo() {
		System.out.println("Hello world");
	}
	
	static void testMethodThree() {
		System.out.println("I am in default method");
	}
	
	private static void testMethodFour() {
		System.out.println("I am in private method");
	}
	
	protected static void testMethodFive() {
		System.out.println("I am in protected method");
	}

	public static void main(String[] args) {
		System.out.println(a);
		testMethod();
		System.out.println(c);
		testMethodThree();
		System.out.println(d);
		testMethodFour();
		System.out.println(e);
		testMethodFive();
	}

}
