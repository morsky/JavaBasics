/* 7. Write a program to calculate the difference between two dates in number of days. The dates
 * are entered at two consecutive lines in format day-month-year. Days are in range [1…31]. 
 * Months are in range [1…12]. Years are in range [1900…2100]. 
 * Examples:
 * 	 Input		Output		  Input		Output
 * 30-11-2014	  117	 	14-05-2014	-12387
 * 27-03-2015				14-06-1980
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class _07_DaysBetweenTwoDates {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String startDate = input.nextLine();
		String endDate = input.nextLine();
		
		input.close();
		
		try {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
	        Date start = simpleDateFormat.parse(startDate);
	        Date end = simpleDateFormat.parse(endDate);
	       
	        System.out.println((int)computeDaysBetweenDates(start, end));
		}
		catch (ParseException format){
			System.out.println("Format is differnet from dd-MM-yyyy!");
		}

    }
   
    public static double computeDaysBetweenDates(Date d1, Date d2) {
        long diff;
        diff = d2.getTime() - d1.getTime();
        return ((double) diff) / (1000 * 24 * 60 * 60);
    }
}