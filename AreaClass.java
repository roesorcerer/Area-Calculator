package Lab5;

import java.util.Scanner;

/**
@author Rowan Stratton 
 * Child class that completes the functions. 
 */
public class AreaClass extends AreaCalculator{
	Scanner get = new Scanner(System.in);
	//Implements the abstract method for circle calculation
	public void areaCircle(double a) {			
		//pulls from abstract method and calculates the area of a circle. 
		System.out.println("Enter the diameter of the circle:");
		a = get.nextDouble();		
		double circle = (a/2)*3.14; 
		System.out.println("The area of the circle is:" +circle);
		
	}
	
	//Implements the abstract method for triangle calculation 
	public void areaTriangle(double b, double c) {
		//pulls from the abstract method and calculates the area of a triangle. 
		System.out.println("Enter the base of the triangle:");
		b = get.nextDouble();
		System.out.println("Enter the vertical height of triangle:");
		c = get.nextDouble();
		double triangle = (b*c)/2;
		System.out.println("The area of the triangle is:" +triangle);
		
		
	}
	public static void main(String[] args) {
		//setting objects from methods. 
		AreaClass areaObj = new AreaClass();
		areaObj.areaCircle(0);
		areaObj.areaTriangle(0, 0);
		areaObj.areaRectangle(0, 0);
	}
}

