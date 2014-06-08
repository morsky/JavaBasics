/* 9. Write a program that reads two lists of letters l1 and l2 and combines them: appends all 
 * letters c from l2 to the end of l1, but only when c does not appear in l1. Print the obtained
 * combined list. All lists are given as sequence of letters separated by a single space, each at
 * a separate line. Use ArrayList<Character> of chars to keep the input and output lists.
 * Examples:
 * Input		Output
 * h e l l o	h e l l o w
 * l o w
 * 
 * a b c d		a b c d x y z
 * x y z
 * 
 * a b a		a b a
 * b a b a
 */

import java.util.ArrayList;
import java.util.Scanner;

public class _09_CombineListsOfLetters {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList<Character> list1 = new ArrayList<>();
		ArrayList<Character> list2 = new ArrayList<>();
		
		String[] text1 = input.nextLine().split(" ");
		String[] text2 = input.nextLine().split(" ");
	
		for (String string : text1) {
			list1.add(string.charAt(0));
		}
		
		for (String string : text2) {
			list2.add(string.charAt(0));
		}
			
		input.close();
		
		list2.removeAll(list1);
		list1.addAll(list2);
		
		for (Character character : list1) {
			System.out.print(character + " ");
		}
	}
}