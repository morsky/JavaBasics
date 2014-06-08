/* 10. Create a class Product to hold products, which have name (string) 
 * and price (decimal number). Read from a text file named "Products.txt" 
 * a list of product with prices and keep them in a list of products. Each
 * product will be in format name + space + price. You should hold the 
 * products in objects of class Product. Read from a text file named 
 * "Order.txt" an order of products with quantities. Each order line will 
 * be in format product + space + quantity. Calculate and print in a text 
 * file "Output.txt" the total price of the order. Ensure you close correctly
 *  all used resources.
 *  Examples:
 *  Products.txt	Order.txt	Output.txt
 *  milk 1.80		12 milk		70.6
 *  apple 3.20		3.2 coffee
 *  coffee 8.50		2 coffee
 *  				1.5 apple
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class _10_OrderOfProducts {

	public static void main(String[] args) {
		ArrayList<Product> products = new ArrayList<>();
		double sum = 0;
		
		sum = calculateFullPrice(readProducts(products), sum);
		
		writeToFile(sum);
		
		//System.out.printf("%.1f", sum);
	}

	public static ArrayList<Product> readProducts(ArrayList<Product> products) {
		try (BufferedReader fileReader = new BufferedReader(new FileReader(
				"lib/products10.txt"));) {
			String line = null;
			
			while ((line = fileReader.readLine()) != null) {
				String[] split = line.split(" ");
				Product pr = new Product();
				pr.setName(split[0]);
				pr.setPrice(Double.parseDouble(split[1]));
				products.add(pr);
			}
		
		} catch (IOException error) {
			System.out.println("Problem reading file!!");
		}
		
		return products;
	}
	
	public static double calculateFullPrice(ArrayList<Product> products,
			double sum) {
		try (BufferedReader fileReader = new BufferedReader(new FileReader("lib/order10.txt"));) {
			String line = null;
			
			while ((line = fileReader.readLine()) != null) {
				String[] fileContent = line.split(" ");
				
				for (Product product : products) {
					if (product.getName().equals(fileContent[1])) {
						double productPrice = product.getPrice();
						double quantity = Double.parseDouble(fileContent[0]);
						sum += productPrice * quantity;
					}
				}
			}
		} catch (IOException error) {
			System.out.println("Problem reading file!!");
		}
		return sum;
	}
	
	public static void writeToFile(double sum) {
		try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter("lib/output10.txt"));) {
			fileWriter.write(String.format("%.1f", sum));
	
			//fileWriter.close();
		} catch (Exception error) {
			System.out.println("Error writing file!!");
		}
	}
}