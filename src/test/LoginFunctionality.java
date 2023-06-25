package test;

import java.util.HashMap;
import java.util.Scanner;

public class LoginFunctionality {
	static Scanner scan = new Scanner(System.in);
	
	public static HashMap<String, String> regististration() {
		HashMap<String, String> details = new HashMap<String,String>();
		System.out.println("New Customer Registration: ");
		System.out.println("---------------------------------");
		System.out.println("First Name: ");
		details.put("firstName", scan.nextLine());
		System.out.println("Last Name: ");
		details.put("lastName", scan.nextLine());
		System.out.println("Username: ");
		details.put("username", scan.nextLine());
		System.out.println("Password: ");
		details.put("password", scan.nextLine());
		System.out.println("Re-enter password: ");
		details.put("reEnterPassword", scan.nextLine());
		System.out.println("-----------------------------");
		System.out.println("Thank you for registering.");
		return details;
	}
	
	public static void validateCredentials(HashMap<String,String> hm, String username, String password) {
		String userNameDB = null;
		String passwordDB = null;
		
		if(hm.containsKey("username")) {
			userNameDB = hm.get("username");
			}
		if(hm.containsKey("password")) {
			passwordDB = hm.get("password");
			}
		if(userNameDB.equals(username) && passwordDB.equals(password)) {
			System.out.println("Login verified.");
		}
		else {
			System.err.println("Login denied. Try again.");
			if(userNameDB.equals(enterUsername()) && passwordDB.equals(enterPassword())) {
				System.out.println("Login verified.");
			}else {
				System.err.println("Login denied. Try again.");
				if(userNameDB.equals(enterUsername()) && passwordDB.equals(enterPassword())) {
					System.out.println("Login verified.");
				}else {
					System.err.println("Account locked. Contact customer service.");
				}
			}
		}
	}
	
	public static String enterUsername() {
		System.out.println("-----------------------------");
		System.out.println("Enter username: ");
		String username = scan.next();
		return username;
	}
	
	public static String enterPassword() {
		System.out.println("Enter password: ");
		String password = scan.next();
		System.out.println("-----------------------------");
		return password;
	}

	public static void main(String[] args) {
		validateCredentials(regististration(), enterUsername(), enterPassword());
	}

}
