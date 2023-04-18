package appTraining;

import java.util.Scanner;

public class TriangleArea {
	
	Double [] lado;
	Double [] area;
	Scanner sc;
	
	public TriangleArea() {
		sc = new Scanner(System.in);
		lado = new Double [10];
		area = new Double [10];
	}
	
	public void enterData (Integer numberTriangle) {
		System.out.print("\n Entre com os 3 lados do triangulo-"+numberTriangle+": ");
		lado[3 * numberTriangle+ 1] = sc.nextDouble();
		lado[3 * numberTriangle+ 2] = sc.nextDouble();
		lado[3 * numberTriangle+ 3] = sc.nextDouble();
	}
	
	public Double calculateArea (Integer index) {
		double aux, area;
		int idx1 = 3 * index + 1;
		int idx2 = 3 * index + 2;
		int idx3 = 3 * index + 3;
		
		aux = (lado[idx1] + lado[idx2] + lado[idx3])/2;
		area = Math.sqrt(aux*(aux-lado[idx1])*(aux-lado[idx2])*(aux-lado[idx3]));
		return area;
	}
	
	public static void main (String [] args) {
		
		TriangleArea teste = new TriangleArea();
		
		for (int i=1; i<=2; i++) {
			teste.enterData(i);
			teste.area[i] = teste.calculateArea(i);
		}
		
		System.out.printf("\nÁrea1 = %.2f. Área2 = %.2f.  O maior triângulo é: %s",teste.area[1], teste.area[2],((teste.area[1]>teste.area[2])?"Triângulo-1":"Triângulo2"));
		
		teste.sc.close();
	}

}
