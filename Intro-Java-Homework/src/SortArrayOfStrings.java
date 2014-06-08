import java.util.Arrays;
import java.util.Scanner;

/* 8. Write a program that enters from the console number n and n strings, then sorts
 * them alphabetically and prints them. Note: you might need to learn how to use loops
 * and arrays in Java (search in Internet).
 * Examples:
 * Input	Output
 *   5		Bourgas
 * Sofia	Pleven
 * Plovdiv	Plovdiv
 * Varna	Sofia
 * Pleven	Varna
 * Bourgas	
 */

public class SortArrayOfStrings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Ener number of strings: ");
		
		int numOfStrings = input.nextInt();
		String[] str = new String[numOfStrings];
		
		input.nextLine();
		
		for (int i = 0; i < numOfStrings; i++) {
			str[i] = input.nextLine();
		}
		
		input.close();
		
		Arrays.sort(str);
		
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}

}
