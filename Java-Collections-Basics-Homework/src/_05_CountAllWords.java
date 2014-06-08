/* 5. Write a program to count the number of words in given sentence. Use any non-letter character
 * as word separator.
 * Examples:
 * 					Input							Output
 * Welcome to the Software University (SoftUni)!	6
 * I am coming...									3
 * It's OK, I'm in.									6
 */

import java.util.Scanner;

public class _05_CountAllWords {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		String[] allWords = text.split("\\w+");
						
		input.close();
		
		System.out.println(allWords.length - 1);
	}
}