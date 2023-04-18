package javaTraining;

import java.util.Scanner;

public class TesteFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print(" Fatorial de: ");
		int numero = sc.nextInt();
		double resultado = 1;
		for (int i=numero; i>1; i--) {
			resultado = resultado * i;
		}
        System.out.printf("Resultado"+": %e "+resultado,resultado);
        sc.close();
		
}

}
