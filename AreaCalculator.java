package Lab5;

import java.util.Scanner;

/**
 *Abstract class with one regular method. 
 * @author Rowan Stratton 
 *
 */
public abstract class AreaCalculator {
	//Abstract method with no body
	public abstract void areaCircle(double a);
	
	//Abstract method with no body
	public abstract void areaTriangle(double b, double c);
	
	//Regular method
	public void areaRectangle(double width, double height) {
		//body of method that asks for user input and calculates the area of a rectangle. 
		Scanner get = new Scanner(System.in);	
		System.out.println("Enter the width of the rectangle:");
		width = get.nextDouble();
		System.out.println("Enter the height of the rectangle:");
		height = get.nextDouble();
		double rectangle = width*height;
		System.out.println("The area of the rectangle is:" +rectangle);
		get.close();
		
	}
	
}