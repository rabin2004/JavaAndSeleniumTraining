package javaBasics;

public class TwoDArraysConcept {

	public static void main(String[] args) {
	
		//2D arrays
		
		String x[][]=new String[3][5]; // 1st[]=row, 2nd[]=column
		// can also do [][]x
		System.out.println(x.length); // total number of rows =3
		System.out.println(x[0].length); // total number of columns=5
		
		x[0][0]="A"; // assigning values in 1st row
		x[0][1]="B";
		x[0][2]="C";
		x[0][3]="D";
		x[0][4]="E";
		
		x[1][0]="A1"; // assigning values in 2nd row
		x[1][1]="B1";
		x[1][2]="C1";
		x[1][3]="D1";
		x[1][4]="E1";
		
		x[2][0]="A2"; // assigning values in 3rd row
		x[2][1]="B2";
		x[2][2]="C2";
		x[2][3]="D2";
		x[2][4]="E2";
		
		System.out.println(x[1][2]); // print specific cell 
		System.out.println(x[2][2]);
		System.out.println(x[0][4]);
		
		// to print all values in 2D array - use for loop (need to use outer loop & inner loop concept)
		for (int row=0;row<x.length;row++) {
			for(int col=0; col<x[0].length;col++) {   // 0 Row's column value will be executed first then next row
				System.out.println(x[row][col]);
			}
		}
		
		

	}

}
