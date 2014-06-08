import java.util.Scanner;

/* Write a program to check whether a point is inside or outside of the figure below.
 * The point is given as a pair of floating-point numbers, separated by a space. Your
 * program should print "Inside" or "Outside". Examples:
 * 	 Input		Output
 *   10 9.7		Outside
 *   12.5 6		Inside
 * 13.13 9.15	Inside
 *  21.3 5.5	Outside
  */

public class PointsInsideAFigure {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter point coordinates: ");
		String inputText = input.nextLine();
		String[] coordinates = inputText.split(" ");
		double pointX = Double.parseDouble(coordinates[0]);
		double pointY = Double.parseDouble(coordinates[1]);
		
		input.close();
		
        System.out.println(isInRectangle(pointX, pointY) ? "Inside" : "Outside");
	}
	
	public static boolean isInRectangle(double pointX, double pointY) {
		double rectangle1Left = 12.5;
		double rectangle1Top = 6;
		double rectangle1Width = 10;
		double rectangle1Height = 2.5;
		
		double rectangle2Left = 12.5;
		double rectangle2Top = 8.5;
		double rectangle2Width = 5;
		double rectangle2Height = 5;
		
		double rectangle3Left = 20;
		double rectangle3Top = 8.5;
		double rectangle3Width = 2.5;
		double rectangle3Height = 5;
		
		boolean inRect = 
				(pointX >= rectangle1Left) && (pointX <= rectangle1Left + rectangle1Width)
        		&& (pointY >= rectangle1Top) && (pointY <= rectangle1Top + rectangle1Height)
	            || (pointX >= rectangle2Left) && (pointX <= rectangle2Left + rectangle2Width)
        		&& (pointY >= rectangle2Top) && (pointY <= rectangle2Top + rectangle2Height)
	           	|| (pointX >= rectangle3Left) && (pointX <= rectangle3Left + rectangle3Width)
				&& (pointY >= rectangle3Top) && (pointY <= rectangle3Top + rectangle3Height);
		
		return inRect;
	}
}