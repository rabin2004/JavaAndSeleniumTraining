package InterfaceConcept;

public class HSBC implements USBank, BrazilBank { // we are achieving multiple inheritance --2 parents =>"Is-a relationship" => interface to class relationship

	//overriding from USbank
	public void credit() { // all method from interface must be implemented/override --method body needs to included
		System.out.println("HSBC---credit");
	}
	
	public void debit() {
		System.out.println("HSBC---debit");
	}
	
	public void tranferMoney() {
		System.out.println("HSBC---transferMoney");
	}
	
	//separate method
	public void educationLoan() {
		System.out.println("HSBC---educationLoan");
	}
	
	public void carLoan() {
		System.out.println("HSBC---carLoan");
	}
	
	//overriding from BrazilBank
	public void mutualFund() {
		System.out.println("HSBC---mutualfund");
	}
}
