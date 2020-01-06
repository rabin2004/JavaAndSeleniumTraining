package OOPConceptPart1;

public class Car {
	
	// class variables: copy of this will be given to all(a,b,c) object variable
	int model;
	int wheel;

	public static void main(String[] args) {
		// new operator keyword is used to create the object
		Car a=new Car(); // new Car() = is object of car class, a,b,c = object reference variable
		Car b=new Car();
		Car c=new Car();
		
		a.model=2015; // initialize values to each object variable in each class variables
		a.wheel=4;
		
		b.model=2014;
		b.wheel=4;
		
		c.model=2013;
		c.wheel=4;
		
		
		System.out.println("Before assigning the reference");
		System.out.println(a.model);
		System.out.println(a.wheel);
		
		System.out.println(b.model);
		System.out.println(b.wheel);
		
		System.out.println(c.model);
		System.out.println(c.wheel);
		
		System.out.println("After assigning the reference");
		
		a=b;	//shifting object variable
		b=c;
		c=a;
		// 	a=b  	a will be representing b object
		//	b=c		b will be representing c object	
		//	c=a		c will be representing a which is be now
		// now a is not being representated
		
		a.model=10; // inserting value in b via a
		System.out.println(a.model); // output 10
		
		c.model=20; // changing model value in b from 10 to 20 via c
		System.out.println(c.model); // output 20
		System.out.println(a.model);
		
	}

}
