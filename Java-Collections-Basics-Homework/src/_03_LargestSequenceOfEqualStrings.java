/* 3. Write a program that enters an array of strings and finds in it the largest sequence of equal
 * elements. If several sequences have the same longest length, print the leftmost of them. The 
 * input strings are given as a single line, separated by a space. 
 * Examples:
 * 			Input			Output
 * hi yes yes yes bye		yes yes yes
 * 1 1 2 2 3 3 4 4 5 5		1 1
 * a b b xxx c c c			c c c
 */

import java.util.Scanner;

public class _03_LargestSequenceOfEqualStrings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
						
		input.close();
		
		String[] allElementst = text.split(" ");
		int maxSeqSize = 1;
		int tempSize = 1;
        String seqElemValue = allElementst[0];
				
        for (int i = 1; i < allElementst.length; i++)
        {
            if (allElementst[i].equals(allElementst[i - 1]))
            {
                tempSize++;
                
                if (tempSize > maxSeqSize) {
					maxSeqSize = tempSize;
					seqElemValue = allElementst[i] + " ";
				}
                
            } else {
				tempSize = 1;
			}
        }
		
        for (int i = 0; i < maxSeqSize; i++) {
			System.out.print(seqElemValue);
		}
	}
}