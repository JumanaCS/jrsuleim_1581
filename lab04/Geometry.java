/*
Jumana Suleiman 
Problem 1: Geometry
*/

public class Geometry{
	public static double getAreaRectangle(double width, double length){
		return length * width;
	}	

	public static double getAreaCircle(double radius){
		return Math.PI * (Math.pow(radius, 2));
	}

	public static double getAreaTriangle(double base, double height){
		return (1.0/2.0) * (base * height);
	}

	public static double getPerimeterRectangle(double width, double length){
		return 2.0 * (length + width);
	}

	public static double getPerimeterCircle(double radius){
		return (2.0 * Math.PI) * radius;
	}

	public static double getPerimeterTriangle(double side1, double side2, double side3){
		return side1 + side2 + side3;
	}
}