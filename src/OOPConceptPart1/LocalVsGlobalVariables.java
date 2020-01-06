package OOPConceptPart1;

public class LocalVsGlobalVariables {

	// Global variables = class variables
	String name="Tom";
	int age=25;
	
	public static void main(String[] args) {
		// to obj variable = copy of global variable and non-static method will be given
		LocalVsGlobalVariables obj=new LocalVsGlobalVariables(); 
		
		int i = 10; // i = local variable for main method
		System.out.println(i);
		
		//System.out.println(name); // not able to access this way
		System.out.println(obj.age);
		System.out.println(obj.name);
	}

	public void sum() {
		int i=10; // i here is local variable for sum method
		int j=20;
		int age=25; // age here is local variable for sum method
	}
}
