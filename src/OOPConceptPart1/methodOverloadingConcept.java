package OOPConceptPart1;

public class methodOverloadingConcept {
	
public static void main (String[] arg) {
		
	methodOverloadingConcept d = new methodOverloadingConcept();
		
		d.sum();
		d.sum(12.55);
		d.sum(200);
		d.sum(100, 500);
		
	}
		// Method overloading - method with same name but should have different input parameters or same 
		//input parameters with different datatypes
	
	public void sum() {
		int a = 20;
		int b = 50;
		
		System.out.println("method without input: "+(a+b));
	}
	
	public void sum(int x) {
	
		int y = 100;
		
		System.out.println("method with 1 int datatype: "+(x+y));	
	}
	
	public void sum(double m) {
		
		double n = 10.55;
		
		System.out.println("method with 1 double datatype: "+(m+n));
	}
	
	public void sum(int a, int b) {

		System.out.println("method with 2 int datatype: "+(a+b));
	}
}