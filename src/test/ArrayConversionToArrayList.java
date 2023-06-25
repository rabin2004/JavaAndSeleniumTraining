package test;

import java.util.Arrays;
import java.util.List;

public class ArrayConversionToArrayList {

	public static void main(String[] args) {
		String[][] arr1 = {	{"Matt","Don","07/07/1985","12345","md@gmail.com"},
							{"David","Jones","08/08/1984","67890","dj@gmail.com"},
							{"Macy","Hank","09/09/1983","54321","mh@gmail.com"}};
		
		List<String[]> arrlist = Arrays.asList(arr1);
		String[] employeDetail;
	
		for(int i=0; i<arrlist.size(); i++) {
			employeDetail = arrlist.get(i);
			for(String employee: employeDetail) {
				System.out.print(employee+"\t");
			}
			System.out.println();
			System.out.println("-----------------------------------------------------");
		}
		
		

	}

}
