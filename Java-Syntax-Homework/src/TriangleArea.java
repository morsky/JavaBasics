/* Write a program that enters 3 points in the plane (as integer x and y coordinates),
 * calculates and prints the area of the triangle composed by these 3 points. Round the
 * result to a whole number. In case the three points do not form a triangle, print "0"
 * as result. Examples:
 *  Input	Output		Input	Output
 * -5 10	575			 1 1	0
 * 25 30				 2 2
 * 60 15				 3 3
 */
import java.util.Scanner;

public class TriangleArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter point coordinates separated by space:");
		String inputA = input.nextLine();
		String[] coordinatesA = inputA.split(" ");
		int pointAX = Integer.parseInt(coordinatesA[0]);
		int pointAY = Integer.parseInt(coordinatesA[1]);
		
		String inputB = input.nextLine();
		String[] coordinatesB = inputB.split(" ");
		int pointBX = Integer.parseInt(coordinatesB[0]);
		int pointBY = Integer.parseInt(coordinatesB[1]);
		
		String inputC = input.nextLine();
		String[] coordinatesC = inputC.split(" ");
		int pointCX = Integer.parseInt(coordinatesC[0]);
		int pointCY = Integer.parseInt(coordinatesC[1]);
		
		input.close();
		
		int area = (pointAX * (pointBY - pointCY) +
					 pointBX * (pointCY - pointAY) +
					 pointCX * (pointAY - pointBY)) / 2;
		
		if (area < 0) {
			area *= -1;
		}
		
		System.out.println(area);
	}
}