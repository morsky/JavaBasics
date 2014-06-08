/* 1. Write a program that enters the sides of a rectangle (two integers a and b) and calculates
 *  and prints the rectangle's area.
 *  Examples:
 *  Input	Output
 *	 7 20	 140
 *	 5 12	  60
 */

import java.util.Scanner;

public class RectangleArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter two number(a and b) separatet by space: ");
		String inputText = input.nextLine();
		String[] number = inputText.split(" ");
		
		input.close();
		
		int a = Integer.parseInt(number[0]);
		int b = Integer.parseInt(number[1]);
		int resul = a * b;
		
		System.out.println("Perimeter of the rectangle is: " + resul);
	}
}