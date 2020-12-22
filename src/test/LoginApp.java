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
		
		Iterator<String> it = registrationArray.iterator();
		
		while(it.hasNext()) {
			String DBusername = null;
			String DBpassword = null;
			
			if(inputUserName.equals(userName)) {
				DBusername = it.next();
				System.out.println(DBusername);
			}
			if(inputPassword.equals(password)){
				DBpassword = it.next();
				System.out.println(DBpassword);
			}
		
			System.out.println(DBusername);
			System.out.println(DBpassword);
		System.out.println("*********************************************");
		if(inputUserName.equals(DBusername) && inputPassword.equals(DBpassword)) {
			System.out.println("Login Success:");
			System.out.println("Welcome back "+firstName+"!");
		}
		else if(!inputUserName.equals(DBusername) || !inputPassword.equals(DBpassword)) {
			System.out.println("Invalid username or password. Re-enter valid credentials.");
			System.out.print("User Name: ");
			String ReEnterUserName = scan.next();
			System.out.print("Password: ");
			String ReEnterPassword = scan.next();
			
			if(ReEnterUserName.equals(DBusername) && ReEnterPassword.equals(DBpassword)) {
				System.out.println("Login Success:");
				System.out.println("Welcome back "+firstName+"!");
			}
			else {
				System.out.println("Access denied. Account locked. Contact customer service.");
			}	
		}
		else {
			System.out.println("Access denied. Account locked. Contact customer service.");
		}
		System.out.println("*********************************************");
	}
	}
}
