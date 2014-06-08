/* 1. Write a program to enter a number n and n integer numbers and sort and print
 * them. Keep the numbers in array of integers: int[]. 
 * Examples:
 * Input				Output
 * 7					-3 4 4 5 6 10 120
 * 6 5 4 10 -3 120 4
 */

import java.util.Arrays;
import java.util.Scanner;

public class _01_SortArrayOfNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int arraySize = input.nextInt();
		int[] array = new int[arraySize];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		
		input.close();
		Arrays.sort(array);
		
		for (int item : array) {
			System.out.println(item);
		}
	}
}