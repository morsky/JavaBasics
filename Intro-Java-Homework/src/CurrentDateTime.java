/* Create a simple Java program CurrentDateTime.java to print the current date and time.
 * Submit the Java class CurrentDateTime as part of your homework.
 */

import java.time.LocalDateTime;
import java.util.Date;

public class CurrentDateTime {

	public static void main(String[] args) {
		System.out.println("Date and time - not formated:");
		System.out.println(LocalDateTime.now() + "\n");
				
		Date date = new java.util.Date();
		System.out.println("Date and time - formated:");
		System.out.printf("Current time is: %1$tH:%1$tM:%1$tS%n", date);		
		System.out.printf("Current date is: %1$td/%1$tm/%1$tY%n", date);
	}
}