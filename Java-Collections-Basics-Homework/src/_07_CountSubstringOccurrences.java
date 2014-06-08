/* 7. Write a program to find how many times given string appears in given text as substring. The
 * text is given at the first input line. The search string is given at the second input line. The
 * output is an integer number. Please ignore the character casing.
 * Examples:
 * 		Input			Output
 * aaaaaa				5
 * aa
 * 
 * ababa caba			3
 * aba
 * 
 * Welcome to SoftUni	0
 * Java
 */

import java.util.Scanner;

public class _07_CountSubstringOccurrences {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String text = input.nextLine().toLowerCase();
		String pattern = input.nextLine().toLowerCase();
				
		input.close();

		int index = text.indexOf(pattern);
		int count = 0;
		
		while (index != -1) {
//			System.out.println(index);
			index = text.indexOf(pattern, index + 1);
			count++;
		}
		
		System.out.println(count);
	}
}