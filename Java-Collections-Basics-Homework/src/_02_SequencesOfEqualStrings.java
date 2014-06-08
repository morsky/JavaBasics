import java.util.Scanner;

/* 2. Write a program that enters an array of strings and finds in it all sequences 
 * of equal elements. The input strings are given as a single line, separated by a
 * space. Examples:
 * Input					Output
 * hi yes yes yes bye		hi
 * 							yes yes yes
 * 							bye
 * 
 * 1 1 2 2 3 3 4 4 5 5		1 1
 * 							2 2
 * 							3 3
 * 							4 4	
 * 							5 5
 */


public class _02_SequencesOfEqualStrings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		
		input.close();
		
		String[] allElementst = text.split(" ");
				
		for (int i = 0; i <= allElementst.length - 1; i++) {
			if (i == allElementst.length - 1) {
				printElementsOnNewLine(allElementst, i);
			} else {
				if (allElementst[i].equals(allElementst[i + 1])) {
					printElementsOnSameLine(allElementst, i);
				} else {
					printElementsOnNewLine(allElementst, i);
				}
			}
		}
	}
	
	public static void printElementsOnNewLine(String[] allElementst, int i) {
		System.out.println(allElementst[i]);
	}
	
	public static void printElementsOnSameLine(String[] allElementst, int i) {
		System.out.print(allElementst[i] + " ");
	}
}