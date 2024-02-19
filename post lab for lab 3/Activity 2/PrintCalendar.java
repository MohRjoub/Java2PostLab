package lab3;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class PrintCalendar {
	public static void main(String[] args) {
		 Calendar calendar = new GregorianCalendar(2023, 10, 1);

	        int daysNum = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

	        int firstDay = calendar.get(Calendar.DAY_OF_WEEK);
System.out.println(daysNum);
	        System.out.println("       Novembeer 2023");
	        System.out.println("-----------------------------");
	        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

	        for (int i = 1; i < firstDay; i++) {
	            System.out.print("    ");
	        }

	        for (int i = 1; i <= daysNum; i++) {
	            System.out.printf("%4d", i);

	            if ((i + firstDay - 1) == 7||(i + firstDay - 1) == 14 
	            		||(i + firstDay - 1) == 21 ||(i + firstDay - 1) == 28  ) {
	                System.out.println();
	            }
	        }
	}

}
