/* 2. Write a program to generate and print all 3-letter words consisting of given set of characters.
 * For example if we have the characters 'a' and 'b', all possible words will be "aaa", "aab", "aba",
 * "abb", "baa", "bab", "bba" and "bbb". The input characters are given as string at the first line
 * of the input. Input characters are unique (there are no repeating characters). 
 * Examples:
 * Input	Output
 * 	  x		xxx
 * 	 ab		aaa aab aba abb baa bab bba bbb
 * 	abx		aaa aab aax aba abb abx axa axb axx
 * 			baa bab bax bba bbb bbx bxa bxb bxx
 * 			xaa xab xax xba xbb xbx xxa xxb xxx
 */

import java.util.Scanner;

public class _02_GenerateThreeLetterWords {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String inputText = input.nextLine();
		StringBuilder result = new StringBuilder();
		input.close();
		
		for (int i = 0; i < inputText.length(); i++) {
			for (int j = 0; j < inputText.length(); j++) {
				for (int j2 = 0; j2 < inputText.length(); j2++) {
					//result += "" + i + j + j2 + " ";
					result.append("" + inputText.charAt(i) + inputText.charAt(j) 
									 + inputText.charAt(j2) + " ");					
				}
			}
		}
		
		System.out.println(result);
	}
}