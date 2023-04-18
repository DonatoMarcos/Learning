package appTraining;

import java.util.Locale;
import java.util.Scanner;

public class TestNumberVector {

	
	public static void main (String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Indicate number of elements in the group: ");
		int [] numeros = new int[sc.nextInt()];
		String textoSaida = "";
		
		for (int i=0; i<numeros.length; i++) {
			System.out.print("Number: ");
			numeros[i]= sc.nextInt();
		}

		for (int numero: numeros) {
			if (numero < 0)
				textoSaida = textoSaida + numero + " ,";
		}

		if (!textoSaida.isBlank())
			System.out.println("\nNegative numbers are: " + textoSaida.substring(0,textoSaida.length()-1));
		else
			System.out.println("\nNo negative numbers");
		
		sc.close();
	}
}
