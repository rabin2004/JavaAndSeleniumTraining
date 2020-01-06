package InterfaceConcept;

public interface USBank {

	int min_bal=100;
	
	//in Interface = no method body --only method prototype
	//only method declaration
	//in Interface, we can declare the variables, variables are by default static in nature
	//variables value will not be changed/ constant in nature
	//no static method in interface
	//no main method in interface
	//we can't create the object of Interface
	//Interface is abstract in nature
	public void credit();
	
	public void debit();
	
	public void tranferMoney();
	
}
