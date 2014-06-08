/* Write a program to count how many sequences of two equal bits 
 * ("00" or "11") can be found in the binary representation of given
 * integer number n (with overlapping). Examples:
 *	 n		binary representation of n	count
 * 	   5	101							  0
 *    15	1111						  3
 * 62241	1111001100100001			  9
 */

import java.util.Scanner;

public class CountOfEqualBitPairs {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an non negative integer: ");
		int inputNumber = input.nextInt();
		String number = Integer.toBinaryString(inputNumber);
		int count = 0;
		
		input.close();
		
		for (int i = 0; i < number.length() - 1; i++) {
			char ch = number.charAt(i);
			char chNext = number.charAt(i + 1);
			
			if (ch == chNext) {
				count++;
			}
		}
		
		System.out.println("number: " + inputNumber);
		System.out.println("binary representation: " + number);
		System.out.println("count: " + count);

	}
}