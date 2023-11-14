# Lab5 Area Calculator Readme

## Overview
This Java program, `AreaClass`, is part of Lab5 and serves as a child class that extends the `AreaCalculator` class. It calculates the areas of various geometric shapes, including circles and triangles, by implementing abstract methods provided by its parent class. Additionally, it demonstrates how to use these methods to calculate and display the areas.

## Author
- Author: Rowan Stratton

## Usage
To use this code, follow these steps:

1. Clone or download the repository containing this code.

2. Open the code in a Java development environment, such as Eclipse or IntelliJ IDEA.

3. Run the `main` method in the `AreaClass` class to execute the program.

## Functionality

### `areaCircle(double a)`
This method calculates the area of a circle by taking the diameter as input from the user and using the formula: `Area = (π * (Diameter / 2)^2)`, where π is approximately 3.14.

### `areaTriangle(double b, double c)`
This method calculates the area of a triangle by taking the base and vertical height as inputs from the user and using the formula: `Area = (Base * Height) / 2`.

### `main(String[] args)`
The `main` method serves as the entry point of the program. It creates an instance of the `AreaClass`, calls the `areaCircle` and `areaTriangle` methods to calculate and display the areas of a circle and a triangle, and also demonstrates the use of other methods from the parent class (`AreaCalculator`), such as `areaRectangle`.

## Example Output
Here's an example of the program's output:

```
Enter the diameter of the circle:
5.0
The area of the circle is:7.85
Enter the base of the triangle:
4.0
Enter the vertical height of triangle:
3.0
The area of the triangle is:6.0
```


