package javaBasics;

public class InsertingSpaceString {

	public static void main(String[] args) {
		
		String a = "hi";
		String b = "everybody";
		
		StringBuilder sb = new StringBuilder();
		
		if(a.length()>0) {
			sb.append(a.charAt(0));
			
			for(int i=1;i<a.length();i++) {
				sb.append(" ");
				sb.append(a.charAt(i));
			}
			
			sb.append(" ");
			
		if(b.length()>0) {
			sb.append(b.charAt(0));
			
			for(int j=1;j<b.length();j++) {
				sb.append(" ");
				sb.append(b.charAt(j));
			}
			System.out.println(sb);
		}
		}

	}

}
