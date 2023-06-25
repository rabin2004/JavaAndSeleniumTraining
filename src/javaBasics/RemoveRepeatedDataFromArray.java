package javaBasics;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveRepeatedDataFromArray {

	public static void main(String[] args) {
		String[] employeeName = {"John", "Harry", "Mary", "Harry"};
		
		ArrayList<String> employeeNameList = new ArrayList<String>();
		
		for(int i=0; i<employeeName.length; i++) {
			employeeNameList.add(employeeName[i]);
		}
		
		System.out.println(employeeNameList);
		
		HashSet<String> employeeNameSet = new HashSet<String>(employeeNameList);
		System.out.println(employeeNameSet);
	}

}
