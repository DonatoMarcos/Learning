package javaTraining;

import java.util.Scanner;

public class Mathematic {
	
	
	public static void main (String [] args) {
		
		int a, b, c;
		double x1, x2;
		double delta;
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		
		x1 = (-b  - Math.sqrt(Math.pow(b, 2) - (4 * a * c)))/(2 * a);
		x2 = (-b  + Math.sqrt(Math.pow(b, 2) - (4 * a * c)))/(2 * a);
		 System.out.printf("X1 = %.2f, X2 = %.2f", x1, x2);
	}

}
