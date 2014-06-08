import java.math.BigInteger;
import java.util.Scanner;

/* 6. Write a program that reads 3 numbers: an integer a (0 ≤ a ≤ 500),
 * a floating-point b and a floating-point c and prints them in 4 virtual
 * columns on the console. Each column should have a width of 10 characters.
 * The number a should be printed in hexadecimal, left aligned; then the 
 * number a should be printed in binary form, padded with zeroes, then the 
 * number b should be printed with 2 digits after the decimal point, right 
 * aligned; the number c should be printed with 3 digits after the decimal 
 * point, left aligned. Examples:
 * 
 *  a	 b		 c						result
 * 254	11.6	0.5	|FE        |0011111110|     11.60|0.500     |
 * 444	-7.5	7.5	|1BC       |0110111100|      -7.5|7.500     |
 */

public class FormattingNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer number: ");
		
		int a = input.nextInt();
		float b = input.nextFloat();
		float c = input. nextFloat();
						
		input.close();
		
		System.out.printf("|%-10X", a);
		//System.out.printf("|%10s", Integer.toBinaryString(a));
		System.out.print(String.format("|%010d", new BigInteger(Integer.toBinaryString(a))));
		//System.out.printf("|%010d", a);
		System.out.printf("|%10.2f", b);
		System.out.printf("|%-10.3f", c);
		System.out.println("|");

	}
}