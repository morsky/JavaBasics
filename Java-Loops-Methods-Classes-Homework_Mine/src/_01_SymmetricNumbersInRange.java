/* 1. Write a program to generate and print all symmetric numbers in given range [start…end].
 * A number is symmetric if its digits are symmetric toward its middle. 
 * For example, the numbers 101, 33, 989 and 5 are symmetric, but 102, 34 and 997 are not 
 * symmetric. Examples:
 *   Input	  Output
 *   5 11	  5 6 7 8 9 11
 * 101 110	  101
 * 555 777	  555 565 575 585 595 606 616 626 636 646 656 666 676 686 696 707
 * 			  717 727 737 747 757 767 777
 */

import java.util.Scanner;

public class _01_SymmetricNumbersInRange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String inputText = input.nextLine();
		String[] numbers = inputText.split(" ");
		int startNumber = Integer.parseInt(numbers[0]);
		int endNmuber = Integer.parseInt(numbers[1]);
		StringBuilder result = new StringBuilder();

		input.close();

		for (int i = startNumber; i <= endNmuber; i++) {
			testForSimetricNumber(result, i);
		}

		System.out.println(result);
	}

	public static void testForSimetricNumber(StringBuilder result, int i) {
		String testForSimetric = "" + i;

		int counter = 0;

		for (int j = 0; j < testForSimetric.length() / 2; j++) {
			char firstDigit = testForSimetric.charAt(j);
			char lastDigit = testForSimetric.charAt(testForSimetric.length() - 1 - j);

			if (firstDigit != lastDigit) {
				break;
			} 
			else {
				counter++;
			}
		}

		if (counter == testForSimetric.length() / 2) {
			result.append(testForSimetric + " ");
		}
	}
}