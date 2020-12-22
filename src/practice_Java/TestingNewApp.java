package practice_Java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class TestingNewApp {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> customerName;
		ArrayList<String> customerAddress;
		String EnteredName = null;
		String EnteredAddress = null;
		PrintStream store = new PrintStream(new FileOutputStream("C:\\Users\\User\\Desktop\\eclipse"
				+ "\\JavaTraining\\DataStorage.txt"));
		
		for(int i=0; i<=2; i++) {
		System.out.println("Enter Name: ");
		String Name = scan.nextLine();
		
		System.out.println("Enter Address: ");
		String Address = scan.nextLine();
		
		customerName = new ArrayList<String>();
		customerAddress = new ArrayList<String>();
		
		customerName.add(Name);
		customerAddress.add(Address);
		
		for(int j=0; j<customerName.size();j++) {
			EnteredName = customerName.get(j);
			EnteredAddress = customerAddress.get(j);
		}
		
		store.format(EnteredName+" ", "Customer Name").println();
		store.format(EnteredAddress+" ", "Address").println();
		
		System.out.println("Your name is " +Name+" from "+Address);
		System.out.println("Welcome New Customer: "+EnteredName);
		System.out.println(EnteredName+" your address "+EnteredAddress+" is updated in the system.");
		
		}
	
	}

}
