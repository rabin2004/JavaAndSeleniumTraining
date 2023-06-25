package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class LoginApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList registrationArray = new ArrayList();
		
		//User Registration
		System.out.println("*********************************************");
		System.out.println("Registration:");
		System.out.println("*********************************************");
		System.out.print("First Name: ");
		String firstName = scan.next();
		System.out.print("Last Name: ");
		String lastName = scan.next();
		System.out.print("Sex: ");
		String sex = scan.next();
		System.out.print("Date of Birth: ");
		String dob = scan.next();
		System.out.print("Email Address: ");
		String emailAdd = scan.next();
		System.out.print("User Name: ");
		String userName = scan.next();
		System.out.print("Password: ");
		String password = scan.next();
		
		registrationArray.add(firstName);
		registrationArray.add(lastName);
		registrationArray.add(sex);
		registrationArray.add(dob);
		registrationArray.add(emailAdd);
		registrationArray.add(userName);
		registrationArray.add(password);
		
		//User Login
		System.out.println("*********************************************");
		System.out.println("Login Page:");
		System.out.println("*********************************************");
		System.out.print("User Name: ");
		String inputUserName = scan.next();
		System.out.print("Password: ");
		String inputPassword = scan.next();
		
		if(inputUserName.equals(userName) && inputPassword.equals(password)) {
			System.out.println("Login allowed:");
			System.out.println("Welcome back "+registrationArray.get(0)+"!");
		}
		else if(!inputUserName.equals(userName) || !inputPassword.equals(password)) {
			System.out.println("Invalid username or password. Enter correct credentials.");
			System.out.print("User Name: ");
			String reEnterUserName = scan.next();
			System.out.print("Password: ");
			String reEnterPassword = scan.next();
			if(reEnterUserName.equals(userName) && reEnterPassword.equals(password)) {
				System.out.println("Login allowed:");
				System.out.println("Welcome back "+registrationArray.get(0)+"!");
			}
			else {
				System.out.println("Account locked. Contact technical team.");
			}
		}
		else {
			System.out.println("User not registered. Register first.");
		}
	}
}
