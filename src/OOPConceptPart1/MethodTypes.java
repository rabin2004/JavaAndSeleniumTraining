package OOPConceptPart1;

public class MethodTypes {
	// class variable - can be accessed by all the method/function
		int a;
		int b;

		public static void main(String[] args) { // main method
			MethodTypes d = new MethodTypes();
			
			System.out.println(d.addition());
			d.substraction(); // non-static method can be accessed using object reference variable
			System.out.println(d.multiplication(100, 200));
			division(); // static method should be directly accessed
	}
		
		public int addition() { // method with no input but with output
			a=20;
			b=30;
		int	x=a+b;
			
			return x;
			
		}
		
		public void substraction() { //method with no input and no output
			a=50;
			b=10;
		int y=a-b;
		
		System.out.println(y);
		}
		
		public int multiplication (int x, int y) { //method with input and output

			int z = x*y;
			
			return z;
		}
		
		public static void division() {
			int o=500;
			int p=10;
			
			int m=o/p;
			
			System.out.println(m);
			
		}
		
		
	}