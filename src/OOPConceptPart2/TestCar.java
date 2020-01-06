package OOPConceptPart2;

public class TestCar {

	public static void main(String[] args) {

		//Method Overriding - when same method in parent class and child present with same name & same number of argument
		// Static polymorphism -- compile-time polymorphism
		BMW b=new BMW();
		b.start(); // preference will be given to child class, if same class name in parent class as well, will call method from child class
		b.stop();
		b.refuel();
		b.theftSafety();
		b.engine(); // from grandparent class
		
		System.out.println("***********");
		Car c=new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		//c.theftSafety(); - Car, parent class can't access BMW, child class
		
		System.out.println("***********");
		//Top Casting
		Car c1=new BMW(); //child class object can be referred by parent class object --dynamic polymorphism -> Run-time polymorphism
		c1.start(); // child method will be called due to overriding
		c1.stop();
		c1.refuel();
		c1.engine();
		
		// Down Casting -- not allowed, can be done by casting but run time error will be given
		//BMW b1=(BMW) new Car(); -- ClassCastException - Run time error
	}

}
