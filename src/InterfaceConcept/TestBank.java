package InterfaceConcept;

public class TestBank {

	public static void main(String[] args) {

		HSBC hs=new HSBC(); // can't create object for interface, USBank
		hs.credit(); // overridden method
		hs.debit(); // overridden method
		hs.tranferMoney(); // overridden method
		hs.educationLoan();
		hs.carLoan();
		hs.mutualFund();
		
		//dynamic polymorphism
		//child class object can be referred by parent Interface reference variables
		USBank b=new HSBC();
		b.credit(); // only overridden method can be called
		b.debit();
		b.tranferMoney();
		//b.educationLoan(); & b.carLoan(); -- can't call child class method

		System.out.println(USBank.min_bal);
	}

}
