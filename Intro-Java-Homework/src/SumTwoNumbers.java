import java.util.Scanner;

/* Write a program SumTwoNumbers.java that enters two integers from the console,
 * calculates and prints their sum. Search in Internet to learn how to read numbers
 * from the console.
 * Examples:
 * 	a	b	result
 *  6	2	  8
 * 12  -7	  5
 */

public class SumTwoNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		
		
		System.out.print("Enter a = ");
		int a = input.nextInt();
		
		System.out.print("Enter b = ");
		int b = input.nextInt();
		
		input.close();
		
		int sum = a + b;
		
		System.out.println("a + b = " + sum);
	}
}