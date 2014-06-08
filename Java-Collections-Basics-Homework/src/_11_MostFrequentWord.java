/* 11. Write a program to find the most frequent word in a text and print it, as well as how many
 * times it appears in format "word -> count". Consider any non-letter character as a word separator.
 * Ignore the character casing. If several words have the same maximal frequency, print all of them
 * in alphabetical order. 
 * Examples:
 * 			Input						Output
 * in the middle of the night		the -> 2 times
 * Welcome to SoftUni. Welcome 		welcome -> 3 times
 * to Java. Welcome everyone.
 * 
 */

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _11_MostFrequentWord {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String text = input.nextLine().toLowerCase();
		String[] words = text.split("\\W+");
		
		input.close();
		
		TreeMap<String, Integer> wordCount = new TreeMap<>();
		int countMax = 0;
		
		for (String word : words) {
			Integer count = wordCount.get(word);
			
			if (count == null) {
				count = 0;
			}
			if (count + 1 > countMax) {
				countMax = count + 1;
			}
			wordCount.put(word, count + 1);
		}

		for (Map.Entry<String, Integer> wordEntry : wordCount.entrySet()) {
			if (wordEntry.getValue() == countMax) {
				System.out.printf("%s -> %d times %n", wordEntry.getKey(), wordEntry.getValue());
			}
		}
	}
}