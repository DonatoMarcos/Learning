package appTraining;

import java.util.Scanner;

import utils.Calculator;

public class TestRadius {
	
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the radius (cm): ");
		double radius = sc.nextDouble();
		
		System.out.printf("\nCircunference  = %.2f(cm) or  %.2f(m)",Calculator.circunferencia(radius),Calculator.circunferencia(radius)/100);
		System.out.printf("\nArea  = %.2f(cm2) or  %.4f(m2)",Calculator.area(radius),Calculator.area(radius)/10000);
		System.out.printf("\nVolumn  = %.2f(cm3) or  %.4f(m3)",Calculator.volume(radius),Calculator.volume(radius)/1000000);
		System.out.printf("\nPI constant = %.2f ",Calculator.PI);
		
		sc.close();
	}
	
}
