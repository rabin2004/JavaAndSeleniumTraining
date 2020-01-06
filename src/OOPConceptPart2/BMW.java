package OOPConceptPart2;

public class BMW extends Car { // "has-a relationship" => class to class relationship

	public void start() { // overridden method - present in both parent and child class
		System.out.println("BMW---start");
	}
	
	public void theftSafety() {
		System.out.println("BMW---theftSafety");
	}
	
	
}
