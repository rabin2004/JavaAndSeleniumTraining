package javaBasics;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarConcept {

	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		
		SimpleDateFormat sdf = new SimpleDateFormat();
		
		System.out.println(c.getTime());
		
		System.out.println(sdf.format(c.getTime()));
		
		System.out.println(Calendar.DAY_OF_MONTH);
		
		System.out.println(Calendar.HOUR_OF_DAY);
		
		System.out.println(Calendar.DAY_OF_YEAR);
	}

}
