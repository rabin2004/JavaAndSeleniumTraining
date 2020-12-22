package OOPConceptPart1;

public class LocalVSglobalVariable {
	// class variable - can be accessed by all the method/function
		int number;
		String county;

		public static void main(String[] args) {
			LocalVSglobalVariable d = new LocalVSglobalVariable();
			
			d.enrol();
			d.graduated();
	}
		
		public void enrol() {
			number=20;
			county="Bronx";
			String city = "Manhattan"; // local variable - can only be accessed by specific method/function
			
			System.out.println("Number of student enrolled: "+number +" from "+county +"/"+city);
		}
		
		public void graduated() {
			number=40;
			county="Queens";
			String program = "MA"; // local variable - can only be accessed by specific method/function
			
			System.out.println("Number of student graduated: "+number+" from "+county+"/"+program);
		}
		
		
	}