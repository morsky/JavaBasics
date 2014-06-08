/* Write a program to check whether a point is inside or outside the house below.
 * The point is given as a pair of floating-point numbers, separated by a space.
 * Your program should print "Inside" or "Outside". Examples:
 * 	  Input		Output
 *   10 9.7		Outside
 *   12.5 6		Inside
 * 19.693 13.4	Outside
 *   21 13.5	Inside
 */

import java.util.Scanner;

public class PointsInsideIheHouse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter point coordinates: ");
		String inputText = input.nextLine();
		String[] coordinates = inputText.split(" ");
		double pointX = Double.parseDouble(coordinates[0]);
		double pointY = Double.parseDouble(coordinates[1]);
		
		input.close();
				 
		System.out.println(inRectangle(pointX, pointY) || inTriangle(pointX, pointY) ? "Inside" : "Outside");
	}
	
	public static boolean inRectangle(double pointX, double pointY) {
		double rectangle1Left = 12.5;
		double rectangle1Top = 8.5;
		double rectangle1Width = 5;
		double rectangle1Height = 5;
		
		double rectangle2Left = 20;
		double rectangle2Top = 8.5;
		double rectangle2Width = 2.5;
		double rectangle2Height = 5;
		
		boolean inRect = 
				(pointX >= rectangle1Left) && (pointX <= rectangle1Left + rectangle1Width)
        		&& (pointY >= rectangle1Top) && (pointY <= rectangle1Top + rectangle1Height)
	           	|| (pointX >= rectangle2Left) && (pointX <= rectangle2Left + rectangle2Width)
				&& (pointY >= rectangle2Top) && (pointY <= rectangle2Top + rectangle2Height);
		
		return inRect;
	}
	
	public static boolean inTriangle(double pointX, double pointY) {
		double triangleP1X = 17.5;
		double triangleP1Y = 3.5;
		double triangleP2X = 12.5;
		double triangleP2Y = 8.5;
		double triangleP3X = 22.5;
		double triangleP3Y = 8.5;
		
		double alpha = ((triangleP2Y - triangleP3Y)*(pointX - triangleP3X) 
				+ (triangleP3X - triangleP2X)*(pointY - triangleP3Y))
				/ ((triangleP2Y - triangleP3Y)*(triangleP1X - triangleP3X)
				+(triangleP3X - triangleP2X)*(triangleP1Y - triangleP3Y));
		double beta = ((triangleP3Y - triangleP1Y)*(pointX - triangleP3X)
				+ (triangleP1X - triangleP3X)*(pointY - triangleP3Y))
				/ ((triangleP2Y - triangleP3Y)*(triangleP1X - triangleP3X)
				+ (triangleP3X - triangleP2X)*(triangleP1Y - triangleP3Y));
		double gamma = 1.0 - alpha - beta;
		
		boolean inTriangle = alpha >= 0 && alpha <= 1
							 && beta >= 0 && beta <= 1
							 && gamma >= 0 && gamma <= 1;
							
		return inTriangle;
	}
}