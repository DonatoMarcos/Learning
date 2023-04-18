package javaTraining;

import java.util.Scanner;

public class Ternario1 {

	
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print(" Digite 2 números: ");
		int numero1 = sc.nextInt();
		int numero2 = sc.nextInt();
		sc.nextLine();
		
		String resultado = (numero1 > numero2) ? ("Primeiro Valor maior que Segundo Valor") : ("Segundo Valor maior que Primeiro Valor");
		System.out.println(resultado);
		
		
		sc.close();
	}
}
