import java.util.Scanner;

/* Write a program that enters a positive integer number num and converts and prints it in hexadecimal form.
 * You may use some built-in method from the standard Java libraries. Examples:
 * Input	Output
 *  254		  FE
 * 6779		1A7B
 */
public class DecimalToHexadecimal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		input.close();
		
		System.out.printf("%1X", num);
	}
}