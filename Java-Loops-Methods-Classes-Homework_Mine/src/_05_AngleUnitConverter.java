/* 5. Write a method to convert from degrees to radians. Write a method to convert from radians to 
 * degrees. You are given a number n and n queries for conversion. Each conversion query will 
 * consist of a number + space + measure. Measures are "deg" and "rad". Convert all radians to 
 * degrees and all degrees to radians. Print the results as n lines, each holding a 
 * number + space + measure. Format all numbers with 6 digit after the decimal point. 
 * Examples:
 * Input	Output
 *   3		3.141593 rad
 * 180 deg	1.570796 rad
 * 90 deg	171.887339 deg
 * 3 rad	
 */

import java.util.Scanner;

public class _05_AngleUnitConverter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int timesInRow = input.nextInt();
		input.nextLine();
		String[] inputText = new String[timesInRow];
		
		for (int i = 0; i < timesInRow; i++) {
			inputText[i] = input.nextLine();
		}
		
		input.close();
		convertAngle(inputText);
	}
	
	public static void convertAngle(String[] inputText) {
		for (int i = 0; i < inputText.length; i++) {
			String[] data = inputText[i].split(" ");
			double degrees = Double.parseDouble(data[0]);
			String degreesType = data[1];
			
			if (degreesType.equals("rad")) {
				System.out.printf("%.6f deg %n", (degrees / 0.0174532925));
			} else {
				System.out.printf("%.6f rad %n", (degrees * 0.0174532925));
			}
		}
	}
}