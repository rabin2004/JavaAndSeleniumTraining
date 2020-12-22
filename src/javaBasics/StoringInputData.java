package javaBasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StoringInputData {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String FirstName;
		String LastName;
		
		ArrayList FirstNameList = new ArrayList();
		ArrayList LastNameList = new ArrayList();
		
		for(int i=0; i<=2; i++) {
		System.out.println("Enter First Name");
		FirstName = sc.nextLine();
		
		System.out.println("Enter Last Name");
		LastName = sc.nextLine();
		
		FirstNameList.add(FirstName);
		LastNameList.add(LastName);
		
		System.out.println("#################################");
		System.out.println("Welcome: "+FirstName+" "+LastName);
		System.out.println("*********************************");
		}
		
//		for(int i=0; i<FirstNameList.size(); i++) {
//			System.out.println(FirstNameList.get(i));
//		}
//		for(int j=0; j<LastNameList.size(); j++) {
//			System.out.println(LastNameList.get(j));
//		}
		
		System.out.println("#################################");
		
		for(int i=0; i<FirstNameList.size()|i<LastNameList.size(); i++) {
		System.out.println("Thanks for visiting: "+FirstNameList.get(i)+" "+LastNameList.get(i));
		}
		
		ArrayList CustomerName = new ArrayList();
		for(int i=0; i<FirstNameList.size()|i<LastNameList.size(); i++) {
		CustomerName.add(FirstNameList.get(i)+" "+LastNameList.get(i));
		}
		
		Collections.sort(CustomerName);
		
		System.out.println("##########List of Customers visited in ascending order:###############");
		
		for(int i=0; i<CustomerName.size(); i++) {
			System.out.println(CustomerName.get(i));
		}
		
		Collections.reverse(CustomerName);
		
		System.out.println("##########List of Customers visited in descending order:###############");
		
		for(int i=0; i<CustomerName.size(); i++) {
			System.out.println(CustomerName.get(i));
		}
	}

}
