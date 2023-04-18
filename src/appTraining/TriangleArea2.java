package appTraining;

import java.util.Scanner;
import entities.Triangle;

public class TriangleArea2 {
	
	public static void main (String [] args) {
		
		Scanner sc = new Scanner (System.in);
		Double [] area = new Double[3];
    	
		for (int i = 1; i<3 ;i++) {
			System.out.print("\n Entre com os 3 lados do triangulo-"+i+": ");
	    	area[i] = new Triangle(sc.nextDouble(), sc.nextDouble(), sc.nextDouble()).area();
		}

		System.out.printf("\n Área1 = %.2f. Área2 = %.2f.  O maior triângulo é: %s",area[1], area[2],((area[1]>area[2])?"Triângulo-1":"Triângulo2"));
		sc.close();
	}

}
