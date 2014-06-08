/* 6. Write a program to find how many times a word appears in given text. The text is given at the
 * first input line. The target word is given at the second input line. The output is an integer 
 * number. Please ignore the character casing. Consider that any non-letter character is a word 
 * separator. 
 * Examples:
 * 
 * 						Input												Output
 * Welcome to the Software University (SoftUni)! Welcome to programming.	2
 * welcome	
 * 
 * I am coming...															0
 * hello
 */

import java.util.Scanner;

public class _06_CountSpecifiedWord {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		String pattern = input.nextLine();
				
		input.close();
		
		String[] allWords = text.split("\\W+");
		int count = 0;
		
		for (int i = 0; i < allWords.length; i++) {
			if (allWords[i].toLowerCase().equals(pattern.toLowerCase())) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}