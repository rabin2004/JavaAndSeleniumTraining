package logics;

public class CustomerReg {
	
	protected boolean isStringOnlyAlphabet(String name) {
		return ((name!=null)&&(!name.equals("")&&(name.matches("^[a-zA-Z]*$"))));
	}

}
