package javaBasics;

import java.util.Scanner;

public class PaddingConcept {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            
         // Padding = adding zero infront of decimal/to change integer format into 3 decimal => %03d
            String y = String.format("%03d", x);
            
            //System.out.println(s1+"               "+y);
            System.out.printf("%-15s %s\n", s1 , y);
            //printf = print formatted String
            // %-15s = String format printed will be 15 in charater long for first input argument
            //%s = for second input argument
            //\n = next line
        }
        System.out.println("================================");

	}

}
