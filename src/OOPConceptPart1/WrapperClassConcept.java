package OOPConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		
		String x="100";
		System.out.println(x+20);
		
		int i=Integer.parseInt(x); // Data conversion: String into integer
		System.out.println(i+20);
		
		//Integer, Double, Character, Boolean
		
		String y="12.33";
		double d=Double.parseDouble(y); //Data conversion: String into Double
		System.out.println(d+10);
		
		String k="true";
		boolean b=Boolean.parseBoolean(k); //Data conversion: String into Boolean
		System.out.println(b);
		
		int j=200;
		System.out.println(j+20);
		
		String s=String.valueOf(j); //Data conversion: integer into String
		System.out.println(s+20);
		
		String u="100A";
		Integer.parseInt(u); // NumberFormatException will be thrown as String isn't pure numeric value
	}

}
