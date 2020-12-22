package javaBasics;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConcept {

	public static void main(String[] args) {

		// create date object from util class
		Date d = new Date();
		
		System.out.println(d.toString()); // get current date and print
		
		// if want to print in MM/dd/YYYY hh:mm:ss
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/YYYY");
		
		System.out.println(sdf.format(d)); // date object converted into desired format & printed
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("MM/dd/YYYY hh:mm:ss");
		System.out.println(sdf1.format(d));
		
	}

}
