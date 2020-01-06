package OOPConceptPart1;

public class FunctionsInJava {			//function=method, means the same

	
	// main method = starting point of execution
	// main method is void = never returns a value
	public static void main(String[] args) { // main = method/function
											// if main method is left empty - no execution will haven
		FunctionsInJava obj=new FunctionsInJava(); 
// copy of all non-static method (test, pqr, qa, division) will be give to obj=object reference variable
// object can only hold non-static method
		
		obj.test();   // to call method for the object, obj
		
		int l=obj.pqr();
		System.out.println(l);
		
		String s1=obj.qa();
		System.out.println(s1);
		
		int div=obj.division(30, 10);
		System.out.println(div);
	}
	
	//non static methods
	// 3 types of methods = no input/no output, no input/ but some output, input/output
	
	// void in method means - no return
	// return type = void
	// method = no input/ no output
	public void test() {	// creating method, publicly available, test()=name of method
		System.out.println("test method");
	}
	
	// return type = int
	// method= no input/ some output
	public int pqr() { 
		System.out.println("PQR method");
		int a=10;
		int b=20;
		int c=a+b;
		
		return c;
	}
	
	//return type = String
	// method= no input/ some output
	public String qa() {
		System.out.println("qamethod");
		String s="Selenium";
		
		return s;
	}
	
	// x,y = input parameters/arguments
	// return type = int
	// method= input/output
	public int division(int x, int y) {
		System.out.println("division method");
		int d =x/y;
		
		return d;	
	}
	
	
	
	
	
	
}
