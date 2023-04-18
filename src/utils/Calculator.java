package utils;

public class Calculator {
	
	public static final double PI = 3.1416;
	
	public static double circunferencia(double radius) {
		return 2 * PI * radius;
	}

	public static double area (double radius) {
		return PI * Math.pow(radius, 2);
	}

	public static double volume (double radius) {
		return (4.0 / 3.0 )* PI * Math.pow(radius, 3);
	}
}
