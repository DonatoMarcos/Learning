package appTraining;

import java.util.Scanner;

public class TestRadius2 {
	
	public static final double PI = 3.1416;
	
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the radius (cm): ");
		double radius = sc.nextDouble();
		
		System.out.printf("\nCircunference  = %.2f(cm) or  %.2f(m)",circunferencia(radius),circunferencia(radius)/100);
		System.out.printf("\nArea  = %.2f(cm2) or  %.4f(m2)",area(radius),area(radius)/10000);
		System.out.printf("\nVolumn  = %.2f(cm3) or  %.4f(m3)",volume(radius),volume(radius)/1000000);
		System.out.printf("\nPI constant = %.2f ",PI);
		
		sc.close();
	}
	
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
