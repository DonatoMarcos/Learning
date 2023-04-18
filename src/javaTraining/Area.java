package javaTraining;

import java.util.Locale;
import java.util.Scanner;

public class Area {
	
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Entre com a largura, comprimento e preço por metro: ");
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("\n AREA = %.2f %n",area);
		System.out.printf("PREÇO = %.2f",preco);
		
		sc.close();
		
		
	}

}
