/* 10. At the first line at the console you are given a piece of text. Extract all words from it and
 * print them in alphabetical order. Consider each non-letter character as word separator. Take the
 * repeating words only once. Ignore the character casing. Print the result words in a single line,
 * separated by spaces.
 * Examples:
 * 				Input								Output
 * Welcome to SoftUni. Welcome to Java.		java to softuni welcome
 * What is better: Java SE or Java EE?		better ее is java or se what 
 * hello									hello
 */

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class _10_ExtractAllUniqueWords {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		String[] allWords = text.split("\\W+");
		
		input.close();
		
		Set<String> uniqueWords = new TreeSet<String>();
		
		for (int i = 0; i < allWords.length; i++) {
			uniqueWords.add(allWords[i].toLowerCase());
		}
		
		for (String string : uniqueWords) {
			System.out.print(string + " ");
		}
	}
}