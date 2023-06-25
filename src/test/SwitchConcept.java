package test;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SwitchConcept {
	Scanner scan = new Scanner(System.in);
	static SwitchConcept sc = new SwitchConcept();
	
	public void basicCalculation() {
		System.out.print("Provide first value: ");
		double firstValue = scan.nextDouble();
		System.out.print("Provide second value: ");
		double secondValue = scan.nextDouble();
		System.out.print("Select operation (+,-,/,*): ");
		String operationType = scan.next();
		scan.close();
		
		switch(operationType) {
		case "+":
			System.out.println("Addition: "+(firstValue+secondValue));
			break;
		case "-":
			System.out.println("Substraction: "+(firstValue-secondValue));
			break;
		case "/":
			System.out.println("Division: "+(firstValue/secondValue));
			break;
		case "*":
			System.out.println("Multiplication: "+(firstValue*secondValue));
			break;
		default:
			System.out.println("Invalid operation");
		}
	}
	
	public void bankBranchServiceSelectionPortal() {
		System.out.println("Select one of these service types: "+"\n"
								+ "Open Bank Account"+"\t"+"(1)"+"\n"
								+ "Apply credit card"+"\t"+"(2)"+"\n"
								+ "Apply Personal Loan"+"\t"+"(3)"+"\n"
								+ "Apply Mortgage"+"\t\t"+"(4)"+"\n"
								+ "Customer Service"+"\t"+"(5)"+"\n");
		System.out.print("Enter number for the desired service: ");
		String serviceType = scan.next();
		System.out.println("---------------------------------------------");
		
		switch(serviceType) {
		case "1":
			System.out.println("New account application form:");
			System.out.println("---------------------------------------------");
			fillRegistrationForm();
			break;
		case "2":
			System.out.println("Credit card application form:");
			System.out.println("---------------------------------------------");
			creditCardApplicationForm();
			break;
		case "3":
			System.out.println("New loan application form.");
			System.out.println("---------------------------------------------");
			loanApplicationForm();
			break;
		case "4":
			System.out.println("See mortgage officer.");
			System.out.println("---------------------------------------------");
			toSeeMortgageOfficer();
			break;
		case "5":
			System.out.println("See customer service representative");
			System.out.println("---------------------------------------------");
			toSeeCustomerServiceRep();
			break;
		default:
			System.out.println("Sorry, not an available service.");
		}
	}
	
	public void toSeeMortgageOfficer() {
		System.out.println("Please enter following informations."+"\n"
						+"Will come to see you as soon as possible.");
		System.out.print("Enter first name: ");
		String firstName = scan.next();
		System.out.print("Enter email address: ");
		String email = scan.next();
		System.out.print("Enter phone number: ");
		String phoneNumber = scan.next();
		
		System.out.println("---------------------------------------------");
		System.out.println("Please check:"+"\n"
							+"Name:"+"\t\t"+firstName+"\n"
							+"Email:"+"\t\t"+email+"\n"
							+"Phone Number:"+"\t"+phoneNumber);
		System.out.println("If correct, please be seated. Somebody will assist you soon.");
		System.out.println("If any issue, please contact customer service representative.");
	}
	
	public void toSeeCustomerServiceRep() {
		System.out.println("Please enter following informations."+"\n"
						+"Will come to see you as soon as possible.");
		System.out.print("Enter first name: ");
		String firstName = scan.next();
		System.out.print("Enter email address: ");
		String email = scan.next();
		System.out.print("Enter phone number: ");
		String phoneNumber = scan.next();
		System.out.print("Reason for visit: ");
		String reason = scan.next();
		
		System.out.println("---------------------------------------------");
		System.out.println("Please check:"+"\n"
							+"Name:"+"\t\t\t"+firstName+"\n"
							+"Email:"+"\t\t\t"+email+"\n"
							+"Phone Number:"+"\t\t"+phoneNumber+"\n"
							+"Reason for visit:"+"\t"+reason);
		System.out.println("If correct, please be seated. Somebody will assist you soon.");
		System.out.println("If any issue, please contact customer service representative.");
	}
	
	public void fillRegistrationForm() {
		System.out.println("Provide following details:");
		System.out.print("First Name: ");
		String firstName = scan.next();
		System.out.print("Last Name: ");
		String lastName = scan.next();
		System.out.print("DOB: ");
		String dob = scan.next();
		System.out.print("Email: ");
		String email = scan.next();
		System.out.print("Phone Number: ");
		String phoneNumber = scan.next();
		System.out.print("State: ");
		String state = scan.next();
		System.out.println("---------------------------------------------");
		
		String[] newCustomer = {firstName,lastName,dob,email,phoneNumber,state};
		List<String> newCustomerList = Arrays.asList(newCustomer);
		for(String value: newCustomerList) {
			System.out.print("|"+value+"|"+"\n");
		}
		System.out.println();
		System.out.println("Please check above information provided.");
		System.out.println("Thanks for trusting us."+"\n"
				+ "Please check your email for activation code and further process.");
	}
	
	public void creditCardApplicationForm() {
		System.out.println("Provide following details:");
		System.out.print("First Name: ");
		String firstName = scan.next();
		System.out.print("Last Name: ");
		String lastName = scan.next();
		System.out.print("DOB: ");
		String dob = scan.next();
		System.out.print("Email: ");
		String email = scan.next();
		System.out.print("Phone Number: ");
		String phoneNumber = scan.next();
		System.out.print("State: ");
		String state = scan.next();
		System.out.println("---------------------------------------------");
		
		String[] newCustomer = {firstName,lastName,dob,email,phoneNumber,state};
		List<String> newCustomerList = Arrays.asList(newCustomer);
		for(String value: newCustomerList) {
			System.out.print("|"+value+"|"+"\n");
		}
		System.out.println();
		System.out.println("Please check above information provided.");
		System.out.println("Thanks for trusting us. Check email to finish up rest of the process.");
	}
	
	public void loanApplicationForm() {
		System.out.println("Provide following details:");
		System.out.print("First Name: ");
		String firstName = scan.next();
		System.out.print("Last Name: ");
		String lastName = scan.next();
		System.out.print("DOB: ");
		String dob = scan.next();
		System.out.print("Email: ");
		String email = scan.next();
		System.out.print("Phone Number: ");
		String phoneNumber = scan.next();
		System.out.print("State: ");
		String state = scan.next();
		System.out.println("---------------------------------------------");
		
		String[] newCustomer = {firstName,lastName,dob,email,phoneNumber,state};
		List<String> newCustomerList = Arrays.asList(newCustomer);
		for(String value: newCustomerList) {
			System.out.print("|"+value+"|"+"\n");
		}
		System.out.println();
		System.out.println("Please check above information provided.");
		System.out.println("Thanks for trusting us. Check email to finish up rest of the process.");
	}

	public static void main(String[] args) {
//		sc.basicCalculation();
		sc.bankBranchServiceSelectionPortal();

	}

}
