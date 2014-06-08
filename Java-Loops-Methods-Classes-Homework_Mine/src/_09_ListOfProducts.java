/* 9. Create a class Product to hold products, which have name (string) and price (decimal number).
 * Read from a text file named "Input.txt" a list of products. Each product will be in format
 * name + space + price. You should hold the products in objects of class Product. Sort the products
 * by price and write them in format price + space + name in a file named "Output.txt".
 * Ensure you close correctly all used resources. 
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class _09_ListOfProducts {

	public static void main(String[] args) {
		ArrayList<Product> products = new ArrayList<>();
		
		try (BufferedReader fileReader = new BufferedReader(new FileReader(
				"lib/input0901.txt"));) {
			String line = null;
			
			while ((line = fileReader.readLine()) != null) {
				String[] split = line.split(" ");
				Product pr = new Product();
				pr.setName(split[0]);
				pr.setPrice(Double.parseDouble(split[1]));
				products.add(pr);
			}
			
			Collections.sort(products);
			
			BufferedWriter fileWriter = new BufferedWriter(new FileWriter("lib/output09.txt"));
			
			for (Product product : products) {
				fileWriter.write(String.format("%.2f %s", product.getPrice(), product.getName()));
				fileWriter.newLine();
			}
			
			fileWriter.close();
			
		} catch (IOException error) {
			System.out.println("Problem reading file!!");
		}
	}
}