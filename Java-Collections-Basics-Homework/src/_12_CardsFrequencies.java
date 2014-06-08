/* 12. We are given a sequence of N playing cards from a standard deck. The input consists of 
 * several cards (face + suit), separated by a space. Write a program to calculate and print at
 * the console the frequency of each card face in format "card_face -> frequency". The frequency 
 * is calculated by the formula appearances / N and is expressed in percentages with exactly 
 * 2 digits after the decimal point. The card faces with their frequency should be printed in the
 * order of the card face's first appearance in the input. The same card can appear multiple 
 * times in the input, but it's face should be listed only once in the output. 
 * Examples:
 * 				Input			Output
 * J♥ 2♣ 2♦ 2♥ 2♦ 2♠ 2♦ J♥ 2♠	J -> 22.22%
 * 								2 -> 77.78%
 * 
 * 10♣ 10♥						10 -> 100.00%
 */

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _12_CardsFrequencies {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		String[] allCard = text.split("\\W+");
		
		input.close();
		
		Map<String, Integer> cardsCounter = new LinkedHashMap<>();
		
		for (String card : allCard) {
			Integer count = cardsCounter.get(card);
			if (count == null) {
				count = 0;
			}
			cardsCounter.put(card, count + 1);
		}
		
		for (Map.Entry<String, Integer> entry : cardsCounter.entrySet()) {
			double presentage = (double) entry.getValue() * (100 / allCard.length);
			System.out.printf("%s -> %.2f%%%n", entry.getKey(), presentage);
		}
	}
}