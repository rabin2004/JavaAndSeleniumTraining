package practice_Java;

public class StringReverse {

	public static void main(String[] args) {
		
		String a = "Rabin Upama Rubin";
		
		StringBuffer sb = new StringBuffer(a);
		
		System.out.println(sb.reverse());
		
		int l =a.length();
		String reverse = "";
		
		for(int i =l-1; i>=0; i--) {
			
			reverse = reverse+a.charAt(i);
			
		}
		System.out.println(reverse);

	}

}
