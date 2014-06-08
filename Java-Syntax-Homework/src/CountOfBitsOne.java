/* Write a program to calculate the count of bits 1 in the binary representation of
 * given integer number n. Examples:
 * 	n		binary representation of n	count
 * 	5		  	00000000 00000101		  2
 * 	0			00000000 00000000		  0
 * 5343			00010100 11011111		  7
 */
import java.util.Scanner;

public class CountOfBitsOne {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an non negative integer: ");
		int a = input.nextInt();
		
		input.close();
		
		//Variant 1
		System.out.println("Variant I");
		System.out.println("number: " + a);
		System.out.println("binary representation: " + Integer.toBinaryString(a));
		System.out.println("count: " + Integer.bitCount(a));
		System.out.println();
		
		//Variant 2
		System.out.println("Variant II");
		String number = Integer.toBinaryString(a);
		int count = 0;
		
		for (int i = 0; i < number.length(); i++) {
			char ch = number.charAt(i);
			
			if (ch == '1') {
				count++;
			}
		}
		
		System.out.println("number: " + a);
		System.out.println("binary representation: " + Integer.toBinaryString(a));
		System.out.println("count: " + count);
	}
}