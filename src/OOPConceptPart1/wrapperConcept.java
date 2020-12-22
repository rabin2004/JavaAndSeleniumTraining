package OOPConceptPart1;

public class wrapperConcept {
	
	public static void main(String[] arg) {
		
		// Wrapper concept - converting one datatype to different 
			
			String x = "100";
			
			System.out.println(x+50);
			
		// String into int datatype
			int y = Integer.parseInt(x);
			
			System.out.println(y+50);
			
			String a = "10.55";
			
			System.out.println(a+10);
			
		// String into Double datatype
			Double b = Double.parseDouble(a);
			
			System.out.println(b+10);
			
			String m = "False";
			
			System.out.println("Number of letters in false: "+m.length());
			
		//	String into Boolean datatype
			Boolean n = Boolean.parseBoolean(m);
			
			System.out.println(n); // n = boolean false not String False/ so can't use .length() method
			
			int i = 500;
			
			System.out.println(i+50);
			
		// int into String datatype
			String j = String.valueOf(i); // now j = "500", which is a string value
			
			System.out.println(j+50);
			
			double d = 5.55;
			
			System.out.println(d+5);
		// double into String datatype
			String e = String.valueOf(d);
			
			System.out.println(e+5);
		
		// if not pure numeric String converted into int datatype	
			String w = "500b";
			
			int v = Integer.parseInt(w);
			
			System.out.println(v); // will throw NumberFormatException: For input string: "500b"
			
		}
	}