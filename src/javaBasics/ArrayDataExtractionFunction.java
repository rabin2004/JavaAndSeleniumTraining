package javaBasics;

public class ArrayDataExtractionFunction {

	// get the pair of numbers that if added or different other math operaton return another number
	public static void main(String[] args) {
		int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
		int target = 7;
	
		for(int i=0; i<intArray.length;i++) {
			for(int j=0;j<intArray.length;j++) {
				
			if(intArray[i]+intArray[j]==target) {
				System.out.println(intArray[i]+" "+intArray[j]);
				break;
			}
			}
		}
	}

}
