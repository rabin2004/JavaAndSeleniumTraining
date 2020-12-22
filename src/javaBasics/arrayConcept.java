package javaBasics;

public class arrayConcept {

	public static void main(String[] args) {
	
		//one dimensional array concept	
				int a[] = new int [4];
				a[0]=1;
				a[1]=2;
				a[2]=3;
				a[3]=4;
			
			// String concatenation	
				System.out.println(a[0]+a[1]);
				System.out.println(a.length);
				System.out.println(a[3]);
				System.out.println(a[0]+a[1]+a[2]+a[3]);
			// for loop	
				for (int j=0; j<a.length; j++) // initialization:conditionL;incremental/decremental
				{
					System.out.println(a[j]);
				}
			//while loop	
				int m=1;    // initialization
				while (m<=10) //condition
				{
					System.out.println(m);
					m=m+1;   //incremental/decremental
				}
				
			// single dimensional array concept	
				String b[] = new String [4];
				b[0] = "Happy";
				b[1] = "Birthday";
				b[2] = "to";
				b[3] = "you";
			//string concatenation	
				System.out.println(b[0]+" "+b[1]+" "+b[2]+" "+b[3]);
			//if-else condition	
				if (b[0].length()==b[1].length()) {
					System.out.println("Happy is longer than Birthday");
				}
				else {
					System.out.println("Birthday is longer than Happy");
				}
				if (b[2].length()>b[3].length()) {
					System.out.println("To is longer than you");
				}
				else {
					System.out.println("You is longer than to");
				}
			
			//if-else if-else condition	
				int x=10;
				int y=20;
				int z=30;
			if(x>y & x>z) {
				System.out.println("x is largest");
			}
			else if (y>z) {
				System.out.println("y is largest");
			}
			else {
				System.out.println("z is largest");
			}
			
			}
}
