package OOPConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading obj=new MethodOverloading();
		
		obj.sum();
		obj.sum(10);
		obj.sum(10, 5);
		obj.sum(2.45);
	}
	
	public static void main(int p) { // same method name with different argument
		
	}
	public static void main(int q, int h) { // main method can also be overloaded
		
	}

	//not allowed to create method inside method
	//duplicate methods = i.e with same method name with same number of arguments are not allowed
	//method overloading = when method name is same with different arguments or input parameters within the same class
	public void sum() { //0 input parameter
		System.out.println("SUM method -- zero parameter");
	}
	
	public void sum(int i) { //1 input parameter
		System.out.println("SUM method -- 1 input parameter");
		System.out.println(i);
	}
	
	public void sum(double d) { //1 input parameter but different datatype is allowed
		System.out.println("SUM method -- 1 input but different parameter");
		System.out.println(d);
	}
	
	public void sum(int k, int l) { // 2 input parameter
		System.out.println("SUM method -- 2 input parameter");
		System.out.println(k+l);
	}
	
}
