package practice_Java;

import java.util.Scanner;

public class BasicAlgorithm {
	
	public static void largestNumber(int a, int b, int c) {
		if(a>b && b>c)
			System.out.println(a+" "+"is the largest number.");
		else if(b>c && c>a)
			System.out.println(b+" "+"is the largest number.");
		else if(c>a && a>b)
			System.out.println(c+" "+"is the largest number.");
		else if(a==b && b==c)
			System.out.println("All numbers are same.");
		else if(a==b && b>c)
			System.out.println(a+" & "+b+" "+"is same and"+" "+c+" "+"is smallest.");
		else if(a==b && b<c)
			System.out.println(a+" & "+b+" "+"is same and"+" "+c+" "+"is largest.");
		else if(a==c && c>b)
			System.out.println(a+" & "+c+" "+"is same and"+" "+b+" "+"is smallest.");
		else if(a==c && c<b)
			System.out.println(a+" & "+c+" "+"is same and"+" "+b+" "+"is largest.");
		else if(b==c && a<c)
			System.out.println(b+" & "+c+" "+"is same and"+" "+a+" "+"is smallest.");
		else if(b==c && a>c)
			System.out.println(b+" & "+c+" "+"is same and"+" "+a+" "+"is largest.");
	}
	
	public static void billMix(int a, int cassette) {
		if(a<=20 && cassette==4) {
			System.out.println("Dispense $10 bills only.");
			System.out.println(denominationAvail(cassette));
			
		}
		else if(a<=80 && cassette==4) {
			System.out.println("Dispense mixture of $10 & $20 bills.");
			System.out.println(denominationAvail(cassette));
		}
		else if(a>80 && cassette==4) {
			System.out.println("Dispense mixture of $10, $20, $50 & $100 bills.");
			System.out.println(denominationAvail(cassette));
		}
		else if(a<=20 && cassette==3) {
			System.out.println("Dispense $10 bills only.");
			System.out.println(denominationAvail(cassette));
		}
		else if(a<=80 && cassette==3) {
			System.out.println("Dispense mixture of $10 & $20 bills.");
			System.out.println(denominationAvail(cassette));
		}
		else if(a>80 && cassette==3) {
			System.out.println("Dispense mixture of $10, $20 & $50 bills.");
			System.out.println(denominationAvail(cassette));
		}
		else if(a<=20 && cassette==2) {
			System.out.println("Dispense $10 bills only.");
			System.out.println(denominationAvail(cassette));
		}
		else if(a<=80 && cassette==2) {
			System.out.println("Dispense mixture of $10 & $20 bills.");
			System.out.println(denominationAvail(cassette));
		}
		else if(a>80 && cassette==2) {
			System.out.println("Dispense mixture of $10 & $20 bills.");
			System.out.println(denominationAvail(cassette));
		}
		else if(a>0 && cassette==1) {
			System.out.println("Dispense $20 bills only.");
			System.out.println(denominationAvail(cassette));
		}
		else {
			System.err.println("Can't dispense cash right now.");
			System.out.println(denominationAvail(cassette));
		}
	}
	
	public static String denominationAvail(int a) {
		if(a==4) {
			String msg = "Denomination available:"+"\n"+"$10"+"\t"+"$20"+"\t"+"$50"+"\t"+"$100";
			return msg;
		}
		else if (a==3) {
			String msg = "Denomination available:"+"\n"+"$10"+"\t"+"$20"+"\t"+"$50";
			return msg;
		}
		else if (a==2) {
			String msg = "Denomination available:"+"\n"+"$10"+"\t"+"$20";
			return msg;
		}
		else if (a==1) {
			String msg = "Denomination available:"+"\n"+"$20";
			return msg;
		}
		else {
			String msg = "ATM ran out of cash.";
			return msg;
		}
	}

	public static void main(String[] args) {
//		largestNumber(10,5,10);
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the amount to withdraw: ");
		int withdrawalAmt = scan.nextInt();
		System.out.println();
		System.out.print("Number of available cassettes: ");
		int cassette = scan.nextInt();
		scan.close();
		billMix(withdrawalAmt, cassette);
	}

}
