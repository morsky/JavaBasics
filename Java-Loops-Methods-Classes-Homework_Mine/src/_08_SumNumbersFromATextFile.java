/* 8. Write a program to read a text file "Input.txt" holding a sequence of integer numbers,
 * each at a separate line. Print the sum of the numbers at the console. Ensure you close 
 * correctly the file in case of exception or in case of normal execution. In case of exception
 * (e.g. the file is missing), print "Error" as a result.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class _08_SumNumbersFromATextFile {

	public static void main(String[] args) {
		try (BufferedReader fileReader = new BufferedReader(new FileReader(
				"lib/input0801.txt"));) {
			int sum = 0;
			String line = null;

			while ((line = fileReader.readLine()) != null) {
				int number = Integer.parseInt(line);

				sum += number;
			}

			System.out.println(sum);

		} catch (IOException fileNotFound) {
			System.out.println("Error");
		}
	}
}