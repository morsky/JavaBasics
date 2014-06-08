import java.util.Scanner;

/* 4.Write a program that finds the smallest of three numbers. Examples:
 * a	  b		c  		smallest
 * 5  	  2	  	2		 2
 * 0	-2.5   -5		-5
 */

public class SmallestFfThreeNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double minNumber = Math.min(a, Math.min(b, c));
		
		input.close();
		
		System.out.println(minNumber);
	}
}