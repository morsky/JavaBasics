/* Write a program to generate a PDF document called Deck-of-Cards.pdf and print in it
 * a standard deck of 52 cards, following one after another. Each card should be a 
 * rectangle holding its face and suit. A few examples are shown below:
 * 
 * A ♠		2 ♥		Q ♦		K ♣		J ♦		9 ♦		7 ♠
 * 
 * You are free to choose the size of each card, the spacing between the cards,
 * how many cards to put in each line, etc. 
 * Note: you will need to use an external Java library for creating PDF documents.
 * Find some in Internet. Put your JAR files in a folder called "lib" (this is a
 * standard approach in Java projects) and reference them in the build path.
 * Hint: solve the problem step by step:
 * 1. Generate the deck of cards and print it at the console (the console in Eclipse
 * fully supports Unicode).
 * 2. Find a Java library for generating PDF documents and play with it. Try to print 
 * some string in a PDF document.
 * 3. Print the cards in PDF file (without the rectangular border).
 * 4. Try to change the colors of the red cards.
 * 5. Try to add the rectangular border around each card, e.g. by putting tables in the
 * PDF.
 */

package createPdf;

import java.io.FileOutputStream;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class GenerateAPDFByExternalLibrary {

	public static void main(String[] args) {
		try {
			Document file = new Document();
			PdfWriter.getInstance(file, new FileOutputStream("Deck-of-Cards.pdf"));
			file.open();
			
			PdfPTable table = new PdfPTable(4);
			table.setWidthPercentage(100);
			table.getDefaultCell().setFixedHeight(180);
			table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
		    table.getDefaultCell().setVerticalAlignment(Element.ALIGN_MIDDLE);
		    			
			BaseFont baseFont = BaseFont.createFont("font/ARIAL.TTF", BaseFont.IDENTITY_H, true);
			Font black = new Font(baseFont, 70f, 0, BaseColor.BLACK);
			Font red = new Font(baseFont, 70f, 0, BaseColor.RED);
			
			String[] cardSuit = new String[]
					{"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
			String[] type = new String[] {"♣", "♦", "♥", "♠"};
			
			for (int i = 0; i < type.length; i++) {
				for (int j = 0; j < cardSuit.length; j++) {
					//System.out.print(cardSuit[j] + type[i]);
					if (i == 0 || i == 3) {
						table.addCell(new Paragraph(cardSuit[j] + type[i], black));
					}
					else {
						table.addCell(new Paragraph(cardSuit[j] + type[i], red));
					}
				}
			}
			
			file.add(table);
			file.close();	

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}