/* Write a program to generate n random hands of 5 different cards form a standard suit 
 * of 52 cards.
 */

import java.util.Random;
import java.util.Scanner;

public class _06_RandomHandsOfFiveCards {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			int repeatTimes = input.nextInt();
			
			input.close();
			
			Random randomNumber = new Random();
			String[] allCardsAndSuits = colectAllCards();
			StringBuilder result = new StringBuilder();
			
			for (int i = 0; i < repeatTimes; i++) {
				for (int j = 0; j < 5; j++) {
					String addValue = allCardsAndSuits[randomNumber.nextInt(52)];
					int chechLenght = result.length() - (addValue.length() * j);
					
					if (result.indexOf(addValue, chechLenght) != -1) {
						j--;
						continue;
					}
					
					result.append(addValue);
				}
				
				result.append("\n");
			}
			
			System.out.println(result);
			
//			for (String item : allCardsAndSuits) {
//				System.out.print(item);
//			}
	}

	public static String[] colectAllCards() {
		String[] cardFace = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K" };
		String[] cardsSuit = { "♣ ", "♦ ", "♥ ", "♠ " };
		String[] allCardsAndSuits = new String[52];
		int count = 0;
		
		for (int i = 0; i < cardsSuit.length; i++) {
			for (int j = 0; j < cardFace.length; j++) {
				allCardsAndSuits[count] = cardFace[j] + cardsSuit[i];
				count++;
				
				if (count == 52) {
					break;
				}
			}
		}
		return allCardsAndSuits;
	}
}