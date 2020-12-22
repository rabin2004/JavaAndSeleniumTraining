package OOPConceptPart1;

public class staticVsnonStaticConcept {
	String car = "Audi";
	static int model = 2020;
	
	public static void main (String[] arg) {
	// Static and Non-static method/variable Concept
	// How to call static method/variable
	//1. direct calling
		sell();
		System.out.println(model);
	
	//2. using class name
		staticVsnonStaticConcept.sell();
		System.out.println(staticVsnonStaticConcept.model);
	
	//How to call non-static method/variable
	// can only be called by using class object reference variable
		staticVsnonStaticConcept d = new staticVsnonStaticConcept();
		
		d.drive();
		System.out.println(d.car);
		
	// static method can also be called by using class object reference variable but gives warning
	// saying static method should be accessed in static way
		d.sell();
	}
	
	public void drive() {
		System.out.println("Drive "+car);
	}
	
	public static void sell() {
		System.out.println("Selling "+model);
	}

}