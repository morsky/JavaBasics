/* 4. Write a program to find all increasing sequences inside an array of integers. The integers are
 * given in a single line, separated by a space. Print the sequences in the order of their appearance
 * in the input array, each at a single line. Separate the sequence elements by a space. Find also 
 * the longest increasing sequence and print it at the last line. If several sequences have the same
 * longest length, print the leftmost of them.
 * Examples:
 * Input				Output
 * 2 3 4 1 50 2 3 4 5	2 3 4
 * 						1 50
 * 						2 3 4 5
 * 						Longest: 2 3 4 5
 * 
 * 1 2 3 4 5 6 7 8 9	1 2 3 4 5 6 7 8 9
 * 						Longest: 1 2 3 4 5 6 7 8 9
 */

import java.util.ArrayList;
import java.util.Scanner;

public class _04_LongestIncreasingSequence {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
						
		input.close();
		
		String[] allElementst = text.split(" ");
		int[] allNumbers = new int[allElementst.length];
		
		// Convert text string to string of numbers
		for (int i = 0; i < allElementst.length; i++) {
			allNumbers[i] = Integer.parseInt(allElementst[i]);
		}
		
		ArrayList<String> printElement = new ArrayList<>();
		String tempString = "";
		int count = 0;
		
		for (int i = 0; i <= allNumbers.length - 1; i++) {
			if (i == allNumbers.length - 1) {
				if (allNumbers[i] > allNumbers[i - 1]) {
					if (tempString == "") {
						tempString += allElementst[i];
					}
					
					continue;
				} else {
					tempString = allElementst[i];
					continue;
				}
			}
			
			if (allNumbers[i] < allNumbers[i + 1]) {
				count++;
				
				if (count == 1) {
					tempString += allNumbers[i] + " " + allNumbers[i + 1];
				} else {
					tempString += " " + allElementst[i + 1];
				}
			} else {
				if (tempString.equals("")) {
					tempString = "" + allNumbers[i];
				}
				printElement.add(tempString);
				tempString = "";
				count = 0;
			}
		}
		
		printElement.add(tempString);
		
		String longest = "";
		int maxSequence = 0;
		
		for (String string : printElement) {
			System.out.println(string);
			count = string.length();
		
			if (maxSequence < count) {
				maxSequence = count;
				longest = string;
			}
		}
		
		System.out.println("Longest: " + longest);
	}
}